package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(miCuenta, 0);
    }
    
    //metodo para  comprobar el ingreso y retirada
    private static void operativa_cuenta(CCuenta miCuenta, float cuenta) {
        double saldoActual;
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
