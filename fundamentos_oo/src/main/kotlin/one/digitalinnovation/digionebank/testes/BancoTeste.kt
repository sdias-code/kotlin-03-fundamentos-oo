package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco2

fun main(){
    val digiOneBank = Banco2("DigiOne", 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")
    //println(banco2.nome)
    //println(banco2.numero)
    println(banco2.infoBanco())
}