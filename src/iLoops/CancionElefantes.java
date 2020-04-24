package iLoops;

public class CancionElefantes {

    public static void main(String[] args) {

        int numElefantes = 100;
        int contador = 2;

        System.out.println("1 elefante se columpiaba sobre la tela de una araña, como veía que resistía, fue a llamar a otro elefante");

        do {
            System.out.println(contador+" elefantes se columpiaban sobre la tela de una araña, como veían que resistía, fueron a llamar a otro elefante");
            contador++;

        } while (contador <= numElefantes);
    }
}
