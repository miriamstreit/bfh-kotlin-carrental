/** Project and Training 1 - HS 20/21 (Kotlin),
 *  Computer Science, Bern University of Applied Sciences */

@file:JvmName("GarageTester")

package carrental

fun getExample(): Garage {
  val truck = Truck("black", false)
  val garage = Garage()
  garage.setVehicle(truck)
  return garage
}

fun main() {
  println(getExample())
}