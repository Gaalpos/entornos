//Código original
public class Matricula {
    String tipo;
    int bonus;
    int antiguedad;
    int base;
     
    public float calcularCosteMatricula() {
       switch(tipo) {
           case 'FAMILIA NUMEROSA': return base - bonus;
           case 'REPETIDOR': return base * antiguedad - bonus;
           case 'NORMAL': return base;
           default: return 0;
       }
    }
     
    }
    

//Código limpio
public class Matricula {
    String tipo;
    int bonus, antiguedad, matricula;  //puede ir todo en una sola línea
     
    public float calcularCosteMatricula() {
       switch(tipo) {
           case 'FAMILIA NUMEROSA': return base - bonus;
           case 'REPETIDOR': return base * antiguedad - bonus;
           case 'NORMAL': return base;
           default: return 0;
       }
    }
     
    }
    