package poo;

public class CuentaBancaria {
	//ATRIBUTOS
	private int telefono;
	private double saldo;
	private String nombre, Ncuenta, email;
	
	//Metodo Constructor
	  //Metodo contructor sin parametros
	
	
	  //Metodo contructor con parametros
	
	
	//Metodos Setters y getters
	
	public void Pcuenta(String Ncuenta) {
		this.Ncuenta = Ncuenta;
	}
	public String Mcuenta() {
		return this.Ncuenta;	
	}
	public void Psaldo(double saldo) {
		this.saldo= saldo;
	}
	public double Msaldo() {
		return this.saldo;	
	}
	public void Pnombre(String nombre) {
		this.nombre = nombre;
	}
	public String Mnombre() {
		return this.nombre;	
	}
	public void Pemail(String email) {
		this.email = email;
	}
	public String Memail() {
		return this.email;	
	}
	public void Ptelefono(int telefono) {
		this.telefono = telefono;
	}
	public int Mtelefono() {
		return this.telefono;	
	}
	

	//METODOS FUNCIONALES
	   //metodo mostrar datos
	public void MostrarDatos() {
		System.out.println("Nombre del Cliente: "+Mnombre());
		System.out.println("Numero de cuenta: "+Mcuenta());
		System.out.println("Email: "+Memail());
		System.out.println("Numero de telefono: "+Mtelefono());
	}
	public void depositar(double montoD) {
		this.saldo += montoD;
		MostrarDatos();
		System.out.println("Espere...");
		System.out.println("El momto depositado fue de C$"+montoD);
		System.out.println("Su saldo actual es de C$ "+Msaldo());
	}
	public void retirar(double montoR) {
		if(montoR > this.saldo) {
			MostrarDatos();
			System.out.println("No tiene saldo suficiente");
			System.out.println("Su saldo actual es de C$ "+Msaldo());	
		}else {
			this.saldo -= montoR;
			MostrarDatos();
			System.out.println("El monto retirado fue de C$"+montoR);
			System.out.println("Su saldo actual es de C$ "+Msaldo());
		}
		
	}
	

}
