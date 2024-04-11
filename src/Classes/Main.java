package Classes;

import GUI.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    }
}
