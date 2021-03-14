package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario2 (
	nome: String,
	cpf: String,
	val salario: BigDecimal
	) : Pessoa2(nome, cpf) {
    abstract fun calculoAuxilio();
	}