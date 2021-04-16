package carrental

data class CarRentalContract(val customer: Customer, val vehicle: Vehicle) {
    override fun toString(): String = "${customer.name}[${customer.address}]:$vehicle"
}