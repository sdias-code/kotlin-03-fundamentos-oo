package one.digitalinnovation.digionebank

data class Banco2(
    val nome: String,
    val numero: Int
){
    fun infoBanco() = "$nome e $numero"
}