class exercicio10 {
}fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val sucessor = numero + 1
        println("O sucessor de $numero é $sucessor")
    } else {
        println("Entrada inválida. Por favor, digite um número inteiro válido.")
    }
}