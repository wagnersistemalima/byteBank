package br.com.alura.bytebank.modelo

class ContaCorrente(titular: Cliente, numero: Int)
    : Conta(titular = titular, numero = numero) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1;
        if (valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valorComTaxa
        }
    }
}