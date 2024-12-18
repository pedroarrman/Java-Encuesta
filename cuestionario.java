
package cuestionario;

import cuestionario.Encuesta.PuestoDeTrabajo;


public class cuestionario {


    public static void main(String[] args) {
        Encuesta c;
        
        c = new Encuesta ("Daniel", "Martinez", "Martinez", "12345678C", PuestoDeTrabajo.docente);
        c.mostrarInformacion();
        c.preguntas();
        
    }
    	
        
}
