package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario2 (
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
        ) : Pessoa2(nome, cpf) {

        }

