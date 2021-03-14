package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente2

fun main(){

    val jonas = Gerente2(
        nome = "Jonas Cabral Nunes",
        cpf = "222.222.222-444",
        salario = 5000.0,
        senha = "senha123"
    )

    ImprimeRelatorioFuncionario2.imprime(jonas)
    TesteAutenticacao2().autentica(jonas)
}

