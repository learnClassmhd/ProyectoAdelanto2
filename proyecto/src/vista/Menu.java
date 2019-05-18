package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.NumberAnswers;

public class Menu extends JPanel implements ActionListener{
    
    private Image fondo = new ImageIcon("recursos\\landscape.jpg").getImage();
    private ImageIcon inglesB;
    private ImageIcon mathB ;
    private JButton ingles, matematicas;
    public Menu(){
        setLayout(null);
        
       inglesB = new ImageIcon("recursos\\bEnglish.jpeg");
       
       ingles = new JButton();
       ingles.setBounds(350, 320, 260, 110);
       ingles.setIcon(inglesB);
       
       mathB = new ImageIcon("recursos\\bMath.jpeg");
       
       matematicas = new JButton();
       matematicas.setBounds(350, 460, 300, 120);
       matematicas.setIcon(mathB);
       
        //Reproductor.reproducir(new File("C:\\Users\\acer\\Desktop\\Koibumi.wav"));
       add(matematicas);
       add(ingles);
       setFocusable(false);
       ingles.addActionListener(this);
       matematicas.addActionListener(this);
       //addKeyListener(this);
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(fondo,  0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(ingles)){
            JFrame ventana = (JFrame)(getParent().getParent().getParent().getParent());
            ventana.remove(this);
            try {
                ventana.add(new PanelNivelesIngles());
            } catch (NumberAnswers ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ventana.validate();
            ventana.repaint();
        }
        if(ae.getSource().equals(matematicas)){
            JFrame ventana = (JFrame)(getParent().getParent().getParent().getParent());
            ventana.remove(this);
            try {
                ventana.add(new PanelNivelesMatematicas());
            } catch (NumberAnswers ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ventana.validate();
            ventana.repaint();
        }
    }
    
}
