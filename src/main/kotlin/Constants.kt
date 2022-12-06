class Constants {
    companion object {
        const val ROCK = "ROCK"
        const val PAPER = "PAPER"
        const val SCISSORS = "SCISSORS"
        private const val BASE_PATH = "E:\\Advent\\"
        fun getFullPath(fileName: String): String = "$BASE_PATH$fileName.txt"
    }
}