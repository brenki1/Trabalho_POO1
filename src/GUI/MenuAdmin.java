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
        initComponentsADM();
    }

    private void initComponentsADM() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        MenuAdmins = new JPanel();
        bandeiraUDI1 = new JLabel();
        TextoAdm = new JLabel();
        bandeiraUDI2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button5 = new JButton();
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
        buscADM = new JPanel();
        CPFbusca = new JLabel();
        txtCPFbusca = new JTextField();
        okBusca = new JButton();
        cancelBusca = new JButton();
        menuCads = new JPanel();
        CadsADM = new JLabel();
        CADcompAer = new JButton();
        cadHotel = new JButton();
        CadFunc = new JButton();
        CIAAER = new JPanel();
        msgCadAer = new JLabel();
        CNPJAer = new JLabel();
        txtCNPJAER = new JTextField();
        NomeoffAer = new JLabel();
        txtNomeoff = new JTextField();
        NomeDivulgacaoAer = new JLabel();
        txtNomeDiv = new JTextField();
        dataCriacaoAer = new JLabel();
        txtDataCriacaoAer = new JTextField();
        okAer = new JButton();
        var cancelAer = new JButton();
        CadHotel = new JPanel();
        msgCadHotel = new JLabel();
        CNPJHotel = new JLabel();
        txtCNPJHOTEL = new JTextField();
        NomeoffAer2 = new JLabel();
        txtNomeoff2 = new JTextField();
        NomeDivulgacaoAer2 = new JLabel();
        txtNomeDiv2 = new JTextField();
        dataCriacaoHotel = new JLabel();
        txtDataCriacaoHotel = new JTextField();
        EndHotel = new JLabel();
        txtEndHotel = new JTextField();
        AccPets = new JLabel();
        petNao = new JCheckBoxMenuItem();
        petSIm = new JCheckBoxMenuItem();
        NroQuarto1 = new JLabel();
        var txtQSingle = new JTextField();
        NroQuarto2 = new JLabel();
        var txtQDuplo = new JTextField();
        NroQuarto3 = new JLabel();
        txtTriplo = new JTextField();
        Estrelas = new JLabel();
        txtEstrelas = new JTextField();

        //======== MenuAdmins ========
        {
            MenuAdmins.setLayout(new GridBagLayout());
            ((GridBagLayout)MenuAdmins.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)MenuAdmins.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

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
                new Insets(0, 0, 18, 13), 0, 0));

            //---- button5 ----
            button5.setText("Cadastros");
            MenuAdmins.add(button5, new GridBagConstraints(8, 5, 1, 1, 0.0, 0.0,
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

        //======== buscADM ========
        {
            buscADM.setLayout(new GridBagLayout());
            ((GridBagLayout)buscADM.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)buscADM.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
            ((GridBagLayout)buscADM.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)buscADM.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- CPFbusca ----
            CPFbusca.setText("CPF da busca:");
            buscADM.add(CPFbusca, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            buscADM.add(txtCPFbusca, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- okBusca ----
            okBusca.setText("OK");
            buscADM.add(okBusca, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- cancelBusca ----
            cancelBusca.setText("Cancel");
            buscADM.add(cancelBusca, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }

        //======== menuCads ========
        {
            menuCads.setLayout(new GridBagLayout());
            ((GridBagLayout)menuCads.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)menuCads.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- CadsADM ----
            CadsADM.setText("CADASTROS:");
            menuCads.add(CadsADM, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- CADcompAer ----
            CADcompAer.setText("Companhia Aerea");
            menuCads.add(CADcompAer, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- cadHotel ----
            cadHotel.setText("Hotel");
            menuCads.add(cadHotel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- CadFunc ----
            CadFunc.setText("Funcionario");
            menuCads.add(CadFunc, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        }

        //======== CIAAER ========
        {
            CIAAER.setLayout(new GridBagLayout());
            ((GridBagLayout)CIAAER.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CIAAER.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CIAAER.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)CIAAER.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- msgCadAer ----
            msgCadAer.setText("CADASTRO COMPANHIA AEREA");
            CIAAER.add(msgCadAer, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- CNPJAer ----
            CNPJAer.setText("CNPJ:");
            CIAAER.add(CNPJAer, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CIAAER.add(txtCNPJAER, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NomeoffAer ----
            NomeoffAer.setText("Nome Oficial:");
            CIAAER.add(NomeoffAer, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CIAAER.add(txtNomeoff, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NomeDivulgacaoAer ----
            NomeDivulgacaoAer.setText("Nome Divulga\u00e7\u00e3o:");
            CIAAER.add(NomeDivulgacaoAer, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CIAAER.add(txtNomeDiv, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- dataCriacaoAer ----
            dataCriacaoAer.setText("Data cria\u00e7\u00e3o:");
            CIAAER.add(dataCriacaoAer, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CIAAER.add(txtDataCriacaoAer, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- okAer ----
            okAer.setText("OK");
            CIAAER.add(okAer, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- cancelAer ----
            cancelAer.setText("Cancel");
            CIAAER.add(cancelAer, new GridBagConstraints(6, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
        }

        //======== CadHotel ========
        {
            CadHotel.setLayout(new GridBagLayout());
            ((GridBagLayout)CadHotel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CadHotel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)CadHotel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)CadHotel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- msgCadHotel ----
            msgCadHotel.setText("CADASTRO HOTEL");
            CadHotel.add(msgCadHotel, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- CNPJHotel ----
            CNPJHotel.setText("CNPJ:");
            CadHotel.add(CNPJHotel, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtCNPJHOTEL, new GridBagConstraints(3, 3, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NomeoffAer2 ----
            NomeoffAer2.setText("Nome Oficial:");
            CadHotel.add(NomeoffAer2, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtNomeoff2, new GridBagConstraints(3, 4, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NomeDivulgacaoAer2 ----
            NomeDivulgacaoAer2.setText("Nome Divulga\u00e7\u00e3o:");
            CadHotel.add(NomeDivulgacaoAer2, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtNomeDiv2, new GridBagConstraints(3, 5, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- dataCriacaoHotel ----
            dataCriacaoHotel.setText("Data cria\u00e7\u00e3o:");
            CadHotel.add(dataCriacaoHotel, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtDataCriacaoHotel, new GridBagConstraints(3, 6, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- EndHotel ----
            EndHotel.setText("Endere\u00e7o:");
            CadHotel.add(EndHotel, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtEndHotel, new GridBagConstraints(3, 7, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- AccPets ----
            AccPets.setText("Aceita Pets?");
            CadHotel.add(AccPets, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- petNao ----
            petNao.setText("N\u00e3o");
            CadHotel.add(petNao, new GridBagConstraints(2, 8, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- petSIm ----
            petSIm.setText("Sim");
            CadHotel.add(petSIm, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NroQuarto1 ----
            NroQuarto1.setText("Nro Quartos Single:");
            CadHotel.add(NroQuarto1, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtQSingle, new GridBagConstraints(3, 9, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NroQuarto2 ----
            NroQuarto2.setText("Nro Quartos Duplos:");
            CadHotel.add(NroQuarto2, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtQDuplo, new GridBagConstraints(3, 10, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- NroQuarto3 ----
            NroQuarto3.setText("Nro Quartos Triplos:");
            CadHotel.add(NroQuarto3, new GridBagConstraints(1, 11, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            CadHotel.add(txtTriplo, new GridBagConstraints(3, 11, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- Estrelas ----
            Estrelas.setText("Estrelas:");
            CadHotel.add(Estrelas, new GridBagConstraints(1, 12, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
            CadHotel.add(txtEstrelas, new GridBagConstraints(3, 12, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel MenuAdmins;
    private JLabel bandeiraUDI1;
    private JLabel TextoAdm;
    private JLabel bandeiraUDI2;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    private JButton button5;
    private JPanel Remover;
    private JLabel label1;
    public JTextField fieldRemov;
    public JButton confirmaRemov;
    public JButton voltaRemov;
    private JPanel CadastroClienteADM;
    private JLabel nomeADM;
    public JTextField txtNM;
    private JLabel CPFADM;
    public JTextField txtCPF;
    private JLabel EndADM;
    public JTextField textEND;
    private JLabel EMAILAdm;
    public JTextField txtEmail;
    private JLabel NASAdm;
    public JTextField txtNAS;
    private JPanel botaoCad;
    public JButton okCADADM;
    public JButton cancelCADADM;
    private JPanel buscADM;
    private JLabel CPFbusca;
    private JTextField txtCPFbusca;
    public JButton okBusca;
    public JButton cancelBusca;
    public JPanel menuCads;
    private JLabel CadsADM;
    public JButton CADcompAer;
    public JButton cadHotel;
    public JButton CadFunc;
    public JPanel CIAAER;
    public JLabel msgCadAer;
    private JLabel CNPJAer;
    public JTextField txtCNPJAER;
    private JLabel NomeoffAer;
    public JTextField txtNomeoff;
    private JLabel NomeDivulgacaoAer;
    public JTextField txtNomeDiv;
    private JLabel dataCriacaoAer;
    public JTextField txtDataCriacaoAer;
    public JButton okAer;
    public JPanel CadHotel;
    public JLabel msgCadHotel;
    private JLabel CNPJHotel;
    public JTextField txtCNPJHOTEL;
    private JLabel NomeoffAer2;
    public JTextField txtNomeoff2;
    private JLabel NomeDivulgacaoAer2;
    public JTextField txtNomeDiv2;
    private JLabel dataCriacaoHotel;
    public JTextField txtDataCriacaoHotel;
    private JLabel EndHotel;
    public JTextField txtEndHotel;
    private JLabel AccPets;
    public JCheckBoxMenuItem petNao;
    public JCheckBoxMenuItem petSIm;
    private JLabel NroQuarto1;
    private JLabel NroQuarto2;
    private JLabel NroQuarto3;
    public JTextField txtTriplo;
    private JLabel Estrelas;
    public JTextField txtEstrelas;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
