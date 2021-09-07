// Tugas : Persegi, persegi panjang, jajar genjang, layang - layang, trapesium, lingkaran, segitiga, belah ketupat

fun main() {
    persegi(5.0)
    persegiPanjang(5.0, 10.0)
    jajarGenjang(10.0, 3.0)
    layangLayang(10.0, 5.0)
    trapesium(7.0, 4.0, 5.0)
    lingkaran(8.0)
    segitiga(4.0, 8.0)
}

fun segitiga(alas: Double, tinggi: Double) {
    val result = alas * tinggi * 1 / 2
    println()
}

fun lingkaran(radius: Double) {
    val result = 3.14 * radius * radius
    println("Luas lingkaran adalah $result")

}

fun trapesium(sisi1: Double, sisi2: Double, tinggi: Double) {
    val result = ((sisi1 + sisi2) * tinggi) / 2
    println("Luas trapesium adalah $result")
}

fun jajarGenjang(alas: Double, tinggi: Double) {
    val result = alas * tinggi
    println("Luas jajar genjang $result")
}

fun layangLayang(diagonal1: Double, diagonal2: Double) {
    val result = (diagonal1 * diagonal2) / 2
    println("Luas layang - layang adalah $result")
}

fun persegiPanjang(panjang: Double, lebar: Double) {
    val result = panjang * lebar
    println("Luas Persegi Panjang adalah $result")
}

fun persegi(sisi: Double) {
    val result = sisi * sisi
    println("Luas persegi adalah $result")
}
