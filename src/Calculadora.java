public class Calculadora {

    int x;
    int y;
    int z;
    //constructor
    public Calculadora(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //metodo SUMA
    public void sum() {
        System.out.println("La Suma de los numeros es: " + (x + y));
    }
    //metodo RESTA
    public void rest() {
        System.out.println("La Resta de los numeros es: " + (x - y));
    }
    //metodo MULSTIPLICAR
    public void mult() {
        System.out.println("La Multiplicacion de los numeros es: " + (x * y));
    }
    //metodo DIVIDIR
    public void div() {
        System.out.println("La Division de los numeros es: " + (x / y));
    }


}
