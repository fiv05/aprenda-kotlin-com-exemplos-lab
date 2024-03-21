// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// Criar a classe de níveis
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

// Criar a classe usuário
class Usuario(val nome: String, val nivel: Nivel)

//Criar a data class de conteúdo educacional
data class ConteudoEducacional(val nome: String, val duracao: Int = 0)

// criar data class de formação 
data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

//Criar a função para matricular os alunos
    val inscritos = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado na formação de $nome.")
    }
}

fun main() {
    // Conteúdo educacional da formação de Ciência da Computação
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Algoritmo", 120)

    // Adicionando os conteúdos da formação numa lista 
    val formacao = Formacao("Ciência da Computação")
    formacao.conteudos.addAll(listOf(conteudo1, conteudo2))
    println("Usuários inscritos:")
    println()

    // Criando alunos e os níveis 
    val usuario1 = Usuario("João", Nivel.BASICO)
    val usuario2 = Usuario("Maria", Nivel.INTERMEDIARIO)
    val usuario3 = Usuario("Pedro", Nivel.AVANCADO)

    // Matriculando os alunos
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    // Imprimir cadastro na tela
    for (usuario in formacao.inscritos) {
        println("${usuario.nome} - ${usuario.nivel}")}
        println()
    
       println("Conteúdos concluídos pelos alunos:")
       println()
    for (conteudo in formacao.conteudos) {
        println("${conteudo.nome} - Duração: ${conteudo.duracao} horas")}
    
}
