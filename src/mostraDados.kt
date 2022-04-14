import kotlin.system.exitProcess

fun mostraDados(nome: String, profissao: String) {

    if (nome.isNotEmpty() && profissao.isNotEmpty()) {
        println("Nome: $nome | Profissão: $profissao \n")
    } else {
        println("Cadastre-se para continuar!")
        exitProcess(0)
    }

}