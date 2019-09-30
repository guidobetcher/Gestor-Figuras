import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class GestorFigurasTest {
    Gestor g = null;
    Fig[] l = null;

    @Before
    public void  setUp(){
        this.g = new GestorImp();
        l = new Fig[4];
        l[0] = new Rectangulo(3,5);
        l[1] = new Cuadrado(5);
        l[2] = new Circulo(1);
        l[3] = new Triangulo(1,2);
    }
    @Test
    public void testSuma(){
        Assert.assertEquals("suma", 45, g.suma(l),1);
    }

    @Test
    public void testSort(){
        Assert.assertEquals("sort", Rectangulo.class, l[0].getClass());
        g.sort(l);
        Assert.assertEquals("sort", Cuadrado.class, l[3].getClass());
    }
}
