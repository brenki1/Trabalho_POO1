package GUI;

import Classes.Cliente;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {

        initComponentsMenuPrinc();
        initComponentsMenuLogin();
        initComponentsLogarCliente();
        initComponentsCADCliente();
        TrataBotoes tratador = new TrataBotoes();
        butCliente.addActionListener(tratador);
        Cadastrar.addActionListener(tratador);
        Logar.addActionListener(tratador);
        okButton.addActionListener(tratador);
        okButton2.addActionListener(tratador);
        cancelButton.addActionListener(tratador);
        cancelButton2.addActionListener(tratador);
    }



    private void butClienteMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponentsMenuPrinc() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        MenuPrincipal = new JPanel();
        msgBemvindoPrinc = new JLabel();
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
            ((GridBagLayout)MenuPrincipal.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)MenuPrincipal.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- msgBemvindoPrinc ----
            msgBemvindoPrinc.setText("Seja bem-vindo ao Udi-Decola!");
            msgBemvindoPrinc.setFont(msgBemvindoPrinc.getFont().deriveFont(msgBemvindoPrinc.getFont().getStyle() | Font.BOLD, msgBemvindoPrinc.getFont().getSize() + 5f));
            MenuPrincipal.add(msgBemvindoPrinc, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
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
            MenuPrincipal.add(butAdm, new GridBagConstraints(1, 4, 1, 1, -9.0, -8.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 33, 16), 0, 0));
        }

        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public void initComponentsMenuLogin () {

        ClienteLogin = new JPanel();
        Pergunta = new JLabel();
        Logar = new JButton();
        Pergunta2 = new JLabel();
        Cadastrar = new JButton();

        ///======== ClienteLogin ========
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

            //---- Cadastrar ----
            Cadastrar.setText("Cadastro");
            ClienteLogin.add(Cadastrar, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));
        }
    }

    public void initComponentsLogarCliente () {

        LoginCliente = new JPanel();
        LogCPF = new JLabel();
        CPFLogInsert = new JTextField();
        LogEmail = new JLabel();
        EmailLogInsert = new JTextField();
        botaoLogin = new JPanel();
        okButton2 = new JButton();
        cancelButton2 = new JButton();

        //======== LoginCliente ========
        {
            LoginCliente.setLayout(new GridBagLayout());
            ((GridBagLayout)LoginCliente.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)LoginCliente.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- LogCPF ----
            LogCPF.setText("CPF:");
            LoginCliente.add(LogCPF, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            LoginCliente.add(CPFLogInsert, new GridBagConstraints(1, 2, 6, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- LogEmail ----
            LogEmail.setText("Email:");
            LoginCliente.add(LogEmail, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            LoginCliente.add(EmailLogInsert, new GridBagConstraints(1, 4, 6, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

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
            LoginCliente.add(botaoLogin, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 0, 0), 0, 0));
        }

    }

    public void initComponentsCADCliente() {

        CadastroCliente = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        textField2 = new JTextField();
        label5 = new JLabel();
        textField3 = new JTextField();
        label6 = new JLabel();
        textField4 = new JTextField();
        label7 = new JLabel();
        textField5 = new JTextField();
        botaoCad = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();


        //======== CadastroCliente ========
        {
            CadastroCliente.setLayout(new GridBagLayout());
            ((GridBagLayout)CadastroCliente.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CadastroCliente.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label1 ----
            label1.setText("Nome:");
            CadastroCliente.add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            CadastroCliente.add(textField1, new GridBagConstraints(1, 1, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label4 ----
            label4.setText("CPF:");
            CadastroCliente.add(label4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            CadastroCliente.add(textField2, new GridBagConstraints(1, 2, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label5 ----
            label5.setText("Endere\u00e7o:");
            CadastroCliente.add(label5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            CadastroCliente.add(textField3, new GridBagConstraints(1, 3, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label6 ----
            label6.setText("Email:");
            CadastroCliente.add(label6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            CadastroCliente.add(textField4, new GridBagConstraints(1, 4, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label7 ----
            label7.setText("Data de Nascimento:");
            CadastroCliente.add(label7, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            CadastroCliente.add(textField5, new GridBagConstraints(1, 5, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

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
            CadastroCliente.add(botaoCad, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 0, 0), 0, 0));
        }

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel MenuPrincipal;
    private JLabel msgBemvindoPrinc;
    private JLabel label2;
    private JLabel label3;
    private JLabel msgMenuAcess;
    public JButton butCliente;
    public JButton butAdm;
    public JPanel ClienteLogin;
    private JLabel Pergunta;
    public JButton Logar;
    private JLabel Pergunta2;
    public JButton Cadastrar;
    public JPanel CadastroCliente;
    private JLabel label1;
    public JTextField textField1;
    private JLabel label4;
    public JTextField textField2;
    private JLabel label5;
    public JTextField textField3;
    private JLabel label6;
    public JTextField textField4;
    private JLabel label7;
    public JTextField textField5;
    private JPanel botaoCad;
    public JButton okButton;
    public JButton cancelButton;
    public JPanel LoginCliente;
    private JLabel LogCPF;
    public JTextField CPFLogInsert;
    private JLabel LogEmail;
    public JTextField EmailLogInsert;
    private JPanel botaoLogin;
    public JButton okButton2;
    public JButton cancelButton2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private class TrataBotoes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butCliente) {
                MenuPrincipal.setVisible(false);
                ClienteLogin.setVisible(true);
                setContentPane(ClienteLogin);
            }

            if(e.getSource() == Cadastrar) {
                ClienteLogin.setVisible(false);
                CadastroCliente.setVisible(true);
                setContentPane(CadastroCliente);
            }

            if(e.getSource() == Logar) {
                ClienteLogin.setVisible(false);
                LoginCliente.setVisible(true);
                setContentPane(LoginCliente);
            }

            if(e.getSource() == cancelButton) {
                CadastroCliente.setVisible(false);
                ClienteLogin.setVisible(true);
                setContentPane(ClienteLogin);
            }

            if(e.getSource() == cancelButton2) {
                LoginCliente.setVisible(false);
                ClienteLogin.setVisible(true);
                setContentPane(ClienteLogin);
            }

            if(e.getSource() == okButton) {
                CadastroCliente.setVisible(false);
                ClienteLogin.setVisible(true);
                setContentPane(ClienteLogin);
            }

            if(e.getSource() == okButton2) {
                LoginCliente.setVisible(false);
                ClienteLogin.setVisible(true);
                setContentPane(ClienteLogin);
            }


        }
    }

}
