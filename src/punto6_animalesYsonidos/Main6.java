package punto6_animalesYsonidos;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("\n---Animales y sonidos---");
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Pajaro());

        for (Animal animal : animales) {
            try {
                animal.hacerSonido();
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }
}
