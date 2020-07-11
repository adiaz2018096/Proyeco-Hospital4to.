import java.util.Scanner;
public class Clinica{
	public static void main(String args[]){

	Scanner in = new Scanner(System.in);
	Pacientes jeringa = new Pacientes();
	Citas citas = new Citas();
	jeringa.paciente();
	jeringa.segundoPaciente();


	String a[]; String b[]; String d[]; String e[];
	int Op = 0, parametro = 0, operacion= 0, bucle = 0, especialidad = 0, horario = 0;
	
	do{	
	System.out.println("---------------------------------");
	System.out.println("          Iniciar Sesion         ");
	System.out.println("---------------------------------");
	System.out.println("");
	System.out.println("Usuarios");
	System.out.println("1. Pacientes");
	System.out.println("2. Doctores");
	Op = in.nextInt();
	
	if(Op == 1){
	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("            Pacientes           ");
	System.out.println("--------------------------------");
	System.out.println("           Bienvenido!!         ");
	System.out.println("--------------------------------");
	System.out.println("");
	System.out.println("Para iniciar sesion llene lo que acontinuacion se le solicita");
	in.nextLine();
	System.out.println("Ingrese su usuario ");
	jeringa.datos[0] = in.nextLine();
	System.out.println("Ingrese su contraseña: ");
	jeringa.datos[1] = in.nextLine(); 
	if(jeringa.datos[0].equals(jeringa.usuarioPaciente()) && jeringa.datos[1].equals(jeringa.contraseniaPaciente()) ||
	   jeringa.datos[0].equals(jeringa.usuarioPaciente2()) && jeringa.datos[1].equals(jeringa.contraseñaPaciente2())){
	
	System.out.println("");
	System.out.println("--------------------------------");	
	System.out.println("       Clinica El Manantial     ");
	System.out.println("--------------------------------");
	System.out.println("1......... Cardiologo");
	System.out.println("2......... Nutrisionista");	
	System.out.print("Elija una opcion: ");
	operacion = in.nextInt();
	if(operacion == 1){
		System.out.println("--------------------------------");
		System.out.println("          Cardiologo            ");
		System.out.println("--------------------------------");
		System.out.println("Puede programar su cita con el cardiologo en los siguietes dias");
		a = citas.getCardiologo();
		for(String pe:a){
		System.out.println(pe);
		} 
		System.out.print("Programa tu cita: ");
		horario = in.nextInt();
		System.out.println("");
		System.out.println("Operacion Exitosa");
		if(horario == 1){
		citas.cardiologo1[0] = citas.cardiologo[0];
		} else if(horario == 2){
		citas.cardiologo1[1] = citas.cardiologo[1];
		} 
	}else if(operacion == 2){
		System.out.println("--------------------------------");
		System.out.println("          Nutricionista         ");
		System.out.println("--------------------------------");
		System.out.println("Puede programar su cita con el Nutricionista en los siguientes dias");
		b = citas.getNutricionista();
		for(String pe:b){
		System.out.println(pe);
		}
		System.out.print("programa tu cita: ");
		horario = in.nextInt();
		System.out.println("");
		System.out.println("Operacion exitosa");
		if(horario == 1){
		citas.nutricionista1[0] = citas.nutricionista[0];
		} else if(horario == 2){
		citas.nutricionista1[1] = citas.nutricionista[1];
 		} 
	}
	}  
	} else if(Op == 2){
	do{
	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("            Doctores            ");
	System.out.println("--------------------------------");
	System.out.println("1......Cardiologo");
	System.out.println("2......Nutricionista");
	System.out.println("Elija su vocacion : ");
	especialidad = in.nextInt();

		if(especialidad == 1){
		System.out.println("--------------------------------");
		System.out.println("           Odontologo           ");
		System.out.println("--------------------------------");
		System.out.println("             Citas              ");
		System.out.println("--------------------------------");
				
			System.out.println("");
			System.out.println("Su agenda esta programada de la siguiente manera:");
			d = citas.getCardiologo1();
			for(String pe:d){
			if(pe != null){
			System.out.println(pe);
			}
			}
			System.out.println("¿Desea regresar?");
			System.out.println("1. Si   2. No");
			bucle = in.nextInt();

		} else if(especialidad == 2){
		System.out.println("--------------------------------");
		System.out.println("           Nutricionista         ");
		System.out.println("--------------------------------");
		System.out.println("             Citas              ");
		System.out.println("--------------------------------");
				
			System.out.println("");
			System.out.println("Su agenda esta programada de la siguiente manera:");
			e = citas.getNutricionista1();
			for(String pe:e){
			if(pe != null){
			System.out.println(pe);
			}
			}
			System.out.println("¿Desea regresar?");
			System.out.println("1. Si   2. No");
			bucle = in.nextInt();
		}  
		} while(bucle == 1); 
	}
 	} while(Op == 1);
	}
}

