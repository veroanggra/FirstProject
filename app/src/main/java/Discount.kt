import java.util.*

/*1. Tulis main function
* 2. Tulis kurungnya
* 3. Tulis variable -> Harga
* 4. If (Control Flow : Percabangan)*/

fun main() {
    val reader = Scanner(System.`in`)
    print("Masukkan harga belanja anda : ")
    val price: Int = reader.nextInt()
    val resultDiscount: Int
    val finalPrice: Int

    if (price >= 400000 && price < 800000) {
        resultDiscount = price * 4 / 100
        if (resultDiscount >= 100000) {
            finalPrice = price - 100000
            print("Total pembayaran $finalPrice")
        } else {
            finalPrice = price - resultDiscount
            print("Total pembayaran $finalPrice")
        }
    } else if (price >= 800000 && price < 1600000) {
        resultDiscount = price * 9 / 100
        if (resultDiscount >= 100000) {
            finalPrice = price - 100000
            print("Total pembayaran $finalPrice")
        } else {
            finalPrice = price - resultDiscount
            print("Total pembayaran $finalPrice")
        }
    } else if (price >= 1600000 && price < 2000000) {
        resultDiscount = price * 19 / 100
        if (resultDiscount >= 100000) {
            finalPrice = price - 100000
            print("Total pembayaran $finalPrice")
        } else {
            finalPrice = price - resultDiscount
            print("Total pembayaran $finalPrice")
        }
    } else if (price >= 2000000 && price < 3000000) {
        resultDiscount = price * 25 / 100
        if (resultDiscount >= 100000) {
            finalPrice = price - 100000
            print("Total pembayaran $finalPrice")
        } else {
            finalPrice = price - resultDiscount
            print("Total pembayaran $finalPrice")
        }
    } else {
        resultDiscount = price * 40 / 100
        if (resultDiscount >= 100000) {
            finalPrice = price - 100000
            print("Total pembayaran $finalPrice")
        } else {
            finalPrice = price - resultDiscount
            print("Total pembayaran $finalPrice")
        }
    }
}