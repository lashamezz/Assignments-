fun main() {

    val f1 = Fraction(10F, 5F)

    val f2 = Fraction(3F, 5F)

//    println(f1 == f2)

//    println(f1.reduce()) //input number for division

//available overridden operators
    println(f1 + f2)

    println(f1 - f2)

    println(f1 / f2)

    println(f1 * f2)

}

class Fraction(n: Float, d: Float) {

    private var numerator: Float = n
    private var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun reduce(): String {

        println("Input a number (Int)")

        var inputNumber:Int = Integer.valueOf(readLine())
        if(inputNumber != 0){

            numerator /= inputNumber
            denominator /= inputNumber
            return("$numerator/$denominator")

        }else{
            return("Cannot Divide by 0")
        }

    }

    operator fun plus(fraction: Fraction): Float{

        var frac1: Float = this.numerator / this.denominator
        var frac2: Float = fraction.numerator / fraction.denominator

        return (frac1 + frac2)

    }

    operator fun minus(fraction: Fraction): Float{

        var frac1: Float = this.numerator / this.denominator
        var frac2: Float = fraction.numerator / fraction.denominator

        return (frac1 - frac2)

    }

    operator fun div(fraction: Fraction): Float{

        var frac1: Float = this.numerator / this.denominator
        var frac2: Float = fraction.numerator / fraction.denominator

        return (frac1 / frac2)

    }

    operator fun times(fraction: Fraction): Float{

        var frac1: Float = this.numerator / this.denominator
        var frac2: Float = fraction.numerator / fraction.denominator

        return (frac1 * frac2)

    }

}
