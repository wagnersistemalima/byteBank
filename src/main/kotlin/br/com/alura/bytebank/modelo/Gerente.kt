package br.com.alura.bytebank.modelo

class Gerente (nome: String, cpf: String, salario: Double, senha: String)
    : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha) {


    // classe gerente herda da classe abstrata br.com.alura.bytebank.modelo.Funcionario admin, que herda da classe abstrata br.com.alura.bytebank.modelo.Funcionario
    // assina o contrato com a interface e implementa o metodo autenticacao

    override fun bonificacao(): Double {

        return  salario

    }

    // metodo da interface

    override fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true;
        }
        return false
    }

}