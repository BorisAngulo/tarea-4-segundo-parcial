
/**
 * Write a description of class Ladron here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
    private String materia;
    
    public Profesor(String nombre, int edad, String sexo, String materia){
        super(nombre, edad, sexo);
        this.materia = materia;
    }
    
    public String calificar(){

        return "calificando la materia de: " + materia;
    }
}
