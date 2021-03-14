package one.digitalinnovation.digionebank

class Gerente2(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario2(
    nome,
    cpf,
    salario
), Logavel2 {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = "senha123" == senha
}