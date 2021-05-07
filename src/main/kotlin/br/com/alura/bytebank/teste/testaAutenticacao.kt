import br.com.alura.bytebank.modelo.*

fun testaAutenticacao () {

    println("....................Criando um gerente..............")

    val gerente = Gerente(
        nome = "Tico",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = "12345")

    println("----------------Criando um diretor--------------------")

    val diretor = Diretor(
        nome = "Popo",
        cpf = "211.111.111-11",
        salario = 3000.0,
        senha = "12345",
        prl = 200.0)

    println("----------------Criando um cliente--------------------")

    val cliente = Cliente(
        nome = "Pedro",
        cpf = "888.888.88-88",
        senha = "12345",
        endereco = Endereco(logradouro = "rua...", numero = 10, bairro = "bairro...", cidade = "cidade",
        estado = "estado", cep = 500, complemento = "complemento")
    )

    println("..........Criando o sistema de autenticação..........")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(gerente, senha = "12345")             // herda interface
    sistemaInterno.entrar(diretor, senha = "12345")             // herda classe abstrata
    sistemaInterno.entrar(cliente, senha = "12345")             // herda da interface


}