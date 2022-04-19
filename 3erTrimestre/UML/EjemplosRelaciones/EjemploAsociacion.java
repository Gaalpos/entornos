package EjemplosRelaciones;
// asociación

class Taxi{
String registration;
int seats;
Chofer chofer;
Customer customers[];

}

class Chofer{
String name;
String surname;
Taxi taxi;
}

class Mechanic{
    String nombre;
    void fix{Taxi taxi}{
        //
    }
}

class Customer{
String name;
String surname;

}
public class EjemploAsociacion{
    public static void main(String[] args) {
        Chofer alonso = new Chofer();
    }

}