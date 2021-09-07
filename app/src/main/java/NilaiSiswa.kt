/* siswa mengikuti ujian nilai yang di input oleh guru akan diterjemahkan menjadi predikat
* 75 kebawah -> kurang
* 75 -79 -> cukup
* 80-89 -> baik
* diatas 90 sangat baik*/
/* Ibu beli belajaan di supermarket
400.000 -> diskon 4 %
800.000 -> diskon 9 %
1.600.000 -> diskon 19 %
2.000.000 -> diskon 25 %
3.000.000 -> diskon 40 %
total uang yang harus dibayar
* bit.ly/edit-cat */
fun main() {
    val nilai = 90
    if (nilai < 75) {
        print("Nilai anda Kurang")
    }else if ((nilai >= 75) && (nilai <= 79)){
        print("Nilai anda cukup")
    }else if (nilai >= 80 && nilai <= 89){
        print("Nilai anda baik")
    } else {
        print("Nilai anda sangat baik")
    }
}