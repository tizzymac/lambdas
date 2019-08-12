object HelloWorld {
  def main(args: Array[String]): Unit = {

    // basic examples
    val ex1 = (x:Int) => x + 2
    val ex2 = (x:Int, y:Int) => x * y // multiple parameters
    println(ex1(8))
    println(ex2(2, 3))

    // transforming collections
    val list = List(1, 1, 2, 3, 5, 8)
    val result = list.map( (x:Int) => x * x ) // square each element of the list
    println(result)

    // pass lambda as an argument
    val stringList = List("hello", "World", "123")
    val capitalize = (x:String) => x.capitalize
    val result2 = stringList.map( capitalize )
    println(result2)
    println(capitalize("lowercase"))
  }
}