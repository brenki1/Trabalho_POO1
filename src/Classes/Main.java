package Classes;

import GUI.*;

import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {
    public static void main(String[] args) {
        MenuPrincipal Menu = new MenuPrincipal();
        Menu.setContentPane(Menu.MenuPrincipal);
        Menu.setVisible(true);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setSize(638,500);
        Menu.setTitle("Udi-Decola");

        MenuClienteLogin LoginC = new MenuClienteLogin();
        LoginC.setContentPane(LoginC.ClienteLogin);
        LoginC.setVisible(true);
        LoginC.setSize(638,500);
        LoginC.setTitle("Udi-Decola");
        LoginC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuAdmin MenuADM = new MenuAdmin();
        MenuADM.setContentPane(MenuADM.MenuAdmins);
        MenuADM.setVisible(true);
        MenuADM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuADM.setSize(620,350);
        MenuADM.setTitle("Udi-Decola ADMIN");
    }

}
