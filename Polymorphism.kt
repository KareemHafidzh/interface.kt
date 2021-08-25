fun main() {
    val costumerService = Costumer().motorCustomer
    val costumerService2 = Costumer().motorCustomer2

    println(costumerService)
    println(costumerService2)
}

interface Dealer {
    fun motor(merek : String , jenis : String)
    fun mobil(merek : String , jenis : String)
}

open class Dummy : Dealer {
    override fun motor(merek : String , jenis : String) {
        println("Ini adalah motor $merek , dan jenisnya adalah $jenis")
    }

    override fun mobil(merek: String, jenis: String) {
        println("Ini adalah mobil $merek , dan jenisnya adalah $jenis")
    }
}

class Costumer : Dummy() {
    val motorCustomer = Dummy().motor("Honda" , "Sedan")
    val motorCustomer2 = Dummy().mobil("Daihatsu" , "Sedan")
}