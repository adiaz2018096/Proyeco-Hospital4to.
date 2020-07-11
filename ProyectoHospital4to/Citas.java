public class Citas{

	String cardiologo[] = {"Lunes: 9:00 a 15:30", "Miercoles: 9:00 a 13:30"};
	String nutricionista[] = {"Martes: 9:00 a 13:30", "Jueves: 10:00 a 16:00"};

	String cardiologo1[] = new String[2];
	String nutricionista1[] = new String[2];

	public Citas(){
	}

	public String[] getCardiologo(){
	return cardiologo;
	}

	public String[] getNutricionista(){
	return nutricionista;
	} 

	public String [] getCardiologo1(){
	return cardiologo1;
	}

	public String [] getNutricionista1(){
	return nutricionista1;
	}
}