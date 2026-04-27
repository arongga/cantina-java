package menu;
import java.util.Scanner;

public class Cantina {

	public static void main(String args [] ) {
		Scanner dato = new Scanner(System.in);
		int op, opRef, opAlm, opPost;	//VARIABLES MENU
		int total=0;	// TOTAL ACUMULABLE DEL PRECIO
		
		while (true){
			System.out.println("---Cantina---");	// MENU PRINCIPAL
			System.out.println("1- Refrescos");
			System.out.println("2- Almuerzos");
			System.out.println("3- Postres");
			System.out.println("4- Pagar");
			System.out.println("0- Salir");
			System.out.print("Opcion: ");
			op = dato.nextInt();	// VARIABLE OPCION PRINCIPAL DEL MENU
		
			switch(op) {	// SWITCH PRINCIPAL DEL MENU
				case 1:
					System.out.println("---Refrescos---");
					System.out.println("1- Coca Cola $30");
					System.out.println("2- Sprite $20");
					System.out.println("3- Fanta $15");
					System.out.println("0- Salir");
					System.out.print("Opcion: ");
					opRef = dato.nextInt();		
					
					switch(opRef) { //SWITCHES SECUNDARIOS
						case 1:
							System.out.println("Sale una Coca Cola");
							total += 30;
							break;
						case 2:
							System.out.println("Sale una Sprite");
							total += 20;
							break;
						case 3:
							System.out.println("Sale una Fanta");
							total += 15;
							break;
						case 0:
							System.out.println("Saliendo... ");
							break;
						default:
							System.out.println("Elija una opcion valida");
							break;
					}
					break;
				case 2:
					System.out.println("---Almuerzos---");
					System.out.println("1- Milanesa $70");
					System.out.println("2- Hamburuguesa $50");
					System.out.println("3- Pizza $110");
					System.out.println("0- Salir");
					System.out.print("Opcion: ");
					opAlm = dato.nextInt();
					
					switch(opAlm) { 	//SWITCHES SECUNDARIOS
						case 1:
							System.out.println("Sale una Milanesa");
							total += 70;
							break;
						case 2:
							System.out.println("Sale una Hamburguesa");
							total += 50;
							break;
						case 3:
							System.out.println("Sale una Pizza");
							total += 110;
							break;
						case 0:
							System.out.println("Saliendo... ");
							break;
						default:
							System.out.println("Elija una opcion valida");
							break;
					}
					break;
				case 3:
					System.out.println("---Postres---");
					System.out.println("1- Brownie $60");
					System.out.println("2- Cheescake $80");
					System.out.println("3- Torta Rogel $50");
					System.out.println("0- Salir");
					System.out.print("Opcion: ");
					opPost = dato.nextInt();
					
					switch(opPost) {	//SWITCHES SECUNDARIOS
						case 1:
							System.out.println("Sale un Brownie");
							total += 60;
							break;
						case 2:
							System.out.println("Sale un Cheescake");
							total += 80;
							break;
						case 3:
							System.out.println("Sale una Torta Rogel");
							total += 50;
							break;
						case 0:
							System.out.println("Saliendo... ");
							break;
						default:
							System.out.println("Elija una opcion valida");
							break;
					}
					break;
				case 4:
					System.out.println("Su total a pagar seria de: $" + total);
					System.exit(0);		//CIERRA EL PROGRAMA
				case 0:
					System.out.println("Saliendo... ");
					System.exit(0);
				default:	//EVITA QUE SALTE ERROR POR UN ERROR DE TYPEO
					System.out.println("Elija una opcion valida");
					break;
			}
		}
	} 
}
