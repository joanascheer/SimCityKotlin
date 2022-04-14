import kotlin.system.exitProcess

fun opcoes(
    salarios: DoubleArray,
    salarioComDesconto: DoubleArray,
    impostoAPagar: DoubleArray,
) {
    var nome = ""
    var profissao = ""

    while (true) {
        println("1 - Cadastrar habitante")
        println("2 - Consultar cadastro de habitante")
        println("3 - Cadastrar salários anuais")
        println("4 - Mostrar salários cadastrados")
        println("5 - Calcular o imposto mensal")
        println("6 - Sair \n")
        println("Digite uma opção: ")

        when (readln()) {
            "1" -> {
                println("*** Cadastro de Habitantes ***\n")

                println("Nome completo: ")
                nome = readln()
                println("Profissão: ")
                profissao = readln()

                println()
            }
            "2" -> {
                mostraDados(nome, profissao)
            }
            "3" -> {
                cadastraSalario(salarios)
            }
            "4" -> {
                mostraSalario(salarios)
            }
            "5" -> {
                // arrumar calculo de imposto
                calculaImposto(salarios, salarioComDesconto, impostoAPagar)
                mostraImposto(impostoAPagar, salarioComDesconto)
            }
            "6" -> {
                println("Obrigado(a) por utilizar nosso sistema!")
                exitProcess(0)
            }
        }
    }
}