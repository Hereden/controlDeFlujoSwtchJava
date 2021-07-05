import java.util.Scanner;

public class FlujoSwitch {

	public static void main(String[] args) {
		/*
		 * switch (condicion){
		 * 
		 * case valor:
		 *   codigo
		 *   codigo
		 *   codigo
		 *   break;
		 *  
		 * case valor2:
		 *   codigo
		 *   codigo
		 *   codigo
		 *   break;
		 *   
		 *  default:
		 *   codigo
		 *   codigo
		 *   break;
		 *   
		 *  }
		 * 
		 * */
		
		int dia=1;
		String mensaje="";
		
		switch(dia) {
		case 1:
			mensaje="Lunes";
			break;
		case 2:
			mensaje="Martes";
			break;
		case 3:
			mensaje="Miercoles";
			break;
		case 4:
			mensaje="Jueves";
			break;
		case 5:
			mensaje="Viernes";
			break;
		case 6:
			mensaje="Sabado";
			break;
		case 7:
			mensaje="Domingo";
			break;
		default:
			mensaje="Dia invalido";
			break;
		}
		
		System.out.println(mensaje);
		
		/**
		 * Crear una calculadore que pueda sumar, restar, multiplicar y dividir
		 * 2 numeros
		 * La calculadora debe pedir los dos numeros y posterior a eso preguntar
		 * que operación se quiere realizar, el menu es el siguiente:
		 * 1.-Sumar
		 * 2.-Restar
		 * 3.-Multiplicacion
		 * 4.-Division
		 * Al final debe mostrar los resultados de la operacion
		 * que se realiza
		 * 
		 * NOTA: se debe de utilizar switch		 
		 * */
		
		//Calculadora calcu=new Calculadora();
		esTriangulo();
		
	}
	
	public static void esTriangulo() {
		Scanner leer= new Scanner(System.in);
		float angulo1,angulo2,angulo3,valorTotal;
		System.out.println("Este es un programa para saber si un triangulo"+
		" es valido a partir de sus tres angulos\n ingrese el valor del primer"+
				" angulo");
		angulo1=leer.nextFloat();
		System.out.println("Ingrese el valor del segundo angulo");
		angulo2=leer.nextFloat();
		System.out.println("Ingrese el valor del tercer angulo");
		angulo3=leer.nextFloat();
		valorTotal= (float) Math.ceil(angulo1 + angulo2 + angulo3);
		if(valorTotal==180) {
			System.out.println("Es un triangulo valido");
		}else {
			System.out.println("NO es un triangulo valido");
		}
		
		
	}
	
	public static void calculadoraEscrita() {
		Boolean salir=true;
		Scanner leer= new Scanner(System.in);
		float numero1,numero2;
		int opcion;
		String resultado="";
		do {
			System.out.println("Escriba el primer número:");
			numero1= leer.nextFloat();
			System.out.println("Escriba el segundo número:");
			numero2=leer.nextFloat();
			System.out.println("¿Qué operación desea realizar?:\n"+
			"1.-Sumar\n"+
			"2.-Restar\n"+
			"3.-Multiplicación\n"+
			"4.-División\n"+
			"5.-Todología\n"+
			"6.-Salir");
			opcion=leer.nextInt();
			switch(opcion){
			case 1:
				resultado="El resultado de la suma es:"+ (numero1+numero2);
				break;
			case 2:
				resultado="El resultado de la resta es:" + (numero1-numero2);
				break;
			case 3:
				resultado="El resultado de la multiplicación es:" + (numero1*numero2);
				break;
			case 4:
				resultado="El resultado de la división es:" + (numero1/numero2);
				break;
			case 5:
				resultado="Suma: " +(numero1+numero2) + " \nResta: "+ 
			              (numero1-numero2) + " \nMultiplicación: "+ 
						  (numero1*numero2) + " \nDivisión: " +
			              (numero1/numero2);
				break;
			case 6:
				resultado="Vuelva pronto.";
				salir=false;
				break;
			default:
				resultado="Opción invalida";
			}
				
			System.out.println(resultado);
		}while(salir);
	}

}
