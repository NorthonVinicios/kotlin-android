fun main(args: Array<String>) {
    val account = Account(
        "Northon",
        100
    )

    val finance = Finance(1, 1, 1000.0)
    println(finance.dateTimeCreation.year)
    println(finance.dateTimeClosed)

}


