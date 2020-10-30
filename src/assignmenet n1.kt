fun main(){

    val pointOne = Point(5F,10F)
    val pointTwo = Point(5F,10F)
    val pointThree = Point(6F,10.1F)


    println(pointOne==pointTwo) //point one equals point two

    println(pointTwo==pointThree) //point two doesn't equal point three

    println(pointThree.xAxisTransport()) //Symmetrical Transport on X Axis

}

class Point(x: Float,y: Float){

    var X: Float = x
    var Y: Float = y

    override fun toString(): String{
        return "Coordinates = ($X;$Y)"
    }
    override fun equals(other: Any?): Boolean {
        if(other is Point){
            if(this.X == other.X && this.Y == other.Y){
                return true
            }
        }
        return false
    }

    fun xAxisTransport(): String{
        X *= -1
        return "Coordinates = ($X;$Y)"
    }


}