package one.digitalinnovation.digionebank.testes

class Exemplo01 {
    var nome: String = "Silvio Dias Ferreira"
    var cpf: String = "123.123.123-10"

    inner class Endereco{
        var endereco: String = "Rua das Violetas"
    }
}

fun main(){
    val silvio = Exemplo01()
    println(silvio.nome)
    println(silvio.cpf)
    println(silvio.Endereco().endereco)
}