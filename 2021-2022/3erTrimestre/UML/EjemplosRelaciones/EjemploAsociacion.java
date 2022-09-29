package EjemplosRelaciones;
// asociación

interface drivable {
    public void drive();
}

class vehicle implements drivable {
    String registration;
    int seats;
    public void drive();
}

class Taxi extends vehicle {
    Chofer chofer;
    Customer customers[];
}

class Chofer {
    String name;
    String surname;
    Taxi taxi;
}

class Mechanic {
    String nombre;

    void fix(Taxi taxi) {
        //
    }

    void paint(Taxi taxi, Paint paint) {

    }
}

class Customer {
    String name;
    String surname;

}

public class EjemploAsociacion {
    public static void main(String[] args) {
        Chofer alonso = new Chofer();
    }

}