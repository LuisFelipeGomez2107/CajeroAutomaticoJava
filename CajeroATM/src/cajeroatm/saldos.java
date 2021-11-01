package cajeroatm;
public class saldos {
    private int saldo;
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int Ingreso(int a, int b){
        int resultado = a + b;
        saldo = resultado;
        return resultado;
        
    }
    public int Retiro(int a, int b){
        int resultado = b - a;
        saldo = resultado;
        return resultado;
    }
}
