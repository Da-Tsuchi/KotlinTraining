fun main() {
    val song = Song("aa", "bb", 2024, 10)
    println(song.isPopular)
    song.describeSong()
}

class Song(
    val title: String,
    val artist: String,
    val releaseYear: Int,
    val num: Int
) {
    val isPopular: Boolean
    	get() = num >= 1000
    
    fun describeSong() {
        println("$title, performed by $artist, was released in $releaseYear")
    }
}