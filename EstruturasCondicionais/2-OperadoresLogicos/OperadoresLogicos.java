/*
* Operadores lógicos são usados para combinar expressões booleanas. Eles permitem que você crie condições mais complexas em suas estruturas condicionais. Os principais operadores lógicos são:
* && : operador lógico AND - retorna true se ambas as expressões forem verdadeiras
* || : operador lógico OR - retorna true se pelo menos uma das expressões for verdadeira
* ! : operador lógico NOT - inverte o valor booleano de uma expressão
* */



public class OperadoresLogicos {
    static void main(String[] args) {
        int idade = 19;
        int idadeMinima = 18;
        int idadeMaxima = 65;

        boolean podeDirigir = idade >= idadeMinima && idade <= idadeMaxima; // AND
        boolean podeVotar = idade >= 18 || idade <= 16; // OR
        boolean naoPodeDirigir = !podeDirigir; // NOT

    }
}
