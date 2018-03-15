package ejercicio;

public class PersonaFiscal {
	private String nombre;
	private int edad;
	private int sueldo;
	private String impuesto;

	public PersonaFiscal(String _nombre, int _edad, int _sueldo, String _impuesto) {
		this.nombre = _nombre;
		this.edad = _edad;
		this.sueldo = _sueldo;
		this.impuesto = _impuesto;

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int _sueldo) {
		this.sueldo = _sueldo;
	}

	public String getImpuesto() {
		return this.impuesto;
	}

	public void setTipo(String _impuesto) {
		this.impuesto = _impuesto;
	}

	/*
	 * public int calcularImpuesto() {
	 * 
	 * 
	 * impuesto1= sueldo*porcentaje/100;
	 * 
	 * impuesto2= sueldo*porcentaje30/100;
	 * 
	 * }
	 */

	public void vincularTipoImpuesto(String impuesto) {

		if (impuesto.equals("A")) {
			TipoImpuesto impuestoA = new TipoImpuesto(20, 30, "A");

		} else if (impuesto.equals("B")) {
			TipoImpuesto impuestoB = new TipoImpuesto(10, 5, "B");

		} else if (impuesto.equals("C")) {
			TipoImpuesto impuestoB = new TipoImpuesto(30, 25, "C");

		} else if (impuesto.equals("D")) {
			TipoImpuesto impuestoD = new TipoImpuesto(10, 30, "D");
		}
	}
}
