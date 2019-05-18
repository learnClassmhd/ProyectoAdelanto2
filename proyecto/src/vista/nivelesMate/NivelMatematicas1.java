package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelMatematicas1 extends PanelNivel{

    public NivelMatematicas1() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("7+3");
        
        pregunta.getListaRespuestas().add("8");
        pregunta.getListaRespuestas().add("10");
        pregunta.getListaRespuestas().add("11");
        pregunta.setRespuestaCorrecta("10");
        listaPreguntas.add(pregunta);        
        
        pregunta = new Pregunta("1099+1");
        
        pregunta.getListaRespuestas().add("1100");
        pregunta.getListaRespuestas().add("2000");
        pregunta.getListaRespuestas().add("1200");
        pregunta.setRespuestaCorrecta("1100");
        listaPreguntas.add(pregunta);        
        
        pregunta = new Pregunta("745+234");
        
        pregunta.getListaRespuestas().add("979");
        pregunta.getListaRespuestas().add("528");
        pregunta.getListaRespuestas().add("965");
        pregunta.setRespuestaCorrecta("979");
        listaPreguntas.add(pregunta);        
        
        pregunta = new Pregunta("1725+4231");
        
        pregunta.getListaRespuestas().add("5956");
        pregunta.getListaRespuestas().add("6956");
        pregunta.getListaRespuestas().add("5234");
        pregunta.setRespuestaCorrecta("5956");
        listaPreguntas.add(pregunta);        
        
        crearCartas(listaPreguntas);
    }
    
}
