package com.example.movieapp.model

import android.provider.MediaStore.Audio.Genres
import java.time.Year

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genres: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val image:List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "1",
            title = "Inception",
            year = "2010",
            genres = "Action, Sci-Fi, Thriller",
            director = "Christopher Nolan",
            actors = "Leonardo DiCaprio, Joseph Gordon-Levitt, Elliot Page",
            plot = "A thief who steals corporate secrets through dream-sharing tech is given the inverse task of planting an idea.",
            poster = "https://m.media-amazon.com/images/I/51zUbui+gbL._AC_.jpg",
            image = listOf(
                "https://m.media-amazon.com/images/I/91EBpJxO9fL._AC_SY679_.jpg",
                "https://m.media-amazon.com/images/I/81p+xe8cbnL._AC_SY679_.jpg",
                "https://m.media-amazon.com/images/I/91EBpJxO9fL._AC_SY679_.jpg",
                "https://m.media-amazon.com/images/I/81p+xe8cbnL._AC_SY679_.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "2",
            title = "The Shawshank Redemption",
            year = "1994",
            genres = "Drama",
            director = "Frank Darabont",
            actors = "Tim Robbins, Morgan Freeman, Bob Gunton",
            plot = "Two imprisoned men bond over the years, finding solace and eventual redemption through acts of common decency.",
            poster = "https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/5cIUvCJQ2aNPXRCmXiOIuJJxIki.jpg",
                "https://image.tmdb.org/t/p/w500/j9XKiZrVeViAixVRzCta7h1VU9W.jpg"
            ),
            rating = "9.3"
        ),
        Movie(
            id = "3",
            title = "The Matrix",
            year = "1999",
            genres = "Action, Sci-Fi",
            director = "The Wachowskis",
            actors = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
            plot = "A hacker learns about the reality of his world and his role in the war against its controllers.",
            poster = "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/7u3pxc0K1wx32IleAkLv78MKgrw.jpg",
                "https://image.tmdb.org/t/p/w500/9TGHDvWrqKBzwDxDodHYXEmOE6J.jpg"
            ),
            rating = "8.7"
        ),
        Movie(
            id = "4",
            title = "Interstellar",
            year = "2014",
            genres = "Adventure, Drama, Sci-Fi",
            director = "Christopher Nolan",
            actors = "Matthew McConaughey, Anne Hathaway, Jessica Chastain",
            plot = "Explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            poster = "https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/rAiYTfKGqDCRIIqo664sY9XZIvQ.jpg",
                "https://image.tmdb.org/t/p/w500/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg"
            ),
            rating = "8.6"
        ),
        Movie(
            id = "5",
            title = "Fight Club",
            year = "1999",
            genres = "Drama",
            director = "David Fincher",
            actors = "Brad Pitt, Edward Norton, Helena Bonham Carter",
            plot = "An office worker and a soap maker form an underground fight club that evolves into something much more.",
            poster = "https://image.tmdb.org/t/p/w500/bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/8kNruSfhk5IoE4eZOc4UpvDn6tq.jpg",
                "https://image.tmdb.org/t/p/w500/2lECpi35Hnbpa4y46JX0aY3AWTy.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "6",
            title = "The Dark Knight",
            year = "2008",
            genres = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
            plot = "Batman faces the Joker, who causes chaos and challenges Batman's moral code.",
            poster = "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/hqkIcbrOHL86UncnHIsHVcVmzue.jpg",
                "https://image.tmdb.org/t/p/w500/9myrRcegWGGp24mpVfkD4zhUfhi.jpg"
            ),
            rating = "9.0"
        ),
        Movie(
            id = "7",
            title = "Forrest Gump",
            year = "1994",
            genres = "Drama, Romance",
            director = "Robert Zemeckis",
            actors = "Tom Hanks, Robin Wright, Gary Sinise",
            plot = "The life journey of a man with a low IQ who witnesses and influences historical events.",
            poster = "https://image.tmdb.org/t/p/w500/saHP97rTPS5eLmrLQEcANmKrsFl.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/4f2t6r3E7zF1g1rW9eGzj1V2G3.jpg",
                "https://image.tmdb.org/t/p/w500/ctOEhQiFIHWkiaYp7b0ibSTe5IL.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "8",
            title = "Parasite",
            year = "2019",
            genres = "Drama, Thriller",
            director = "Bong Joon Ho",
            actors = "Kang-ho Song, Sun-kyun Lee, Yeo-jeong Jo",
            plot = "Greed and class discrimination threaten the bond between a poor family and a wealthy one.",
            poster = "https://image.tmdb.org/t/p/w500/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/ApiBzeaa95TNYliSbQ8pJv4Fje7.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            ),
            rating = "8.6"
        ),
        Movie(
            id = "9",
            title = "Gladiator",
            year = "2000",
            genres = "Action, Adventure, Drama",
            director = "Ridley Scott",
            actors = "Russell Crowe, Joaquin Phoenix, Connie Nielsen",
            plot = "A former Roman general sets out to exact vengeance against the corrupt emperor who murdered his family.",
            poster = "https://image.tmdb.org/t/p/w500/ty8TGRuvJLPUmAR1H1nRIsgwvim.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/6WBIzCgmDCYrqh64yDREGeDk9d3.jpg",
                "https://image.tmdb.org/t/p/w500/9i3plLl89DHMz7mahksDaAo7HIS.jpg"
            ),
            rating = "8.5"
        ),
        Movie(
            id = "10",
            title = "The Godfather",
            year = "1972",
            genres = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Marlon Brando, Al Pacino, James Caan",
            plot = "The aging patriarch of an organized crime dynasty transfers control to his reluctant son.",
            poster = "https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
            image = listOf(
                "https://image.tmdb.org/t/p/w500/rSPw7tgCH9c6NqICZef4kZjFOQ5.jpg",
                "https://image.tmdb.org/t/p/w500/6xKCYgH16UuwEGAyroLU6p8HLIn.jpg"
            ),
            rating = "9.2"
        )
    )
}
