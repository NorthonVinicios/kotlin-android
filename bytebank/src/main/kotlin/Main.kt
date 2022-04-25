fun main(args: Array<String>) {
    val account = Account(
        "Northon",
        100
    )
    account.deposit(1000.0)
    account.withdraw(801.0)
}


data class Account(val owner: String, val code: Int, var ballance: Double? = 0.0, var multipleLimit: Double = 0.8) {
    fun deposit(ammount: Double = 0.0, depositor: Int? = 0) {
        ballance = ballance?.plus(ammount)
    }

    fun withdraw(ammount: Double = 0.0, destination: String? = "Never Where") {
        if (ammount < ballance!!.times(multipleLimit)) {
            ballance = ballance?.minus(ammount)
            println("SUCCESS")
            println("WITHDRAW $ammount TO $destination")
            println("YOUR BALLANCE IS ACTUALLY $ballance")
        } else {
            println("HIGH VALUE WITHDRAW!!!")
            println("CONTACT THE MANAGER OF YOUR ACCOUNT TO REALIZE THAT WITHDRAW")
            println("MANAGER EMAIL: northon.contact@gmail.com")
        }
    }


    fun transfer(ammount: Double = 0.0, receptor: Int? = 0) {

    }
}

