import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    println("...................Criando uma conta corrente........................................");

    val zeca = Cliente(
        nome = "Zeca",
        cpf = "777.777.777-77",
        senha = "12345",
        endereco = Endereco(logradouro = "rua...", numero = 10, bairro = "bairro...", cidade = "cidade",
            estado = "estado", cep = 500, complemento = "complemento")
    )


    val contaCorrente1 = ContaCorrente(titular = zeca, numero = 1008);

    println("Titular da conta: ${contaCorrente1.titular.nome}")
    println("cpf: ${contaCorrente1.titular.cpf}")
    println("Endereco logradouro: ${contaCorrente1.titular.endereco.logradouro}")

    println("...................Criando uma conta poupança........................................");

    val manel = Cliente(
        nome = "Manel",
        cpf = "555.555.555-55",
        senha = "12345",
        endereco = Endereco(logradouro = "rua...", numero = 10, bairro = "bairro...", cidade = "cidade",
            estado = "estado", cep = 500, complemento = "complemento"))

    val contaPoupanca1 = ContaPoupanca(titular = manel, numero = 5000);

    println("Titular da conta: ${contaPoupanca1.titular.nome}")
    println("cpf: ${contaPoupanca1.titular.cpf}")
    println("Endereco logradouro: ${contaPoupanca1.titular.endereco.logradouro}")

    println(".......................Efetuando deposito nas contas..................................");

    contaCorrente1.deposita(valor = 1000.0);

    contaPoupanca1.deposita(valor = 1000.0);

    println("saldo conta corrente: ${contaCorrente1.saldo}");
    println("saldo conta poupança: ${contaPoupanca1.saldo}");

    println(".....................Efetuando saque nas contas..................................");

    contaCorrente1.sacar(valor = 100.0);
    contaPoupanca1.sacar(valor = 100.0);

    println("saldo conta corrente: ${contaCorrente1.saldo}");
    println("saldo conta poupança: ${contaPoupanca1.saldo}");

    println("...............Efetuando transferencia da conta corrente para poupança...........");

    contaCorrente1.transferi(conta = contaPoupanca1, valor = 100.0, senha = "12345");

    println("saldo conta corrente: ${contaCorrente1.saldo}");
    println("saldo conta poupança: ${contaPoupanca1.saldo}");

    println("...............Efetuando transferencia da poupança para conta corrente...........");

    contaPoupanca1.transferi(conta = contaCorrente1, valor = 10.0, senha = "12345");

    println("saldo conta corrente: ${contaCorrente1.saldo}");
    println("saldo conta poupança: ${contaPoupanca1.saldo}");
}