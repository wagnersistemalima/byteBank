package br.com.alura.bytebank.modelo

class SistemaInterno {

    // classe contendo comportamento para entrar no sistema

    fun entrar(admin: Autenticavel, senha: String) {
        if(admin.autenticacao(senha)) {
            println("Bem vindo ão Bytebanck!")
        }
        else {
            println("falha na autenticação")
        }
    }


}