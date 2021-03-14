package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario2
import one.digitalinnovation.digionebank.Pessoa2
import java.math.BigDecimal

fun main(){
    val sdias = Pessoa2(
        nome = "Paulo Ricardo",
        cpf = "124.124.124-20"
    )
    println(sdias.nome)
    println(sdias.cpf)

    val joao = Funcionario2(
        nome = "Joao dos Brabos",
        cpf = "222.222.222-444",
        salario = BigDecimal.valueOf(2000.0)
    )
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}