class exercicio9 {
}fun main() {
    print("Digite uma frase: ")
    val frase = readLine()

    if (frase != null) {
        println("Você digitou: $frase")
    } else {
        println("Entrada inválida. Por favor, digite uma frase válida.")
    }
}
