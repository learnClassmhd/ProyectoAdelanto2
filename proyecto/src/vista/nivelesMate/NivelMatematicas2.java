package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelMatematicas2 extends PanelNivel{

    public NivelMatematicas2() throws NumberAnswers{        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("624-24");
        
        pregunta.getListaRespuestas().add("600");
        pregunta.getListaRespuestas().add("530");
        pregunta.getListaRespuestas().add("620");
        pregunta.setRespuestaCorrecta("600");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("3149-123");
        
        pregunta.getListaRespuestas().add("3026");
        pregunta.getListaRespuestas().add("2127");
        pregunta.getListaRespuestas().add("3218");
        pregunta.setRespuestaCorrecta("3026");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("5146-3214");
        
        pregunta.getListaRespuestas().add("1932");
        pregunta.getListaRespuestas().add("1924");
        pregunta.getListaRespuestas().add("2845");
        pregunta.setRespuestaCorrecta("1932");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("8362-4637");
        
        pregunta.getListaRespuestas().add("3725");
        pregunta.getListaRespuestas().add("4231");
        pregunta.getListaRespuestas().add("3123");
        pregunta.setRespuestaCorrecta("3725");
        listaPreguntas.add(pregunta);  
        
        crearCartas(listaPreguntas);
    }
    
    
}
