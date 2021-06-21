
/**
 * Write a description of class Testigo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class director extends Persona{
    private String colegio;
    
    public director(String nombre, int edad, String sexo, String colegio){
        super(nombre, edad, sexo);
        this.colegio = colegio;
    }
    
    public String DarAnuncio(){
        
        return "Estudiantes del colegio " + colegio + " se dara un anuncio atencion....";
    }
    
}
