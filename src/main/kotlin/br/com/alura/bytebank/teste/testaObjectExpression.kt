package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjectExpression() {

    // criando objetos anonimos Expression

    println("Criando objeto anonimo Object Expression")

    val ana = object: Autenticavel {
        val nome: String = "Ana"
        val cpf: String = "888.888.888-88"
        val senha: String = "12345"

        override fun autenticacao(senha: String): Boolean {
            if (this.senha == senha) {
                return true
            }
            return false
        }

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(ana, senha = "12345")
}