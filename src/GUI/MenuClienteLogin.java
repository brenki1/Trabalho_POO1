/*
 * Created by JFormDesigner on Thu Apr 11 14:11:33 BRT 2024
 */

package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author pagio
 */
public class MenuClienteLogin extends JFrame{
    public MenuClienteLogin() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ClienteLogin = new JPanel();
        Pergunta = new JLabel();
        Logar = new JButton();
        Pergunta2 = new JLabel();
        button1 = new JButton();
        CadastroCliente = new JDialog();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        botaoCad = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        LoginCliente = new JDialog();
        label6 = new JLabel();
        textField6 = new JTextField();
        label8 = new JLabel();
        textField8 = new JTextField();
        botaoLogin = new JPanel();
        okButton2 = new JButton();
        cancelButton2 = new JButton();

        //======== ClienteLogin ========
        {
            ClienteLogin.setLayout(new GridBagLayout());

            //---- Pergunta ----
            Pergunta.setText("J\u00e1 possui uma conta?");
            Pergunta.setFont(Pergunta.getFont().deriveFont(Pergunta.getFont().getSize() + 3f));
            Pergunta.setHorizontalAlignment(SwingConstants.LEFT);
            ClienteLogin.add(Pergunta, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 20, 5), 0, 0));

            //---- Logar ----
            Logar.setText("Fazer Login");
            ClienteLogin.add(Logar, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 20, 5), 0, 0));

            //---- Pergunta2 ----
            Pergunta2.setText("N\u00e3o possui uma conta?");
            Pergunta2.setFont(Pergunta2.getFont().deriveFont(Pergunta2.getFont().getSize() + 3f));
            ClienteLogin.add(Pergunta2, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 20, 5), 0, 0));

            //---- button1 ----
            button1.setText("Cadastro");
            ClienteLogin.add(button1, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
        }

        //======== CadastroCliente ========
        {
            CadastroCliente.setAlwaysOnTop(true);
            var CadastroClienteContentPane = CadastroCliente.getContentPane();
            CadastroClienteContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)CadastroClienteContentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CadastroClienteContentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label1 ----
            label1.setText("Nome:");
            CadastroClienteContentPane.add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteContentPane.add(textField1, new GridBagConstraints(1, 1, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- label2 ----
            label2.setText("CPF:");
            CadastroClienteContentPane.add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteContentPane.add(textField2, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- label3 ----
            label3.setText("Endere\u00e7o:");
            CadastroClienteContentPane.add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteContentPane.add(textField3, new GridBagConstraints(1, 3, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- label4 ----
            label4.setText("Email:");
            CadastroClienteContentPane.add(label4, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadastroClienteContentPane.add(textField4, new GridBagConstraints(1, 4, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //======== botaoCad ========
            {
                botaoCad.setBorder(new EmptyBorder(12, 0, 0, 0));
                botaoCad.setLayout(new GridBagLayout());
                ((GridBagLayout)botaoCad.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)botaoCad.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                botaoCad.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                botaoCad.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            CadastroClienteContentPane.add(botaoCad, new GridBagConstraints(5, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 0, 0));
            CadastroCliente.setSize(450, 240);
            CadastroCliente.setLocationRelativeTo(CadastroCliente.getOwner());
        }

        //======== LoginCliente ========
        {
            LoginCliente.setAlwaysOnTop(true);
            var LoginClienteContentPane = LoginCliente.getContentPane();
            LoginClienteContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)LoginClienteContentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)LoginClienteContentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label6 ----
            label6.setText("CPF:");
            LoginClienteContentPane.add(label6, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            LoginClienteContentPane.add(textField6, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- label8 ----
            label8.setText("Email:");
            LoginClienteContentPane.add(label8, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            LoginClienteContentPane.add(textField8, new GridBagConstraints(1, 4, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //======== botaoLogin ========
            {
                botaoLogin.setBorder(new EmptyBorder(12, 0, 0, 0));
                botaoLogin.setLayout(new GridBagLayout());
                ((GridBagLayout)botaoLogin.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)botaoLogin.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton2 ----
                okButton2.setText("OK");
                botaoLogin.add(okButton2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton2 ----
                cancelButton2.setText("Cancel");
                botaoLogin.add(cancelButton2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            LoginClienteContentPane.add(botaoLogin, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 0, 0));
            LoginCliente.setSize(415, 240);
            LoginCliente.setLocationRelativeTo(LoginCliente.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel ClienteLogin;
    private JLabel Pergunta;
    private JButton Logar;
    private JLabel Pergunta2;
    private JButton button1;
    public JDialog CadastroCliente;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JPanel botaoCad;
    private JButton okButton;
    private JButton cancelButton;
    public JDialog LoginCliente;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label8;
    private JTextField textField8;
    private JPanel botaoLogin;
    private JButton okButton2;
    private JButton cancelButton2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
