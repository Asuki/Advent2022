import calendar.Calendar

fun main() {
    for (day in Calendar().getDays()) {
        println(day)
    }
}

