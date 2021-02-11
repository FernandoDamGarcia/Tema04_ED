package Examen;

public class OperCuenta {
	int dSaldo = 0;
	
	public static void main(String[] args) {
		OperCuenta miCuenta = new OperCuenta();
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingreso(-200);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingreso(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingreso(1000);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingreso(500);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retiro(150);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");

	}
	
	public int ingreso(double cantidad) {
    	int iCodErr;
	
     	if (cantidad < 0) {
             System.out.println("No se puede ingresar cantidades negativas");
             iCodErr = 1;
     	} else if (cantidad == -5) {
             System.out.println("Detectable en pruebas de caja blanca");
             iCodErr = 2;
        } else {
        	dSaldo = dSaldo + (int)cantidad;
            iCodErr = 0;
        }

     	return iCodErr;
	}

	public void retiro (double cantidad) {
		if (cantidad <= 0) {
			System.out.println("No se puede retirar cantidades negativas");
		} else if (dSaldo < cantidad) {
			System.out.println("No hay suficiente saldo");
		} else {
			dSaldo = dSaldo - (int)cantidad;
		}
	}
	
}
