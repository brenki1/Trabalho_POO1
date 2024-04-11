package GUI;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.border.*;

/*
 * Created by JFormDesigner on Wed Apr 10 19:31:37 BRT 2024
 */



/**
 * @author pagio
 */
public class InterfaceGrafica extends JFrame {
    public InterfaceGrafica() {
        initComponents();
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        MenuPrincipal = new JPanel();
        msgBemvindoPrinc = new JLabel();
        butFunc = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        msgMenuAcess = new JLabel();
        butCliente = new JButton();
        butAdm = new JButton();

        //======== MenuPrincipal ========
        {
            MenuPrincipal.setMinimumSize(new Dimension(1280, 720));
            MenuPrincipal.setMaximumSize(new Dimension(1280, 720));
            MenuPrincipal.setBorder(new MatteBorder(2, 1, 1, 1, Color.black));
            MenuPrincipal.setPreferredSize(new Dimension(1280, 720));
            MenuPrincipal.setLayout(new GridBagLayout());
            ((GridBagLayout)MenuPrincipal.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)MenuPrincipal.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- msgBemvindoPrinc ----
            msgBemvindoPrinc.setText("Seja bem-vindo ao Udi-Decola!");
            msgBemvindoPrinc.setFont(msgBemvindoPrinc.getFont().deriveFont(msgBemvindoPrinc.getFont().getStyle() | Font.BOLD, msgBemvindoPrinc.getFont().getSize() + 5f));
            MenuPrincipal.add(msgBemvindoPrinc, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 16), 0, 0));

            //---- butFunc ----
            butFunc.setText("Funcion\u00e1rio");
            butFunc.setAlignmentX(10.0F);
            MenuPrincipal.add(butFunc, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 16), 0, 0));

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/GUI/3293559.png")));
            MenuPrincipal.add(label2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 0), 0, 0));

            //---- label3 ----
            label3.setIcon(new ImageIcon(getClass().getResource("/GUI/Bandeira_de_Uberl\u00e2ndia.svg.png")));
            MenuPrincipal.add(label3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 16), 0, 0));

            //---- msgMenuAcess ----
            msgMenuAcess.setText("Por favor, selecione como deseja acessar o sistema:");
            msgMenuAcess.setFont(msgMenuAcess.getFont().deriveFont(msgMenuAcess.getFont().getSize() + 2f));
            MenuPrincipal.add(msgMenuAcess, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 16), 0, 0));

            //---- butCliente ----
            butCliente.setText("Cliente");
            MenuPrincipal.add(butCliente, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 16), 0, 0));

            //---- butAdm ----
            butAdm.setText("Admin");
            MenuPrincipal.add(butAdm, new GridBagConstraints(1, 8, 1, 1, -9.0, -8.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 16), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel MenuPrincipal;
    private JLabel msgBemvindoPrinc;
    private JButton butFunc;
    private JLabel label2;
    private JLabel label3;
    private JLabel msgMenuAcess;
    private JButton butCliente;
    private JButton butAdm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public static void main(String[] args) {
        InterfaceGrafica UITeste = new InterfaceGrafica();
        UITeste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UITeste.initComponents();
        UITeste.setVisible(true);
        UITeste.setContentPane(UITeste.MenuPrincipal);
        UITeste.setSize(638,500);
        UITeste.setTitle("UDI-Decola");
        UITeste.setResizable(true);


    }
}
