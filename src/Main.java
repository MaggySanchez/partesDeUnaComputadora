import Computadoras.Computadora;
import Computadoras.DiscoRigido;
import Computadoras.Memoria;
import Computadoras.Procesador;

public class Main {
    public static void main(String[] args) {
        DiscoRigido disco1 = new DiscoRigido("Expansion",16.0,1200.0);
        Procesador procesador1 = new Procesador("Intel","Pentium 5",500.0);
        Memoria memoria1 = new Memoria(8.0, "Supreme");

        Computadora HP = new Computadora("HP","S456T",2020,"A",disco1,procesador1,memoria1);
        System.out.println(HP);
        HP.encender();
        HP.apagar();
    }

    }