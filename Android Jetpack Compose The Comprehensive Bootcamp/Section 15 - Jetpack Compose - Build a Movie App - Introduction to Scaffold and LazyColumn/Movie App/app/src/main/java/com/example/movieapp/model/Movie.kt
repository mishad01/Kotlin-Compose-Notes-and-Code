package com.example.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val rating: String,
    val plot: String,
    val poster: String,
    val images: List<String>
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "1",
            title = "The Shawshank Redemption",
            year = "1994",
            genre = "Drama",
            director = "Frank Darabont",
            actors = "Tim Robbins, Morgan Freeman, Bob Gunton",
            rating = "9.3",
            plot = "Two imprisoned men bond over a number of years...",
            poster = "https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
                "https://image.tmdb.org/t/p/w500/iNh3BivHyg5sQRPP1KOkzguEX0H.jpg",
                "https://image.tmdb.org/t/p/w500/3RfvR1xz5kkXmGVqplS3xc4D7P9.jpg"
            )
        ),
        Movie(
            id = "2",
            title = "The Godfather",
            year = "1972",
            genre = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Marlon Brando, Al Pacino, James Caan",
            rating = "9.2",
            plot = "The aging patriarch of an organized crime dynasty...",
            poster = "https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
                "https://image.tmdb.org/t/p/w500/rSPw7tgCH9c6NqICZef4kZjFOQ5.jpg",
                "https://image.tmdb.org/t/p/w500/d1CgfWJgJoJc0o6XLq3v0qYqDEI.jpg"
            )
        ),
        Movie(
            id = "3",
            title = "The Dark Knight",
            year = "2008",
            genre = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
            rating = "9.0",
            plot = "When the menace known as the Joker wreaks havoc...",
            poster = "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
                "https://image.tmdb.org/t/p/w500/1hRoyzDtpgMU7Dz4kB22Kh8vnlv.jpg",
                "https://image.tmdb.org/t/p/w500/vzvKcPQ4o7TjWeGIn0aGC9FeVNu.jpg"
            )
        ),
        Movie(
            id = "6",
            title = "Fight Club",
            year = "1999",
            genre = "Drama",
            director = "David Fincher",
            actors = "Brad Pitt, Edward Norton, Helena Bonham Carter",
            rating = "8.8",
            plot = "An insomniac office worker and a soap maker form an underground fight club that evolves into something much more.",
            poster = "https://image.tmdb.org/t/p/w500/bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg",
                "https://image.tmdb.org/t/p/w500/8kNruSfhk5IoE4eZOc4UpvDn6tq.jpg",
                "https://image.tmdb.org/t/p/w500/fCayJrkfRaCRCTh8GqN30f8oyQF.jpg"
            )
        ),
        Movie(
            id = "7",
            title = "Forrest Gump",
            year = "1994",
            genre = "Drama, Romance",
            director = "Robert Zemeckis",
            actors = "Tom Hanks, Robin Wright, Gary Sinise",
            rating = "8.8",
            plot = "The presidencies of Kennedy and Johnson, the Vietnam War, and more through the eyes of an Alabama man with a low IQ.",
            poster = "https://image.tmdb.org/t/p/w500/saHP97rTPS5eLmrLQEcANmKrsFl.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/saHP97rTPS5eLmrLQEcANmKrsFl.jpg",
                "https://image.tmdb.org/t/p/w500/4fZ2iT5VA7dYTgRpu4dQ9FQoypF.jpg",
                "https://image.tmdb.org/t/p/w500/dUlLoCz0siJPoPeuqTLu2fZ8HSL.jpg"
            )
        ),
        Movie(
            id = "8",
            title = "Interstellar",
            year = "2014",
            genre = "Adventure, Drama, Sci-Fi",
            director = "Christopher Nolan",
            actors = "Matthew McConaughey, Anne Hathaway, Jessica Chastain",
            rating = "8.6",
            plot = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            poster = "https://image.tmdb.org/t/p/w500/rAiYTfKGqDCRIIqo664sY9XZIvQ.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/rAiYTfKGqDCRIIqo664sY9XZIvQ.jpg",
                "https://image.tmdb.org/t/p/w500/8i6ZDk97Vyh0jHohMG4vFeFuKJh.jpg",
                "https://image.tmdb.org/t/p/w500/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg"
            )
        ),
        Movie(
            id = "9",
            title = "The Matrix",
            year = "1999",
            genre = "Action, Sci-Fi",
            director = "Lana Wachowski, Lilly Wachowski",
            actors = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
            rating = "8.7",
            plot = "A computer hacker learns about the true nature of reality and his role in the war against its controllers.",
            poster = "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
                "https://image.tmdb.org/t/p/w500/7u3pxc0K1wx32IleAkLv78MKgrw.jpg",
                "https://image.tmdb.org/t/p/w500/aoyVbH8T6zB3h3UpkSnLBzME2Ug.jpg"
            )
        ),
        Movie(
            id = "10",
            title = "The Lord of the Rings: The Fellowship of the Ring",
            year = "2001",
            genre = "Action, Adventure, Fantasy",
            director = "Peter Jackson",
            actors = "Elijah Wood, Ian McKellen, Orlando Bloom",
            rating = "8.8",
            plot = "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring.",
            poster = "https://image.tmdb.org/t/p/w500/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg",
                "https://image.tmdb.org/t/p/w500/7grv5ULlK9wMr2T1fkgrl5q3WgA.jpg",
                "https://image.tmdb.org/t/p/w500/3NLass1FQqWruNYCu9Zx4DTZOkN.jpg"
            )
        )
    )
}
