public class Pacientes extends Usuarios{

	String nombre, apellido, contrase�a, usuario;
	String nombre2, apellido2, contrase�a2, usuario2;	

	public Pacientes(){
	}
	
	public void paciente(){
	nombre = "Juan";
	apellido = "Canel";
	contrase�a = "juancanel";
	usuario = "Juan"; 
	}

	public String usuarioPaciente(){
	return usuario;
	}
	public String contraseniaPaciente(){
	return contrase�a;
	}

	public void segundoPaciente(){
	nombre2 = "Andres";
	apellido2 = "Martinez";
	contrase�a2 = "andresmartinez";
	usuario2 = "Andres"; 
	}

	public String usuarioPaciente2(){
	return usuario2;
	}
	public String contrase�aPaciente2(){
	return contrase�a2;
	}
}