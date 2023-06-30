class `exercicio 2` {
}fun main() {
    print("Digite a idade da pessoa: ")
    val idade = readLine()?.toIntOrNull()

    if (idade != null && idade >= 0) {
        val diasVividos = idade * 365
        println("A pessoa já viveu aproximadamente $diasVividos dias.")
    } else {
        println("Idade inválida. Por favor, digite um número inteiro positivo.")
    }
}