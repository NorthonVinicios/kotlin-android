import java.util.*

class Finance(
    val code: Int, val employeeCode: Int, var wage: Double? = 1200.0,
    var bonus: Double? = wage?.times(0.8), val dateTimeCreation: Date = Calendar.getInstance().time,
    val dateTimeClosed: Date? = dateTimeCreation.apply { year += 2 }
) {

    fun downWage(ammount: Double) {
        if (ammount.minus(wage!!) < 0) {
            wage!!.minus(ammount)
        }
    }

    fun upWage(ammount: Double) {
        if (ammount.plus(wage!!) < 0) {
            wage!!.plus(ammount)
        }
    }
}
