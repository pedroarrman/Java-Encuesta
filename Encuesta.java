

package cuestionario;

import java.util.*;
public class Encuesta {
    
    String nombre;
    String apellido1;
    String apellido2;
    String nrp;
    enum PuestoDeTrabajo {docente, interino, refuerzo};
    PuestoDeTrabajo puesto;
    
    
    // Constructor     
    Encuesta (String nombre, String apellido1, String apellido2, String dni, PuestoDeTrabajo puesto){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nrp = nrp;
        this.puesto = puesto;
    }
    
    
    void mostrarInformacion (){
    	System.out.println("nombre: "+nombre);   
    	System.out.println("apellidos: "+apellido1+" "+apellido2); 
    	System.out.println("nrp: "+nrp); 
    	System.out.println("puesto de trabajo:"+puesto); 
        System.out.println(" ");    
    }
     
    static String preguntas(){

        Scanner sc = new Scanner(System.in);
    int contador=0;  
    int recorrido=0;
	
	int [] sentimiento = new int [13];

        String[] preguntas = new String[13];
        
        preguntas[0] = "alegría: ";
        preguntas[1] = "interesada/o en la vida: ";  
        preguntas[2] = "satisfecha/o: ";         
        preguntas[3] = "que tengo algo importante que contribuir a la sociedad: ";         
        preguntas[4] = "que pertenezco a una comunidad (a un grupo social como la escuela o el vecindario): ";        
        preguntas[5] = "que nuestra sociedad es un buen lugar para personas como Yo): ";
        preguntas[6] = "que las personas son básicamente buenas: ";  
        preguntas[7] = "que la dirección en que va nuestra sociedad tiene sentido para mi: ";        
        preguntas[8] = "que me gusta la mayor parte de mi personalidad: ";
        preguntas[9] = "que he tenido una buena gestión de mis responsabilidades cotidianas: ";
        preguntas[10] = "que mis relaciones con los demás han sido cálidas y de confianza: ";
        preguntas[11] = "que mis experiencias me han planteado desafíos para crecer y llegar a ser mejor persona: ";
        preguntas[12] = "confianza al pensar o expresar mis propias ideas y opiniones: "; 




System.out.println(" Por favor, conteste a las siguientes preguntas según cómo se ha sentido Vd. durante el último mes. Marque en el recuadro la respuesta que le representa mejor. Recuerde que debe rellenar todos los ítems.");
System.out.println(" ");
System.out.println("Recuerde que: 1 = nunca, 2 = pocas veces, 3 = bastantes veces, 4 = muchas veces y 5 = siempre");
System.out.println(" ");
for (contador=0; contador<13; contador++){
System.out.println(" ");
for (recorrido=0; recorrido<13; recorrido++){
System.out.println((recorrido+1)+" "+preguntas[recorrido]);

	sentimiento[contador]= sc.nextInt();

	while(sentimiento[contador]<1 || sentimiento[contador]>5){

System.out.println("Error, conteste con un número del 1 al 5");
System.out.println("  ");
System.out.println("Recuerde que: 1 = nunca, 2 = pocas veces, 3 = bastantes veces, 4 = muchas veces y 5 = siempre");
	sentimiento[contador]= sc.nextInt();
	}
        contador++;
    }

System.out.println("Resultado de la encuesta: ");
System.out.println(Arrays.toString(sentimiento)); 
        }
//System.out.println("Resultado de la encuesta: ");
        return (Arrays.toString(sentimiento));    
    }
}

    

