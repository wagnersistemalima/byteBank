fun testaCondicao (saldo: Double) {
    println("Execultando o metodo testa condição")
    // -------------utilizando estruturas condicionais if ------------------------------------------------
    println("Entrando na estrutura condicional if----------------------------------");

    if (saldo > 0.0) {
        println("O saldo da conta é positivo");
    }
    else if (saldo == 0.0) {
        println("A conta é neutra");

    }
    else {
        println("A conta é negativa");
    }

    // -----------Estruturas condicionais when------------------------------------

    println("Entrando na estrutura condicional when------------------------------------");

    when {
        saldo > 0.0 -> println("saldo é positivo");
        saldo == 0.0 -> println("saldo é neutro");
        else -> println("saldo é negativo");
    }
}