package one.digitalinnovation.digionebank

class Analista2(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario2(
    nome,
    cpf,
    salario
) {
    override fun calculoAuxilio() = salario * 0.1

}