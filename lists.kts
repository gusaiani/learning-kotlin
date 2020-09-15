val fruits: List<String> = listOf("Apple", "Banana", "Grape")
println(fruits)
println("first's ${fruits[0]}, that's ${fruits.get(0)}")

println(fruits.contains("Apple"))
println("Apple" in fruits)

val fruits2 = fruits + "Orange"
println(fruits2)

val noBanana = fruits - "Banana"
println(noBanana)
