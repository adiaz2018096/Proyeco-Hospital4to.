public class Pacientes extends Usuarios{

	String nombre, apellido, contraseņa, usuario;
	String nombre2, apellido2, contraseņa2, usuario2;	

	public Pacientes(){
	}
	
	public void paciente(){
	nombre = "Juan";
	apellido = "Canel";
	contraseņa = "juancanel";
	usuario = "Juan"; 
	}

	public String usuarioPaciente(){
	return usuario;
	}
	public String contraseniaPaciente(){
	return contraseņa;
	}

	public void segundoPaciente(){
	nombre2 = "Andres";
	apellido2 = "Martinez";
	contraseņa2 = "andresmartinez";
	usuario2 = "Andres"; 
	}

	public String usuarioPaciente2(){
	return usuario2;
	}
	public String contraseņaPaciente2(){
	return contraseņa2;
	}
}