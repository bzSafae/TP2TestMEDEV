package edu.centralenantes.tp2test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dodi
 */
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        javax.swing.SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
     /*   PGMImage img = PGMImage.read(Path.of("brain.pgm"));
        img.write(Path.of("output.pgm"));
        System.out.println("OK: saved output.pgm"); */
    }
}
