package one.digitalinnovation.digionebank

abstract class Funcionario2(
	nome: String,
	cpf: String,
	val salario: Double
	) : Pessoa2(nome, cpf) {
    protected abstract fun calculoAuxilio() : Double

	override fun toString(): String = """
		Nome: $nome
		Cpf: $cpf
		Salario: $salario
		Auxilio: ${calculoAuxilio()}
		
	""".trimIndent()
	}