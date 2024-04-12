package Classes;

import Dados.DadosCliente;
import Dados.*;
import GUI.*;
import DataBase.EditaTabela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dialog;
import java.awt.event.MouseListener;
import java.util.Scanner;


public class Main extends JFrame {

    public static void main(String[] args) {

        MenuPrincipal Menu = new MenuPrincipal();
        Menu.setContentPane(Menu.MenuPrincipal);
        Menu.setVisible(true);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setSize(638, 500);
        Menu.setTitle("Udi-Decola");

        DadosCliente dc = new DadosCliente();
        dc.inicializaClientes();

        DadosCompanhiaAerea dcaer = new DadosCompanhiaAerea();
        Menu.okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente c = new Cliente();
                c.setNome(Menu.textField1.getText());
                c.setCPF(Menu.textField2.getText());
                c.setEndereco(Menu.textField3.getText());
                c.setEmail(Menu.textField4.getText());
                c.setDataNascimento(Menu.textField5.getText());
                c.setDataCad(VerificaData.dataAtual());
                dc.cadastrar(c);
                EditaTabela.inserir(c);
            }
        }); //okCADAM //okBusca


        Menu.okButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                if((dc.Buscar(Menu.CPFLogInsert.getText()) == null)) {
                    JOptionPane.showMessageDialog(null,"CPF Invalido!");
                }
            }
        });

        Menu.confirmaRemov.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e3){
               dc.Excluir(Menu.fieldRemov.getText());
               EditaTabela.deletar(Menu.fieldRemov.getText());
           }
        });

        Menu.CADcompAer.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e4){
               CompanhiaAerea c = new CompanhiaAerea();
               c.setCNPJ(Menu.txtCNPJAER.getText());
               c.setNomeDIV(Menu.txtNomeDiv.getText());
               c.setNomeOF(Menu.txtNomeoff.getText());
               c.setDataCriacao(Menu.txtDataCriacaoAer.getText());
               dcaer.cadastrar(c);
           }
        });

        Menu.okCADADM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cAdm = new Cliente();
                cAdm.setNome(Menu.txtNM.getText());
                cAdm.setCPF(Menu.txtCPF.getText());
                cAdm.setEndereco(Menu.textEND.getText());
                cAdm.setEmail(Menu.txtEmail.getText());
                cAdm.setDataNascimento(Menu.txtNM.getText());
                cAdm.setDataCad(VerificaData.dataAtual());
                System.out.println(cAdm.getNome());
                //dc.cadastrar(cAdm);
            }
        });

        Menu.okBusca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e9) {
                Cliente buscado = new Cliente();
                JOptionPane.showMessageDialog(null," "+ buscado.getNome());

            }
        });

        Menu.cadHotel.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e5){
               Hotel h = new Hotel();
               h.setEndereco(Menu.txtEndHotel.getText());
               h.setNomeDIV(Menu.txtNomeDiv2.getText());
               h.setNomeOF(Menu.txtNomeoff2.getText());

            }
        });
    }
}
