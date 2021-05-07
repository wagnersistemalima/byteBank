import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(nome = "Alex", cpf = "455.254.354-58", salario = 1000.0)

    println("--------------------------------------------------------------------")
    println("Criando um funcionario---------")

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")


    println("-----------------------------------------------------------------------")
    println("Calculando a bonificação do funcionario Alex")

    println("A bonificação do Alex foi: ${alex.bonificacao()}")

    println("-----------------------------------------------------------------------")
    println("Criando um funcionario gerente....")

    val joaoGerente = Gerente(nome = "Joao", cpf = "124.111.444-44", salario = 2000.0, senha = "12345")

    println("nome: ${joaoGerente.nome}")
    println("cpf: ${joaoGerente.cpf}")
    println("salario: ${joaoGerente.salario}")

    if (joaoGerente.autenticacao(senha = "12345")) {
        println("gerente autenticado com sucesso! nome: ${joaoGerente.nome}")

        println("Calculando a bonificação do gerente: ${joaoGerente.nome}")

        println("A bonificação do gerente foi: ${joaoGerente.bonificacao()}")
    } else {
        println("Erro na validação da senha! ${joaoGerente.nome}")
    }
    println("----------------------------------------------------------------------------------")
    println("Criando um br.com.alura.bytebank.modelo.Diretor....")

    val marcoDiretor = Diretor(nome = "Marco", cpf = "444.444.444-87", salario = 4000.0, senha = "12345", prl = 200.0)

    println("nome: ${marcoDiretor.nome}")
    println("cpf: ${marcoDiretor.cpf}")
    println("salario: ${marcoDiretor.salario}")
    println("prl: ${marcoDiretor.prl}")

    if (marcoDiretor.autenticacao(senha = "12345")) {
        println("diretor autenticado com sucesso! nome: ${marcoDiretor.nome}")

        println("Calculando a bonificação do diretor: ${marcoDiretor.nome}")

        println("A bonificação do diretor foi: ${marcoDiretor.bonificacao()}")
    } else {
        println("Erro na validação da senha! ${marcoDiretor.nome}")
    }

    println("----------------------------------------------------------------------------")
    println("Criando um analista")

    val mariaAnalista = Analista(nome = "Maria", cpf = "777.777.777-87", salario = 3000.0)

    println("nome: ${mariaAnalista.nome}")
    println("cpf: ${mariaAnalista.cpf}")
    println("salario: ${mariaAnalista.salario}")
    println("A bonificação do br.com.alura.bytebank.modelo.Analista foi: ${mariaAnalista.bonificacao()}")

    println("-----------------------------------------------------------------------------")
    println("Entrando na calculadora..........................")

    val calculadora = CalculadoraBonificacao()

    println("Registrando funcionarios, gerentes, diretores")
    calculadora.registra(alex)
    calculadora.registra(joaoGerente)
    calculadora.registra(marcoDiretor)
    calculadora.registra(mariaAnalista)

    println("Total de bonificaçoes: ${calculadora.total}")

    println("Fim!")
}