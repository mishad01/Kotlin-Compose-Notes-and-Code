package com.example.tipcalculatorapp

import android.os.Bundle
import android.transition.Slide
import android.util.Log
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tipcalculatorapp.components.InputField
import com.example.tipcalculatorapp.ui.theme.TipCalculatorAppTheme
import com.example.tipcalculatorapp.utils.calculateTotalTip
import com.example.tipcalculatorapp.widgets.RoundIconButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    TipCalculatorAppTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            MainContent()
        }
    }
}

@Composable
fun TopHeader(totalPerPerson: Double = 133.00) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(RoundedCornerShape(corner = CornerSize(12.dp))),
        color = Color(0xFFE9D7F7)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Total Per Person", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "$${"%.2f".format(totalPerPerson)}",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopHeader()
        Spacer(modifier = Modifier.height(20.dp))
        BillForm { enteredAmount ->
            println("Bill entered: $enteredAmount")
        }
    }
}

@Composable
fun BillForm(onValueChanged: (String) -> Unit = {}) {
    val totalBillState = remember { mutableStateOf("") }
    val isValid = totalBillState.value.trim().isNotEmpty()
    val keyboardController = LocalSoftwareKeyboardController.current

    val sliderPositionState = remember { mutableFloatStateOf(0f) }
    val tipPercentage = (sliderPositionState.value * 100).toInt()
    val tipAmountState = remember { mutableStateOf(0.0) }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        border = BorderStroke(1.dp, Color.LightGray)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            InputField(
                valueState = totalBillState,
                labelId = "Enter Bill",
                enabled = true,
                isSingleLine = true,
                onAction = KeyboardActions(
                    onDone = {
                        if (!isValid) return@KeyboardActions
                        onValueChanged(totalBillState.value.trim())
                        keyboardController?.hide()
                    }
                )
            )

            val count = remember { mutableStateOf(0) };
            Row(modifier = Modifier.padding(3.dp), horizontalArrangement = Arrangement.Start) {
                Text("Split", modifier = Modifier.align(alignment = Alignment.CenterVertically))
                Spacer(modifier = Modifier.width(120.dp))
                Row(
                    modifier = Modifier.padding(3.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    RoundIconButton(
                        imageVector = Icons.Default.Remove,
                        onClick = {
                            if (count.value > 0) {
                                count.value -= 1
                            } else {
                                count.value = 0;
                            }
                        },
                        backgroundColor = Color.White,
                    )
                    Text(
                        count.value.toString(),
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 9.dp, end = 9.dp)
                    )
                    RoundIconButton(
                        imageVector = Icons.Default.Add,
                        onClick = {
                            if (count.value >= 0) {
                                count.value += 1
                            } else {
                                count.value = 0;
                            }
                        },
                        backgroundColor = Color.White,
                    )
                }
            }


            //Tip Row
            Row(modifier = Modifier.padding(horizontal = 3.dp, vertical = 12.dp)) {
                Text("Text", modifier = Modifier.align(alignment = Alignment.CenterVertically))
                Spacer(modifier = Modifier.width(200.dp))
                Text("${tipAmountState.value}", modifier = Modifier.align(alignment = Alignment.CenterVertically))
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("$tipPercentage%")
                Spacer(modifier = Modifier.height(14.dp))

                //Slider
                Slider(
                    value = sliderPositionState.value,
                    onValueChange = { newVal ->
                        sliderPositionState.value = newVal
                        tipAmountState.value = calculateTotalTip(
                            totalBill = totalBillState.value.toDouble(),
                            tipPercentage = tipPercentage
                        )
                    },
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    steps = 5,
                    onValueChangeFinished = {

                    }
                )
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}
