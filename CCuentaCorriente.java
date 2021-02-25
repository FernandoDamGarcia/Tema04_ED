public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private float cantidad;
    
    public void SetNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String GetNombre() {
    	return nombre;
    }
    public String SetCuenta(String cuenta) {
    	this.cuenta = cuenta;
    
    }
    public String GetCuenta() {
    	return cuenta;
    }
    public double SetSaldo(double saldo) {
    	this.saldo = saldo;
    }
    public double Getsaldo() {
    	return saldo;
    }
    public double SettipoInterés(double tipoInterés){
    	this.tipoInterés = tipoInterés;
    }
    public double GettipoInterés(){
    	return tipoInterés;
    }
    public float Setcantidad() {
    	this.cantidad;
    }
    public float Getcandtidad() {
    	return cantidad;
    	
    }
    public CCuentaCorriente()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
