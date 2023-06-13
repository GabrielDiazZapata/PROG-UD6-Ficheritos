package com.actividad.actividaduno;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActividadUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "";
        while (texto.length() < 30) {
            System.out.print("Introduce un texto con al menos 30 caracteres: ");
            texto = scanner.nextLine();
            if (texto.length() < 30) {
                int faltantes = 30 - texto.length();
                System.out.println("El texto debe tener al menos 30 caracteres. Faltan " + faltantes + " caracteres.");
            }
        }

        String textoFormateado = texto.toUpperCase().replace(" ", "_");

        try {
            FileWriter writer = new FileWriter("GuardadoDeTextoEnUnFichero.txt");
            writer.write(textoFormateado);
            writer.close();
            System.out.println("El texto formateado se ha guardado correctamente en el fichero.");
        } catch (IOException e) {
            System.out.println("Error al guardar el texto en el fichero.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
