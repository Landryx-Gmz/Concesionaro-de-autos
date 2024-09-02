package mypc.automovil;

import mypc.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        // 1 despues de crear la interfaz grafica principal la llamamos, la hacemos vicible y la centramos.
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
