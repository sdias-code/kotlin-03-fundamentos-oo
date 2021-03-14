package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista2

fun main(){

    val joao = Analista2(
        nome = "Joao dos Brabos",
        cpf = "222.222.222-444",
        salario = 2000.0
    )

ImprimeRelatorioFuncionario2.imprime(joao)
}

