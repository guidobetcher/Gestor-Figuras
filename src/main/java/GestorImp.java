import java.util.Arrays;

public class GestorImp implements Gestor {
    public double suma(Fig[] l) {
        double r = 0;
        for (Fig f:l) {r += f.area();}
        return r;
    }

    public void sort(Fig[] l) {
        Arrays.sort(l);
    }
    public static void main(String[] args) {
        Fig[] l = new Fig[4];
        l[0] = new Cuadrado(5);
        l[1] = new Triangulo(2,3);
        l[2] = new Circulo(1);
        l[3] = new Rectangulo(1,2);

        System.out.println(l[0].area());
        GestorImp g = new GestorImp();
        System.out.println("suma"+g.suma(l));
    }


}


