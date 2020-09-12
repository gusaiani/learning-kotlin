fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) = when {
  numberOfLiveNeighbors < 2 -> false
  numberOfLiveNeighbors > 3 -> false
  numberOfLiveNeighbors == 3 -> true
  else -> alive && numberOfLiveNeighbors == 2
}

println(isAlive(true, 3))

fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
  "Saturday", "Sunday" -> "Relax"
  in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
  in 2..4 -> "Work hard"
  "Friday" -> "Party"
  is String ->  "What?"
  else -> "No clue"
}

println(whatToDo(dayOfWeek = "Friday"))

fun systemInfo(): String {
  val numberOfCores = Runtime.getRuntime().availableProcessors()

  return when (numberOfCores) {
    1 -> "1 core, packing this one to the museum"
    in 2..16 -> "You have $numberOfCores cores"
    else -> "$numberOfCores cores!, I want your machine"
  }
}

println(systemInfo())

fun systemInfoTwo(): String =
when (val numberOfCores = Runtime.getRuntime().availableProcessors()) {
  1 -> "1 core"
  in 2..16 -> "a reasonable number of cores for 2020"
  else -> "wow, what a great $numberOfCores"
}

println(systemInfoTwo())
