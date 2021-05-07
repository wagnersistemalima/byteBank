package br.com.alura.bytebank.modelo

abstract class Funcionario (val nome: String, val cpf: String, val salario: Double, ){

    // classe abstrata e metodo abstrato, não tem implementação, a classe que herdar sera obrigada a implementar

    // metodo abstrato

    abstract fun bonificacao(): Double





}