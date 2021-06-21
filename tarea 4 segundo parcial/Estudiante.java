
/**
 * Write a description of class Policia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante extends Persona{
    private boolean esFlojo;
    
    public Estudiante(String nombre, int edad, String sexo, boolean esFlojo){
        super(nombre, edad, sexo);
        this.esFlojo = esFlojo;
    }
    
    public String darExamen(){
        if(esFlojo = true){
            return "ya reprobe para que esforzarme";
        }
        else{
            return "haber como me fue";
        }
        
    }
    
    
}
