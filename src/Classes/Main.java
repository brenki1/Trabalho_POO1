package Classes;

import GUI.*;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        MenuPrincipal Menu = new MenuPrincipal();
        Menu.setContentPane(Menu.MenuPrincipal);
        Menu.setVisible(true);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setSize(638,500);
        Menu.setTitle("Udi-Decola");
    }

}
