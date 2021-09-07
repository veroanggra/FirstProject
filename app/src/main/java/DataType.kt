/* Data Type
Variable : 1. Immutable -> yang tidak bisa diubah (val)
            2. Muttable -> bisa diubah (var)

     1. Huruf >1 -> String
     2. Character 1 -> Char
     3. Angka : 1. ,, Decimal -> Double
                2. Bilangan bulat -> Int
                3. Decimal digitnya banyak -> Float
      4. Boolean (1/0, benar dan salah)

* */
/*Penjumlahan 2 bilangan bil1 dan bil2 */
fun main() {
    val bil1 = 3
    val bil2 = 5
    val radius = 18
// Tugas : Persegi, persegi panjang, jajar genjang, layang - layang, trapesium, lingkaran, segitiga, belah ketupat
    //Penjumlahan
    val result1 = bil1 + bil2
    //Pengurangan
    val result2 = bil2 - bil1
    //Perkalian
    val result3 = bil1 * bil2
    //Pembagian
    val result4 : Double  = bil2.toDouble() / bil1.toDouble()
    val luas_lingkaran : Double = 3.14 * (radius.toDouble() * radius.toDouble())
    println("Hasil operasi aritmatika antara bilangan 1 dan 2 " +
            "adalah sbb\nPenjumlahan $result1 \nPengurangan  $result2 \n" +
            "Perkalian $result3 \nPembagian $result4 \nLuas Lingkaran $luas_lingkaran" )
}










//======================================================================
fun intType(a : Int, b : Int){
    print(a+b)
}

fun stringtype(text: String) {
    print("Nama Sekolahku adalah ${text[2]}, " +
                "\nJumlah karakternya adalah ${text.length}, " +
                "\nJika dibalik menjadi ${text.reversed()} ")
}

