val array = arrayOf(1, 2, 3)
println(array.javaClass)
for (e in array) { print("$e, ") }
println()

val names = listOf("Tom", "Jerry", "Spike")
for (index in names.indices) {
  println("Position of ${names.get(index)} is $index")
}

println()

for ((index, name) in names.withIndex()) {
  println("Position of $name is $index")
}
