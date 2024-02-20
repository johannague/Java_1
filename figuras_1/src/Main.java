import java.util.List;

public class Main {
    public static void main(String[] args) {


        //variables
        double largo = 5.0;
        double ancho = 3.0;

        Rectangulo rectangulo1 = new Rectangulo(largo, ancho);
        Rectangulo rectangulo2 = new Rectangulo(largo, ancho);

        List<Rectangulo> rectangulos = List.of(rectangulo1, rectangulo2);


        //voy a calcular la suma total del area de todos los rectangulos
        //paso 1.- calcular el area del rectangulo 1
        //paso 2.- calcular el area del rectangulo 2
        //paso 3.- sumar las dos areas

        double areaR1 = rectangulo1.area();
        double areaR2 = rectangulo2.area();
        double areaTotal = areaR1 + areaR2;


        System.out.println("La suma del area de  todos los rectangulos es " + areaTotal);

        double total =0;

        for (Rectangulo r : rectangulos){// el dato r apunta al primer rectangulo

            System.out.println("El area del rectangulo es "  + r.area());

            total = total + r.area();
        }

     //   System.out.println("Con el bucle for: la suma de todos los rectangulos es "  + r.area());

        double media = total / rectangulos.size();
        System.out.println("Media = " + media);

    }
}
