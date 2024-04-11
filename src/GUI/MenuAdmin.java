/*
 * Created by JFormDesigner on Thu Apr 11 16:50:04 BRT 2024
 */

package GUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author pagio
 */
public class MenuAdmin extends JFrame {
    public MenuAdmin() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        MenuAdmins = new JPanel();
        bandeiraUDI1 = new JLabel();
        TextoAdm = new JLabel();
        bandeiraUDI2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== MenuAdmins ========
        {
            MenuAdmins.setLayout(new GridBagLayout());
            ((GridBagLayout)MenuAdmins.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
            ((GridBagLayout)MenuAdmins.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- bandeiraUDI1 ----
            bandeiraUDI1.setIcon(new ImageIcon(getClass().getResource("/GUI/Bandeira_de_Uberl\u00e2ndia.svg.png")));
            MenuAdmins.add(bandeiraUDI1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 18, 13), 0, 0));

            //---- TextoAdm ----
            TextoAdm.setText("MENU DE ADMINSTRADOR");
            TextoAdm.setFont(new Font("Unispace", Font.PLAIN, 18));
            MenuAdmins.add(TextoAdm, new GridBagConstraints(3, 1, 6, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 18, 13), 0, 0));

            //---- bandeiraUDI2 ----
            bandeiraUDI2.setIcon(new ImageIcon(getClass().getResource("/GUI/Bandeira_de_Uberl\u00e2ndia.svg.png")));
            MenuAdmins.add(bandeiraUDI2, new GridBagConstraints(9, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 18, 13), 0, 0));

            //---- button1 ----
            button1.setText("Consultar");
            MenuAdmins.add(button1, new GridBagConstraints(8, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 18, 13), 0, 0));

            //---- button2 ----
            button2.setText("Cadastrar");
            MenuAdmins.add(button2, new GridBagConstraints(8, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 18, 13), 0, 0));

            //---- button3 ----
            button3.setText("Remover");
            MenuAdmins.add(button3, new GridBagConstraints(8, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 13), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel MenuAdmins;
    private JLabel bandeiraUDI1;
    private JLabel TextoAdm;
    private JLabel bandeiraUDI2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
