val sites = mapOf(
  "pragprog" to "https://www.pragprog.com",
  "agiledeveloper" to "https://agiledeveloper.com"
)

println(sites)
println(sites.size)
println(sites.containsKey("agiledeveloper"))
println(sites.containsValue("http://www.example.com"))
println(sites.contains("agiledeveloper"))
println("agiledeveloper" in sites)

val pragProgSite: String? = sites.get("pragprog")
val pp2: String? = sites["pragprog"]

println("pragProgSite is $pragProgSite")
println("pp2 is $pp2")

val agiledeveloper =
  sites.getOrDefault("agiledeveloper", "http://www.example.com")

println("agiledeveloper is $agiledeveloper")

val sitesWithExample = sites + ("example" to "http://www.example.com")
println("sitesWithExample is $sitesWithExample")

val withoutAgileDeveloper = sites - "agiledeveloper"
println("withoutAgileDeveloper is $withoutAgileDeveloper")

println("Will iterate sites")

for ((key, value) in sites) {
  println("${key} --- ${value}")
}
