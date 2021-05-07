fun testaLacoRepeticao () {
    println("--------Entrando no laço for exemplo 1--------------------")
    for (i in 1..3) {
        // começa em 1 ate 3

        val titular: String = "Wagner $i";
        val numeroConta: Int = 1000 + i;

        var saldo: Double = i + 10.0;



        println("titular: $titular");
        println("-----------------------");
        println("numero da conta: $numeroConta");
        println("-------------------------");
        println("saldo: $saldo");

        // testaCondicao(saldo);
    }

    //laço for começa em 5 volta ate 1

    println("-------------------------------------------------------------------");
    println("Entrando no laço for, exemplo 2");

    for (i in 5 downTo 1) {
        println(i);
        if (i == 2) {               // se chegar em 2 parar
            break;
        }
    }
    println("-------------------------------------------------------------------");
    println("Entrando no laço for, exemplo 3");

    //laço for começa em 5 volta ate 1 pulando de 2 em 2

    for (i in 8 downTo 1 step 2) {
        println(i);
    }

    println("-------------------------------------------------------------------");
    println("Entrando no laço while");

    // laço de repetição while

    var i = 0;

    while (i < 5) {
        println("sou while $i");
        i++;
    }
}