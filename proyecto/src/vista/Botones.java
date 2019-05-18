package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botones extends JButton{
    
    private JPanel nivel;
   
    public Botones() {
    }

    public Botones(JPanel nivel) {
        this.nivel = nivel;
    }
    
    
    public void niveles (){
        JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            ventanaJuego.add(getNivel());
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
    }

    /**
     * @return the nivel
     */
    public JPanel getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(JPanel nivel) {
        this.nivel = nivel;
    }
    
}
