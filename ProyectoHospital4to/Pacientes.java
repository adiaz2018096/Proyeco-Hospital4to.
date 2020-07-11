public class Pacientes extends Usuarios{

	String nombre, apellido, contraseña, usuario;
	String nombre2, apellido2, contraseña2, usuario2;	

	public Pacientes(){
	}
	
	public void paciente(){
	nombre = "Juan";
	apellido = "Canel";
	contraseña = "juancanel";
	usuario = "Juan"; 
	}

	public String usuarioPaciente(){
	return usuario;
	}
	public String contraseniaPaciente(){
	return contraseña;
	}

	public void segundoPaciente(){
	nombre2 = "Andres";
	apellido2 = "Martinez";
	contraseña2 = "andresmartinez";
	usuario2 = "Andres"; 
	}

	public String usuarioPaciente2(){
	return usuario2;
	}
	public String contraseñaPaciente2(){
	return contraseña2;
	}
}