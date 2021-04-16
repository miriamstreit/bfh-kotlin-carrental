package carrental

sealed class Vehicle(private val color : String) {
    override fun toString() = "This vehicle is $color"
}

class Car(color : String, private val hasWinterTires : Boolean) : Vehicle(color) {
    constructor(color: String) : this(color, false)
    override fun toString() = super.toString() + ", has WinterTires: ${if (hasWinterTires) "true" else "false"}"
}

class Truck(color : String, private val hasTrailer : Boolean) : Vehicle(color) {
    constructor(color: String) : this(color, false)

    override fun toString() = super.toString() + ", has Trailer: ${if (hasTrailer) "true" else "false"}"
}