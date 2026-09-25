package datos.unidad1.recursividad;

public class Recursividad {

	public static void saludo(int total, String nombre){

	if (total <= 0) //Condicion base
		return;
	else{ //Condicion recursiva o repetitiva
		System.out.println("Hola " + nombre);
		saludo(total-1, nombre);
		}		
	}
	/**
	*Funcion que realiza cuenta regresiva
	*Valor entero
	*Fecha: 25 de septiembre
	*Autor: Uriel Ramírez
	*/

	public static void cuentaRegresiva(int n){
	
	if(n<0){
		return;
	
	} else{
		System.out.println(n + " ");
		cuentaRegresiva(n-1);
	}
}

	public static void main (String[] args ){
		//saludo(10, "Uriel");
		cuentaRegresiva(100);

	}

}