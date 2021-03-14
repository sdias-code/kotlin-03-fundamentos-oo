package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente2
import one.digitalinnovation.digionebank.ClienteTipo2

fun main(){
    val jose = Cliente2(
        nome = "Jose da Silva",
        cpf = "123.123.123-47",
        clienteTipo2 = ClienteTipo2.PF,
        senha = "senha222"
    )

    println(jose)
    TesteAutenticacao2().autentica(jose)
}

