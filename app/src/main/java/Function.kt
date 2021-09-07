/* Cetak 5 baris sapaan dengan menyebut nama
* contoh( : Halo selamat pagi Veronica
* 1 x pagi, 5 x siang, 3 xsore, 1 xmalam, 1 xpagi, 2x goodbye*/
fun main() {

    val name = "Putri"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    goodbye(name)
}

fun morning(name : String){
    //radius = 16
    println("Halo selamat pagi ${name}")
}
fun afternoon(name: String){
    println("Halo selamat siang ${name}")
}
fun evening(name: String){
    println("Halo selamat sore ${name}")
}
fun night(name: String){
    println("Halo selamat malam ${name}")
}
fun goodbye(name: String){
    println("Halo sampai jumpa ${name}")
}
