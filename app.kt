fun main() {
    var age = 20
    
    println(age)
    
    age = 19
    
    println(age)
    
    val productPrice = 50.9
    val city = "Pomerode"
    
    println(productPrice)
    println(city)
    
    var children: Int = 4
    
    println(children)
    
    var height: Double = 1.8
    
    println(height)
    
    var isMarried = true
    
    println(isMarried)
    
    var hasHouse: Boolean = true
    
    println(hasHouse)
    
    var name = "João Paulo"
    var surname: String = "Hotequil"
    
    println(name)
    println(surname)
    println(name.uppercase())
    println(surname.lowercase())
    
    var gender: Char = 'M'
    
    println(gender)
    
    var (address, number) = Pair("Street", 150)
    
    println(address)
    println(number)
    
    var myData: Int? = null
    
    println(myData)
    
    myData = 10
    
    println(myData)
    
    var numbers = arrayOf(1, 2, 3, 4)
    
    println(numbers)
  	println(numbers[0])
    println(numbers[1])
    println(numbers[2])
    println(numbers[3])
    println(numbers.isEmpty())
    println(numbers.count())
    
    var cities = arrayOf(city, "Blumenau", "Gaspar")
    
    println(cities)
    println(cities[0])
    println(cities[1])
    println(cities[2])
    println(cities.isEmpty())
    println(cities.count())
    
    var names = ArrayList<String>()
    
    println(names)
    println(names.isEmpty())
    println(names.count())
    
    names.add("Deborah")
    names.add("João")
    
    println(names)
    println(names[0])
    println(names[1])
    println(names.isEmpty())
    println(names.count())

    names[1] = "João Paulo"
    
    println(names[1])
}
