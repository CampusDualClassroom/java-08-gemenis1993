package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {

        whileLoop(0);


        // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
        // X < Y. El próximo ciclo valdrá: X+1
        // X+1 < Y. El próximo ciclo valdrá: X+2
        // etc.

    }

    public static void whileLoop(int num) {
        num=0;
        do {
            num++;
            System.out.println(num + " < " + 15 + ". El proximo ciclo valdra: " + (num + 1));
        } while (num<15);
    }
}
