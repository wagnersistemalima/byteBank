package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin (nome: String, cpf: String, salario: Double, protected val senha: String)
    : Funcionario(nome = nome, cpf = cpf, salario = salario)
    , Autenticavel {

    // Classe abstrata que herda de outra classe abstrata br.com.alura.bytebank.modelo.Funcionario

    //metodo 2
    override fun autenticacao(senha: String): Boolean {

        if (this.senha == senha) {
            return true
        }
        return false
    }


}