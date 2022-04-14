fun mostraSalario(salarios: DoubleArray) {
    println("*** Salários Cadastrados *** \n")

    for (i in salarios.indices) {
        println("Salário ${i + 1}: R$${salarios[i]}")
    }

    println()

}