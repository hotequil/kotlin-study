enum class PaymentStatus{
	WAITING_PAYMENT,
    NOT_PAID,
    PAID
}

enum class LifeStatus(val status: String){
    LIVE("Live"),
    DEAD("Dead")
}

fun calculateImc(weight: Double, height: Double): String {
    return "Your IMC is ${String.format("%.2f", weight / (height * height))}"
}

fun main() {
    var age = 20
    
    println(age)
    
    age = 19
    
    println(age)
    
    if(age >= 18){
        println("You can buy a fire gun")
    } else{
        println("You can't buy a fire gun")
    }
    
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
    
    var languages = HashSet<String>()
    
    languages.add("Kotlin")
    languages.add("JavaScript")
    languages.add("Kotlin")
    languages.add("JavaScript")
    
    println(languages)
    println(languages.count())
    println(languages.contains("Kotlin"))
    println(languages.contains("JavaScript"))
    println(languages.contains("Rust"))
    
    var fruits = HashMap<Int, String>()
    var fruitsList = mapOf(Pair(12, "Banana"), Pair(18, "Kiwi"))
    
    fruits.putAll(fruitsList)
    fruits.put(6, "Melon")
    
    println(fruits)
    println(fruits.count())
    println(fruits.isEmpty())
    
    fruits.remove(12)
    fruits.remove(6)
    
    println(fruits)
    println(fruits.count())
    println(fruits.isEmpty())
    
    fruits.remove(18)
    
    println(fruits)
    println(fruits.count())
    println(fruits.isEmpty())
    
    val carPrice = 8000
    
    if(carPrice >= 10000) println("Your car is expensive")
    else if(carPrice >= 5000) println("Your car has good price")
    else println("Your car is cheap")
    
    val favoriteNumber = 7
    
    when(favoriteNumber % 2){
        0 -> println("Your favorite number is even")
        1 -> println("Your favorite number is odd")
    }
    
    var firstNumber: Int? = null
    var secondNumber: Int = firstNumber ?: 0
    
    println(secondNumber)
    
    for(firstIndex in 1..3) println("First index is $firstIndex")    
    for(secondIndex in 0 until 5) println("Second index is $secondIndex")
    
    val values = ArrayList<Int>()
    
    values.add(20)
    values.add(5)
    values.add(10)
    values.add(25)
    values.add(15)    
    
    for(value in values) println("Value is $value")
    
    var counter = 0
    val limit = 10
    
    while(counter < limit){
        println("Counter is $counter, it's smaller than $limit")
        counter++
    }
    
    println("Counter is $counter, it's equal to $limit")
    
    val paymentStatus = PaymentStatus.PAID
    
    when(paymentStatus){
        PaymentStatus.WAITING_PAYMENT -> println("Waiting payment")
        PaymentStatus.NOT_PAID -> println("Not paid")
        PaymentStatus.PAID -> println("Paid")
    }
    
    println(LifeStatus.LIVE)
    println(LifeStatus.DEAD)    
    
    println(LifeStatus.LIVE.status)
    println(LifeStatus.DEAD.status)
    
    println(calculateImc(78.5, 1.8))
}
