package carrental

class Garage {
    private var vehicle : Vehicle? = null
    fun setVehicle(parked : Vehicle) {
        vehicle = parked
    }
    override fun toString(): String = "Description of the parked vehicle: " + if (vehicle != null)  vehicle.toString() else "Garage is empty."
}