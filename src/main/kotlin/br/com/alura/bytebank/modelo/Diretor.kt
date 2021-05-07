package br.com.alura.bytebank.modelo

class Diretor(nome:String, cpf:String, salario:Double, senha:String, val prl:Double)
    : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    // classe diretor herda da classe abstrata br.com.alura.bytebank.modelo.Funcionario admin, que herda da classe abstrata br.com.alura.bytebank.modelo.Funcionario
    // assina o contrato com a interface e implementa o metodo autenticacao

    override fun bonificacao(): Double {

        return  salario + prl

    }

    // autentica metodo herdado da classe abstrata



}