package one.digitalinnovation.digionebank.testes

class Exemplo03 {
    var nome: String = "Silvio Dias Ferreira"

    var cpf: String = "123.123.123-10"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main(){
    val silvio = Exemplo03()
    //println(silvio.nome)
    //println(silvio.cpf)
    println(silvio.pessoaInfo())

}