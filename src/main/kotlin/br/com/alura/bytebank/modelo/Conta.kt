package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException


abstract class Conta (val titular: Cliente, val numero: Int): Autenticavel{

    var saldo: Double = 0.0
        protected set;

    // criando objeto anonimos Declaration em arquivos

    companion object Contador {
        var total = 0
             private set


    }


    // inicializar guando o construtor da conta for chamado para construir uma conta

    init {
        println("criando uma conta")
        total++
    }

    // metodo deposita

    fun deposita(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor;
        }
    }

    // metodo sacar

    abstract fun sacar(valor: Double)



    // metodo para transefir valor de uma conta para outra

    fun transferi(conta: Conta, valor: Double, senha: String) {
        if (this.saldo < valor) {
            throw  SaldoInsuficienteException("O saldo e inferior ao valor")
        }
        else if (this.saldo > 0.0 && valor > 0.0 && valor <= this.saldo) {
            conta.deposita(valor);
            this.saldo -= valor;

        }
        if (!autenticacao(senha)) {
            throw  FalhaAutenticacaoException()
        }
    }

    // metodo da interface, transferindo a responsabilidade de autenticar ao cliente

    override fun autenticacao(senha: String): Boolean {
        return titular.autenticacao(senha)
    }
}