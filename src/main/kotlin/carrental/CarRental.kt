package carrental

class CarRental {
    private val carRentalContracts: ArrayList<CarRentalContract> = ArrayList()

    fun addContract(newContract : CarRentalContract) {
        carRentalContracts.add(newContract)
    }

    fun displayContracts() : String {
        var contracts : String = ""
        for (contract in carRentalContracts) {
            contracts += "$contract\n"
        }
        return contracts
    }

}