public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //1tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
    //2tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
    //obtenerRaices(): imprime las 2 posibles soluciones
    //obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
    //getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene
    //la siguiente formula, (b^2)-4*a*c

    //el discriminante debe ser mayor o igual que 0.

    //el discriminante debe ser igual que 0.
    //calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de

    //**************************************METODOS***********************************

    public double getDiscriminante() {
        double b2 = Math.pow(b, 2); //guardamos en una variable
        return b2 - (4 * a * c);
    }

    public boolean tieneRaiz() {

        return getDiscriminante() == 0;//si solo tiene una raiz el descriminante es cero, tiene 1 solucion
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public void obtenerRaiz() {
        double raiz = -b / 2 * a;
        System.out.println("Unica Raiz: " + raiz);
    }

    public void obtenerRaices() {// es void no retorna nada

        // en una variable de tipo double aplicar formula
        double raizDiscrimanante = Math.sqrt(getDiscriminante());
        double raizPositiva = (-b + raizDiscrimanante) / 2 * a;
        double raizNegativa = (-b - raizDiscrimanante) / 2 * a;

        System.out.println("Raiz 1 : " + raizPositiva);
        System.out.println("Raiz 2 : " + raizNegativa);
    }

    public void calcular() {
        if (tieneRaiz()) {
            obtenerRaiz();
        } else if (tieneRaices()) {
            obtenerRaices();
        } else {
            System.out.println("La ecuacion no tiene solucion real");
        }
    }
}
