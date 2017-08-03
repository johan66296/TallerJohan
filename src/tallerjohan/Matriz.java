/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjohan;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Matriz {

    String matriz[][] = new String[3][3];

    public void ingresarInfo() {
        int i = 0;
        if (i < matriz.length) {

            String nombre = String.valueOf(Nombres.ID.getText());

            matriz[i][0] = nombre;

            i++;
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Espacio insuficiente...");
        }
    }

    public void consultarInfo() {
        String nombre = String.valueOf(Nombres.BUS.getText());

        boolean bandera = false;
        for (int i = 0; i < matriz.length; i++) {

            if (nombre.equals(matriz[i][0])) {
                String rep = "|NOMBRE|\n";
                Nombres.INFO.setText(rep+""+matriz[i][0]);
                 
                i=matriz.length;
                bandera=true;
            }

        }

    }

}
