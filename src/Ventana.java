import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel panel;
    private JList lstJugadores;
    private JButton btnSumar;
    private JLabel lblValor;
    private JComboBox comboBox1;
    private JLabel lblValor2;
    private JButton btnBuscar;
    private Equipo equipo1=new Equipo();
    public Ventana() {
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel dlm=new DefaultListModel();
                for (int i = 0; i < equipo1.size(); i++) {
                    dlm.addElement(equipo1.getJugador(i).toString());
                }
                lstJugadores.setModel(dlm);
                lblValor.setText("El valor total es: "+equipo1.valorTolar());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
