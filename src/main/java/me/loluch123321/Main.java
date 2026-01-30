package me.loluch123321;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String translation = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String input = "";
        boolean b = false;
        while (!b) {
            System.out.print("Негры пидоры? (y/n): ");
            input = scanner.nextLine();
            if (input.equals("y") || input.equals("Y") || input.equals("Yes") || input.equals("yes")) {
                System.out.println("Вы правый.");
                b = true;
            } else if (input.equals("n") || input.equals("N") || input.equals("No") || input.equals("no")) {
                throw new IllegalArgumentException("Вы не правый.");
            }
        }
        while (true) {
            System.out.print("Давай пиши: ");
            input = scanner.nextLine();
            for (char c : input.toCharArray()){
                if (Utils.map.containsKey(c)){
                    translation = translation + Utils.map.get(c);
                } else {
                    translation = translation + c;
                }
            }
            StringSelection selection = new StringSelection(translation);
            clipboard.setContents(selection, null);
            System.out.println("Перевод скопирован: " + translation);
            translation = "";
        }
    }
}