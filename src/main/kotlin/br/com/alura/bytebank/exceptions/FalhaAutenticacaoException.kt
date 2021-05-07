package br.com.alura.bytebank.exceptions

import java.lang.Exception

class FalhaAutenticacaoException(msg: String = "Falha na autenticação"): Exception(msg) {
}