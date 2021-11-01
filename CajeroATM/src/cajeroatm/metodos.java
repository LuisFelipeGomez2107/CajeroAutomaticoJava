package cajeroatm;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Random;
public class metodos {
    cuenta ct = new cuenta();
    String Cuenta;
    String scape;
    public void cuentaCero(int cuenta1){
        Random  rnd = new Random();
        Cuenta= String.valueOf(rnd.nextInt(100000000)*1000);
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JTextField input3 = new JTextField();
        JTextField input4 = new JTextField(Cuenta);
        int sec4 = Integer.parseInt(Cuenta);
        Object [] inputs = {"Nombre:",input1,"Apellidos:",input2,"Edad:",input3,"No.Cuenta:",input4.getText()};
        JOptionPane.showMessageDialog(null,inputs,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
         //inputs[1] = inputs[1]; 
       //JOptionPane.showMessageDialog(null,inputs[1]);
        ct.setNombre(input1.getText());
        ct.setApellidos(input2.getText());
        ct.setEdad(input3.getText());
        ct.setNoCuenta(sec4);
        
      
    }
    public void imprimeCuentaCero(){
        Object [] showInputs = {"Nombre Completo: ",ct.getNombre()+" "+ct.getApellidos(),"Edad:",
        ct.getEdad(),"No. Cuenta:",ct.getNoCuenta(),"Saldo: ","$"+ct.getSaldo()};
        JOptionPane.showMessageDialog(null,showInputs,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
    }
    public void cuentaSaldo(int cuenta1){
        Random  rnd = new Random();
        Cuenta= String.valueOf(rnd.nextInt(100000000)*1000);
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JTextField input3 = new JTextField();
        JTextField input4 = new JTextField(Cuenta);
        int sec4 = Integer.parseInt(Cuenta);
        JTextField input5 = new JTextField();
        Object [] inputs = {"Nombre",input1,"Apellidos",input2,"Edad",input3,"Deposito",input5,"No.Cuenta",input4.getText()};
        JOptionPane.showMessageDialog(null,inputs,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
        //inputs[1] = inputs[1]; 
        //JOptionPane.showMessageDialog(null,inputs[1]);
        ct.setNombre(input1.getText());
        ct.setApellidos(input2.getText());
        ct.setEdad(input3.getText());
        ct.setNoCuenta(sec4);
        String ll = input5.getText();
        int sec5 = Integer.valueOf(ll);
        ct.setSaldo(sec5);
    }
    public void imprimeCuentaSaldo(){
        Object [] showInputs = {"Nombre Completo: ",ct.getNombre()+" "+ct.getApellidos(),"Edad: ",
        ct.getEdad(),"Saldo: ","$"+ct.getSaldo(),"No. Cuenta: ",ct.getNoCuenta()};
        JOptionPane.showMessageDialog(null,showInputs,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
    }
    public void opcCuenta(){
        Object [] valoresSelecciona ={"-Ingresar dinero"
        ,"-Sacar dinero","-Ver saldo","-Salir"};
        Object seleccion = JOptionPane.showInputDialog(null,"Selecciona una opcion: ", "Cuenta: "+ct.getNoCuenta(),
                            JOptionPane.PLAIN_MESSAGE,null,valoresSelecciona,valoresSelecciona[0]);
        scape = seleccion.toString();
         do{
            if(scape.equals("-Ingresar dinero")){
               int saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Saldo Actual: "+ct.getSaldo()+"\nIngresa la cantidad"));
               Object [] sl = {"Saldo Anterior: "+ct.getSaldo(),"Ingresó: "+saldo,"Nuevo Saldo: "+ct.Ingreso(saldo,ct.getSaldo())};
                JOptionPane.showMessageDialog(null,sl,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
               //JOptionPane.showMessageDialog(null,ct.Ingreso(saldo,ct.getSaldo()));
               opcCuenta();
            }
            else if(scape.equals("-Sacar dinero")){
                if(ct.getSaldo()==0){
                    JOptionPane.showMessageDialog(null,"No puedes Retirar Dinero por que tu cuenta no cuenta con saldo","Error",JOptionPane.ERROR_MESSAGE);
                    opcCuenta();
                }else{
                int saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Saldo Actual: "+ct.getSaldo()+"\nIngresa la cantidad"));
                Object [] sl = {"Saldo Anterior: "+ct.getSaldo(),"Retiro: "+saldo,"Nuevo Saldo: "+ct.Retiro(saldo,ct.getSaldo())};
                JOptionPane.showMessageDialog(null,sl,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
                opcCuenta();
                }
            }
            else if(scape.equals("-Ver saldo")){
                Object [] sl = {"Nombre: "+ct.getNombre()+" "+ct.getApellidos(),
                    "Edad: "+ct.getEdad(),"No.Cuenta: "+ct.getNoCuenta(),
                    "Saldo: "+ct.getSaldo()};
                JOptionPane.showMessageDialog(null,sl,"Datos de Cuenta: ",JOptionPane.QUESTION_MESSAGE);
                opcCuenta();
            }
        } while(!scape.equals("-Salir"));
    }
    
}
