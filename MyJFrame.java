import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
       
        setTitle("Mi Ventana");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        myLabel = new JLabel("Hola Mundo");
        add(myLabel); 
        
        setVisible(true); 
    }

    public static void main(String[] args) {
        new MyJFrame(); 
    }
}
