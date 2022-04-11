fun main(){
   Name("Shaina","Timothy","Teresia","Violet")
    city()
    calculate()
    var x=names("MUM","DAD","SIBLINGS")
    println(x.contentToString())
    var z=multiply(arrayOf(2,3,5,2))
    println(z)
   var y= mixedNumber(arrayOf("Timcy",20,45.9,33,"True",6.5,30))
    println(y)
    var w=vowels(arrayOf('a','b','c','d','e','f','g'))
    println(w)
    var person=Human("Kanini",20,40)
    person.eat(2)
    println(person.weight)
    person.speak("Japanese")
    person.birthday()
    println(person.age)
    var man=User("Timo","Catherine","timcate@gmail.com","0748383345",39101014)
    println(man.lastName)
    println(man.phoneNumber)




}
//create a function that takes in 4strings and create an array out of them then prints out the array.
fun Name(a:String,b:String,c:String,d:String){
    var names= arrayOf(a,b,c,d)
    println(names.contentToString())

}
//create a function that given an array below:
//var cities=arrayOf("harare","mumbai","dodoma","jakarta")
//prints out the names of the cities in the correct  grammatical case.
fun city(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city->
       println(city.capitalize())
    }
}
//create one function that given the below array:
//var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
//prints out the sum of the second and the fifth elements
fun calculate(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[1]+numbers[4]
    println(sum)
    //prints out the index of 158
    println(numbers.indexOf(158))
    //print out the elements in ascending order
    println(numbers.sorted())

}
//create a function that takes in 3 names and returns a string array containing all the 3 names.
fun names(a:String,b:String,c:String):Array<String>{
    var name= arrayOf(a,b,c)
    return name

}
//write a function that takes in array of integers and returns the product of all elements
fun multiply(multiple:Array<Int>):Int{
    var product=1
    multiple.forEach { num->
        product*=num
    }
    return product

}
//write a function that takes in an array of mixed types and returns the sum of all the decimal elements
fun mixedNumber(mixedtype:Array<Any>):Double{
    var sum =0.0
    mixedtype.forEach { num->
        if (num is Double || num is Float)
            sum+=num.toString() .toDouble()
    }
    return sum
}
//write a function that takes in an array of characters and returns the number of vowels in the array
fun vowels(count:Array<Char>):Int{
    var sum = 0
    count.forEach { letter->
        if (letter== 'a' || letter== 'e'|| letter== 'i' || letter== 'o' || letter== 'u' ){
            sum++
        }
    }
    return sum


}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating ${foodweight} kgs of food")
        weight+=foodweight
    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        age++

    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int)


