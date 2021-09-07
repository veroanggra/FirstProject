import java.util.*
/* siswa mengikuti ujian nilai yang di input oleh guru akan diterjemahkan menjadi predikat
* 75 kebawah -> kurang
* 75 cukup
* 80 kebawah -> cukup
* 90 kebawah -> baik
* diatas 90 sangat baik*/
fun main(){
    val reader = Scanner(System.`in`)
    print("Masukkan bilangan : ")
    val number = reader.nextInt()
    if (number < 0){
        print("Negative")
    }else{
        print("Positive")
    }
}