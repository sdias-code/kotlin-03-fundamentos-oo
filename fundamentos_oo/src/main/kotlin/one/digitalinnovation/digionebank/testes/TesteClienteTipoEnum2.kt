package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo2

fun main(){
    ClienteTipo2.values().forEach { elemento ->
        println("${elemento.name} - ${elemento}")
    }

    ClienteTipo2.values().forEach {
        println("${it.name} - ${it}")
    }
}