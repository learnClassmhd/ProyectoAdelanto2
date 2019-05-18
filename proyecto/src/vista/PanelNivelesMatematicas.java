package vista;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.NumberAnswers;
import vista.nivelesMate.NivelMatematicas1;
import vista.nivelesMate.NivelMatematicas2;
import vista.nivelesMate.NivelMatematicas3;
import vista.nivelesMate.NivelMatematicas4;

public class PanelNivelesMatematicas extends PanelNiveles{

    private Ventana ventanaJuego;

    public PanelNivelesMatematicas() throws NumberAnswers {
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae); //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource().equals(getBotones().get(0))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new NivelMatematicas1());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(1))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new NivelMatematicas2());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(2))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new NivelMatematicas3());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(3))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new NivelMatematicas4());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
    }
}
