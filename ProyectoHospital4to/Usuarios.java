public class Usuarios{

	String datos[] = new String[2];

	public Usuarios(){
	}

	public void confDatos(String datos[]){ //SET
		this.datos[0] = datos[0];
		this.datos[1] = datos[1];
		}

	public String[] verDatos(){
		return datos;
	} 
}

