/*
 * Created by JFormDesigner on Thu Apr 11 16:50:04 BRT 2024
 */

package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

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
        Remover = new JPanel();
        label1 = new JLabel();
        fieldRemov = new JTextField();
        confirmaRemov = new JButton();
        voltaRemov = new JButton();
        CadastroClienteADM = new JPanel();
        nomeADM = new JLabel();
        txtNM = new JTextField();
        CPFADM = new JLabel();
        txtCPF = new JTextField();
        EndADM = new JLabel();
        textEND = new JTextField();
        EMAILAdm = new JLabel();
        txtEmail = new JTextField();
        NASAdm = new JLabel();
        txtNAS = new JTextField();
        botaoCad = new JPanel();
        okCADADM = new JButton();
        cancelCADADM = new JButton();

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
            TextoAdm.setText("MENU DE ADMINISTRADOR");
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

        //======== Remover ========
        {
            Remover.setLayout(new GridBagLayout());

            //---- label1 ----
            label1.setText("Insira o CPF de quem deseja remover:");
            Remover.add(label1, new GridBagConstraints(2, 1, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 20), 0, 0));
            Remover.add(fieldRemov, new GridBagConstraints(6, 1, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 20), 0, 0));

            //---- confirmaRemov ----
            confirmaRemov.setText("OK");
            Remover.add(confirmaRemov, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 20), 0, 0));

            //---- voltaRemov ----
            voltaRemov.setText("Cancel");
            Remover.add(voltaRemov, new GridBagConstraints(6, 3, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 20), 0, 0));
        }

        //======== CadastroClienteADM ========
        {
            CadastroClienteADM.setLayout(new GridBagLayout());
            ((GridBagLayout)CadastroClienteADM.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CadastroClienteADM.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- nomeADM ----
            nomeADM.setText("Nome:");
            CadastroClienteADM.add(nomeADM, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteADM.add(txtNM, new GridBagConstraints(1, 1, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- CPFADM ----
            CPFADM.setText("CPF:");
            CadastroClienteADM.add(CPFADM, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteADM.add(txtCPF, new GridBagConstraints(1, 2, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- EndADM ----
            EndADM.setText("Endere\u00e7o:");
            CadastroClienteADM.add(EndADM, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteADM.add(textEND, new GridBagConstraints(1, 3, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- EMAILAdm ----
            EMAILAdm.setText("Email:");
            CadastroClienteADM.add(EMAILAdm, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteADM.add(txtEmail, new GridBagConstraints(1, 4, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- NASAdm ----
            NASAdm.setText("Data de Nascimento:");
            CadastroClienteADM.add(NASAdm, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteADM.add(txtNAS, new GridBagConstraints(1, 5, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //======== botaoCad ========
            {
                botaoCad.setBorder(new EmptyBorder(12, 0, 0, 0));
                botaoCad.setLayout(new GridBagLayout());
                ((GridBagLayout)botaoCad.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)botaoCad.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okCADADM ----
                okCADADM.setText("OK");
                botaoCad.add(okCADADM, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelCADADM ----
                cancelCADADM.setText("Cancel");
                botaoCad.add(cancelCADADM, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            CadastroClienteADM.add(botaoCad, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 0, 0));
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
    private JPanel Remover;
    private JLabel label1;
    private JTextField fieldRemov;
    private JButton confirmaRemov;
    private JButton voltaRemov;
    private JPanel CadastroClienteADM;
    private JLabel nomeADM;
    private JTextField txtNM;
    private JLabel CPFADM;
    private JTextField txtCPF;
    private JLabel EndADM;
    private JTextField textEND;
    private JLabel EMAILAdm;
    private JTextField txtEmail;
    private JLabel NASAdm;
    private JTextField txtNAS;
    private JPanel botaoCad;
    private JButton okCADADM;
    private JButton cancelCADADM;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
