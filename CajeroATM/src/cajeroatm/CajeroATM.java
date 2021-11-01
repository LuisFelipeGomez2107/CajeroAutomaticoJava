package cajeroatm;
import javax.swing.JOptionPane;
public class CajeroATM {
    public static void main(String[] args) {
        metodos mt = new metodos();
        String scape;
        int cuenta=0;       
        Object [] valoresSelecciona ={"-Crear cuenta vacia","-Crear cuenta saldo Inicial","-Salir"};

        do{
        Object seleccion = JOptionPane.showInputDialog(null,"Selecciona una opcion: ", "Menu ATM",
                            JOptionPane.PLAIN_MESSAGE,null,valoresSelecciona,valoresSelecciona[0]);
        scape = seleccion.toString();
        
            if(scape.equals("-Crear cuenta vacia")){
                mt.cuentaCero(cuenta);
                mt.imprimeCuentaCero();
                mt.opcCuenta();
            }
            else if(scape.equals("-Crear cuenta saldo Inicial")){
                mt.cuentaSaldo(cuenta);
                mt.imprimeCuentaSaldo();
                mt.opcCuenta();
            }
  
        }
        while(!scape.equals("-Salir"));
    }
    
}
