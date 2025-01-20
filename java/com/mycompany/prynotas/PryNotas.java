/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prynotas;


// Importa la clase PrincipalVista desde el paquete vista
import vista.PrincipalVista;

public class PryNotas {

    public static void main(String[] args) {
        // Crear la instancia de la ventana de la interfaz gráfica
        PrincipalVista principalv = new PrincipalVista();
      
        // Hacer visible la ventana
        principalv.setVisible(true);
        
        // Centrar la ventana en la pantalla
        principalv.setLocationRelativeTo(null);
    }
}



