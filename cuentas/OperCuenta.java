package cuentas;

public class OperCuenta {
	int dSaldo = 0;
	
	public static void main(String[] args) {
		operativa_cuenta();

	}

	private static void operativa_cuenta() {
		OperCuenta cuenta1 = new OperCuenta();
        System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
        cuenta1.ingreso(-200);
        System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
        cuenta1.ingreso(200);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
        cuenta1.ingreso(1000);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
        cuenta1.ingreso(500);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
        cuenta1.retiro(150);
        System.out.println("Saldo tras retirada: " + cuenta1.dSaldo + " euros");
	}
	
	public int ingreso(double cantidad) {
    	int iCodErr;//1
	
     	if (cantidad < 0) {//2
             System.out.println("No se puede ingresar cantidades negativas");
             iCodErr = 1;//3
     	} else if (cantidad == -5) {//4
             System.out.println("Detectable en pruebas de caja blanca");
             iCodErr = 2;//5
        } else {
        	dSaldo = dSaldo + (int)cantidad;
            iCodErr = 0;//6
        }

     	return iCodErr;//7
	}
//8
	public void retiro (double cantidad) {//1
		if (cantidad <= 0) {//2
			System.out.println("No se puede retirar cantidades negativas");
		} else if (dSaldo < cantidad) {//3
			System.out.println("No hay suficiente saldo");//4
		} else {
			dSaldo = dSaldo - (int)cantidad;//5
		}
	}
	//6
}