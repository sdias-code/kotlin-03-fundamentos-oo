package one.digitalinnovation.digionebank

class Gerente2(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario2(
    nome,
    cpf,
    salario
) {
    override fun calculoAuxilio(): Double = salario * 0.4
}