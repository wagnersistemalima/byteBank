package br.com.alura.bytebank.modelo

class ContaPoupanca(titular: Cliente, numero: Int)
    : Conta(titular = titular, numero = numero) {

    override fun sacar(valor: Double) {
        if (valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor
        }
    }

}