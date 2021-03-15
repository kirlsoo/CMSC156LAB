
fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat) 
}

fun printBorder(border : String, timesToRepeat: Int) {
        repeat(timesToRepeat) {  
            print(border)
        }
        println()
    }

//other version
/*
fun main() {
    val border = "="
    printBorder(border)
    println(" Happy Birthday, Jhansi!")
    printBorder(border) 
}

fun printBorder(border : String) {
        repeat(23) {  
            print(border)
        }
        println()
    }
    
    */
