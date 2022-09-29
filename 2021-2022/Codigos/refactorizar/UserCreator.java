package refactorizar;

/*
 * class User{
    User(String nombre, String pass) { }
    String nombre;
    String email;
    String password;
}
public class UserCreator{
    boolean valid(String valor){
        if(valor!=null && valor.length()>0) return true;
        else return false;
    }
    User create(String email, String pass){
        if( ! valid(email) ){
            System.out.println("Email incorrecto");
        }else{
            if( valid(pass) ){
                return new User(email, pass);
            }else{
                System.out.println("Password incorrecto");
            }
        }
        return null;
    }
}
 */

class User{
    User(String nombre, String pass) { }
    String nombre;
    String email;
    String password;
}
public class UserCreator{
    boolean valid(String valor){
        if(valor!=null && valor.length()>0) return true;
        else return false;
    }
    User create(String email, String pass) throws Exception{
        // condiciones de error
        if( ! valid(email) ){
            throw new Exception("Email incorrecto");
        }
        if( ! valid(pass) ){
            throw new Exception("Password incorrecto");
        }
       
        return new User(email, pass);
    }
}