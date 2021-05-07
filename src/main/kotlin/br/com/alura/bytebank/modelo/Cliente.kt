package br.com.alura.bytebank.modelo

class Cliente(val nome: String, val cpf: String, private val senha: String, var endereco: Endereco)
    : Autenticavel {

    // classe assina o contrato com a interface, e implementa o metodo autenticação

    override fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}