package cuentas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CCuenta cuenta1;
	       
	        cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
	        operativacuenta(cuenta1);

	        try {
	            cuenta1.retirar(2300);
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }
	        try {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(695);
	        } catch (Exception e) {
	            System.out.print("Fallo al ingresar");
	        }
	    }

	public static void operativacuenta(CCuenta cuenta1) {
		
		double saldoActual;
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es "+ saldoActual );
	}

	}


