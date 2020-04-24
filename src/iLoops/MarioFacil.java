package iLoops;

import libs.Input;

public class MarioFacil {

    public static void main(String args[]) {
        System.out.print("Altura: ");
        int altura = Input.get_int();

        if (altura > 1) {

            int numGatos = 2;
            int numEspacios = altura + 1 - numGatos;


            for (int num = 1; num <= altura; num += 1) {

                for (int g = 1; g <= numEspacios; g += 1) {
                    System.out.print(' ');
                }

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
