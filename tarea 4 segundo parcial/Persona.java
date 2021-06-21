
import javax.swing.JOptionPane;
public class Persona{
    private String nombre;
    private int edad;
    private String sexo;
    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String saludar(){
        if(sexo == "masculino"){
            sexo = "hombre";
        }
        else if(sexo == "femenino"){
            sexo = "mujer";
        }
        else{
            sexo = "de genero fluido....";
        }
        return "Hola mi nombre es " + nombre + " tengo " + edad + " años" + " y soy " + sexo;
    }
    
    public void caminar(){
        JOptionPane.showMessageDialog(null, "caminando....");
    }
    
    public void correr(){
        JOptionPane.showMessageDialog(null, "corriendo....");
    }
}
