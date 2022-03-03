//Código original

class Newton{
   // Calculamos la velocidad en función del espacio y el tiempo
   float v(float s, float t){
       if(t == 0){
           console.log("Error: tiempo no puede ser 0");
           return -1;
       }
       console.log("Velocidad: " + s/t);
       return s/t;
   }
 
}


//Código limio
class Newton{
    // Calculamos la velocidad en función del espacio y el tiempo

    float velocidad(float espacio, float tiempo){   //usar nombres que revelen intenciones
        int velocidad = espacio/tiempo;          
        if(tiempo == 0){
            console.log("Error: tiempo no puede ser 0");
            return -1;
        }
        
        console.log("Velocidad: " + velocidad);  // crear una variable de un cálculo constante
        return velocidad;
    }
  
 }
 
