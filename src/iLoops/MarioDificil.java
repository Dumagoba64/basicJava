package iLoops;

import libs.Input;

public class MarioDificil {


    public static void main(String args[]) {
        System.out.print("Altura: ");
        int altura = Input.get_int();

        if (altura > 1) {

        int numGatos = 2;
        int numEspacios = 4;


        for (int num = 1; num <= altura; num += 1) {

            for (int g = 1; g <= numEspacios; g += 1) {
                System.out.print(' ');
            }

            for (int e = 1; e <= numGatos; e += 1) {
                System.out.print('#');
            }

            System.out.print("  ");

            for (int e = 1; e <= numGatos; e += 1) {
                System.out.print('#');
            }

            System.out.println();
            numEspacios--;
            numGatos++;

            }
        }
        else {
            System.out.println("Mario construye la pirámide con un altura de 2 pisos en adelante");
        }

    }


}
