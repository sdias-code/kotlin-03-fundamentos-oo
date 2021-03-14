package one.digitalinnovation.digionebank

class Cliente2(
    nome: String,
    cpf: String,
    val clienteTipo2: ClienteTipo2,
    val senha: String
) : Pessoa2(
    nome,
    cpf), Logavel2 {
    override fun login(): Boolean = "senha222" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf        
        Tipo: ${clienteTipo2.descricao}
        
    """.trimIndent()
}