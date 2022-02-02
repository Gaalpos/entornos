class Persona {
    public void drinkCoffe() {

    }
    
}

class Cafetera {

    static Persona owner;
    static boolean isCoffeDone = true;
    public static int sugarLevel = 0;

    public static void iWandCoffe() {
        if (isCoffeDone) {
            warmCoffe();
        } else {
            makeCoffe();
        }
        serveOnCup();
        addSugar();
        while (sugarLevel > 3) { // esta dulce
            addSugar();
        }
        owner.drinkCoffe();

    }

    public static void addSugar() {
        sugarLevel++;
    }

    public static void warmCoffe() {

    }

    public static void makeCoffe() {

    }

    public static void serveOnCup() {

    }

    public static void main(String[] args) {
        iWandCoffe();
    }
}