class exercicio7 {
}fun main() {
    print("Digite a base do retângulo: ")
    val base = readLine()?.toDoubleOrNull()

    print("Digite a altura do retângulo: ")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && altura != null) {
        val area = calcularAreaRetangulo(base, altura)
        println("A área do retângulo é: $area")
    } else {
        println("Entrada inválida. Por favor, digite valores numéricos válidos.")
    }
}

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}