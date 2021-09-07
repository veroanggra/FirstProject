/* nama, nilai1, nilai2, nilai3, nilai 4*/
/**/
fun main() {
    raport("Vero", "A", "B", "B+", "C")
    raport("Putri", "A", "B-", "B+", "C+")

}

fun raport(name: String, ui_ux: String, web: String, android: String, comthink: String) {
    println("Nilai semester 1 dari siswi atas nama ${name}, " +
            "adalah sebagai berikut \nui/ux ${ui_ux}\nWeb ${web}\n " +
            "Android ${android}\nComthink ${comthink}")
}