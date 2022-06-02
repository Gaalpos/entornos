import java.util.Date;

interface Comestible {
    public void comer();
}

class Comida implements Comestible {
    public String titulo;
    protected Ingrediente ingredientes[];

    public void comer() {

    }
}

class CompotaDeManzana extends Comida {

}

class PolloALaPantoja extends Comida {

}

class Ingrediente {
    public String nombre;
    public Date fechaCaducidad;
}

class Localizacion {
    public String calle;
    public String numero;
    public String ciudad;
}

class Restaurante {
    public String nombre;
    public Localizacion localizacion;
    public Cheff cheff;
}

class Cheff {
    public String nombre;
    public Restaurante empleos[];

    void elaborarComida(Comida comida) {
        // trabando....
    }
}

public class Ejercicio {
    public static void main(String[] args) {
        Restaurante pataNegra= new Restaurante();
        Cheff arguiñano
    }
}