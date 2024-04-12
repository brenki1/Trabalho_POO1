package Classes;

import Dados.DadosCliente;
import GUI.*;

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
        });


        Menu.okButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                Cliente c2 = new Cliente();
                if((dc.Buscar(Menu.CPFLogInsert.getText()) == null)) {
                    //JOptionPane.showInternalMessageDialog(,"Não foi encontrado seu CPF na base de dados!","CPF INVALIDO!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
