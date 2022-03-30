fun main(){
    var car=Car("BWM","BWM i8","black",6)
    car.carry(9)
    car.identity("white","Subaru","Legacy")
    println(car.calculateParkingFees(5))
    var bus=Bus("minibus","coach","yellow",54)
    println(bus.maxTripFare(150.50))
    println(bus.calculateParkingFees(4))
}
open class Car(var make:String, var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")

        }
    }
    fun identity( color:String, make:String,model:String){
        println("I am a $color $make $model")

    }
    open fun calculateParkingFees(hours:Int):Int{
        var y=hours*20
        return y
    }

}
class Bus(make:String, model:String,color:String,capacity:Int): Car(make,model,color,capacity) {
    fun maxTripFare(fare: Double):Double {
        var maximumFare=fare*capacity
        return(maximumFare)

    }
    override fun calculateParkingFees(hours: Int): Int {
        var product = hours * capacity
        return(product)

    }
}