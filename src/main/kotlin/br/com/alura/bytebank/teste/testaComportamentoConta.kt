import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.*

fun testaComportamentoConta() {
    println("Bem vindo ão Bytebank")
    println("******************************************")

    // o objeto conta aponta para umaa entidade br.com.alura.bytebank.modelo.Conta

    val wagner = Cliente(
        nome = "Wagner",
        cpf = "555.555.555-55",
        senha = "12345",
        endereco = Endereco(logradouro = "rua...", numero = 10, bairro = "bairro...", cidade = "cidade",
            estado = "estado", cep = 500, complemento = "complemento")
    )

    val contaWagner = ContaCorrente(titular = wagner, numero = 1000)
    contaWagner.deposita(-200.0)

    val marina = Cliente(
        nome = "Marina",
        cpf = "999.999.999-99",
        senha = "12345",
        endereco = Endereco(logradouro = "rua...", numero = 10, bairro = "bairro...", cidade = "cidade",
            estado = "estado", cep = 500, complemento = "complemento"))

    val contaMarina = ContaPoupanca(titular = marina, numero = 1001)
    contaMarina.deposita(300.0)

    val fran = Cliente(
        nome = "Fran",
        cpf = "444.444.444-44",
        senha = "12345",
        endereco = Endereco(logradouro = "rua...", numero = 10, bairro = "bairro...", cidade = "cidade",
            estado = "estado", cep = 500, complemento = "complemento"))

    val contaFran = ContaCorrente(titular = fran, numero = 1002);

    contaFran.deposita(valor = 400.0);

    println("A conta pertence a ${contaWagner.titular}")
    println("O numero da conta: ${contaWagner.numero}")
    println("O saldo da conta: ${contaWagner.saldo}")
    println("--------------------------------------------------")
    println("A conta pertence a ${contaMarina.titular}")
    println("O numero da conta: ${contaMarina.numero}")
    println("O saldo da conta: ${contaMarina.saldo}")
    println("--------------------------------------------------")
    println("A conta pertence a ${contaFran.titular}")
    println("O numero da conta: ${contaFran.numero}")
    println("O saldo da conta: ${contaFran.saldo}")

    // depositos
    println("Efetuando deposito........................................")

    contaWagner.deposita(valor = 50.0)

    println("O saldo da conta wagner: ${contaWagner.saldo}")

    println("------------------------------------------------------------")
    println("Efetuando um saque")

    contaWagner.sacar(valor = 250.0)

    println("O saldo da conta wagner: ${contaWagner.saldo}")

    println("---------------------------------------------------------")
    println("------------------fazendo uma transferencia da conta de marina------------------------------")
    try {
        contaMarina.transferi(conta = contaFran, valor = 100.0, senha = "12345")
        println("Transferindo um valor da conta: ${contaMarina.titular} , para a conta ${contaFran.titular}, valor: 100.0")
        println("Transferencia concluida com sucesso!")
        println("Saldo conta marina: ${contaMarina.saldo}")
        println("Saldo conta fran: ${contaFran.saldo}")
    }
    catch (e: SaldoInsuficienteException) {
        println("falha na transferencia")
        e.printStackTrace()
    }
    catch (e: FalhaAutenticacaoException) {
        println("falha na autenticação")
        e.printStackTrace()
    }


    println("Fim............")
}