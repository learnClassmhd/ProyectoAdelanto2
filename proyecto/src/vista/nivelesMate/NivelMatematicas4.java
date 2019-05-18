package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelMatematicas4 extends PanelNivel{

    public NivelMatematicas4() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("120/3");
        
        pregunta.getListaRespuestas().add("40");
        pregunta.getListaRespuestas().add("12");
        pregunta.getListaRespuestas().add("42");
        pregunta.setRespuestaCorrecta("40");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("130/17");
        
        pregunta.getListaRespuestas().add("7,64");
        pregunta.getListaRespuestas().add("8,84");
        pregunta.getListaRespuestas().add("6,64");
        pregunta.setRespuestaCorrecta("7,64");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("154/7");
        
        pregunta.getListaRespuestas().add("22");
        pregunta.getListaRespuestas().add("12");
        pregunta.getListaRespuestas().add("23");
        pregunta.setRespuestaCorrecta("22");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("321/65");
        
        pregunta.getListaRespuestas().add("4,93");
        pregunta.getListaRespuestas().add("3,34");
        pregunta.getListaRespuestas().add("5,83");
        pregunta.setRespuestaCorrecta("4,93");
        listaPreguntas.add(pregunta); 
        
        crearCartas(listaPreguntas);
    }
}
