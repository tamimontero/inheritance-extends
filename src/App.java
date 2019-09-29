import ar.com.ada.oop.zoo.Animal;
import ar.com.ada.oop.zoo.Dog;
import ar.com.ada.oop.zoo.Horse;

public class App {
    public static void main(String[] args) {

        Dog perro1 = new Dog("Caniche", 4, 8);
        Dog perro2 = new Dog("Pug", 4, 6);

        Horse caballo1 = new Horse("Árabe", 2, "Odín");
        Horse caballo2 = new Horse("Pura Sangre", 6, "Saga");

        Horse caballo3 = new Horse("Árabe", 2, "Odín");
        Horse caballo4 = new Horse("Arabe", 2, "Odin");


        System.out.println(perro1.toString());
        System.out.println(perro2.toString());
        System.out.println(caballo1.toString());
        System.out.println(caballo2.toString());

        System.out.println(perro1.toString() + " - hashCode(): " + perro1.hashCode());
        System.out.println(perro2.toString() + " - hashCode(): " + perro2.hashCode());
        System.out.println(caballo1.toString() + " - hashCode(): " + caballo1.hashCode());
        System.out.println(caballo2.toString() + " - hashCode(): " + caballo2.hashCode());

        System.out.println("¿es perro1 igual a perro2?: " + perro1.equals(perro2));
        System.out.println("¿es caballo2 igual a caballo1?: " + caballo2.equals(caballo1));
        System.out.println("¿es caballo1 igual a perro1?: " + caballo1.equals(perro1));
        System.out.println("es caballo2 igual a perro2?: " + caballo2.equals(perro2));
        System.out.println("es caballo1 igual a perro2?: " +caballo1.equals(perro2));
        System.out.println("¿es perro1 igual a caballo1?: " + perro1.equals(caballo1));

        System.out.println("¿es caballo3 igual a caballo1?: " + caballo3.equals(caballo1));
        System.out.println("¿es caballo4 igual a caballo1?: " + caballo4.equals(caballo1));

    }
}
