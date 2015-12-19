package demo.consola;

import java.util.ArrayList;
import java.util.Scanner;

import demo.entidades.Cliente;

public class Main {

	public static void main(String[] args) {
		
	Cliente cl1 =new Cliente ("0923581060","MAYI","MERIZALDE", 21);
	Cliente cl2 =new Cliente ("0923581070","KAREN ","ITURRALDE ", 18);
	Cliente cl3 =new Cliente ("0923581080",",NOEMI ","ALAVA", 19);
	
	
	
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	clientes.add(cl1);
	clientes.add(cl2);
	clientes.add(cl3);
	
	
	/*Cliente temp1= clientes.get(0);
	Cliente temp2= clientes.get(1);
	Cliente temp3= clientes.get(2);*/
	
	
	/*System.out.println(temp1);
	System.out.println(temp2);
	System.out.println(temp3);*/
	
	System.out.println("Tamaño de clientes: "+clientes.size());
	
	
	/*for (int i=0;i<clientes.size();i++){
		Cliente temp = clientes.get(i);
		System.out.println(temp);
	}*/
	int op=0;
	do {
		System.out.println(" ");
		System.out.println("<1> Ingresar Cliente");
		System.out.println("<2> Modificar Cliente");
		System.out.println("<3> Eliminar Cliente");
		System.out.println("<4> Mostrar Clientes");
		System.out.println("<5> Salir");
		Scanner sc=new Scanner (System.in);
		System.out.println("Leer opción:");
		op= sc.nextInt();
		
		switch(op){
		case 1:
			System.out.println("Ingrese Identificación:");
			String identificacion= sc.next();
			System.out.println("Ingrese Nombres:");
			String nombres= sc.next();
			System.out.println("Ingrese Apellidos:");
			String apellidos= sc.next();
			System.out.println("Ingrese Edad:");
			int edad= sc.nextInt();
			
			
			Cliente cl=new Cliente (identificacion, nombres, apellidos, edad);
			clientes.add(cl);
			break;
		case 2:
			int num;
			
			System.out.println("Ingrese la posición que desea cambiar: ");
			num=sc.nextInt();
			for (int i=0;i<clientes.size();i++){
				if (i==num){
					System.out.println("Ingrese Identificación:");
					identificacion= sc.next();
					clientes.get(i).setIdentificaciones(identificacion);
					System.out.println("Ingrese Nombres:");
					nombres= sc.next();
					clientes.get(i).setNombres(nombres);
					System.out.println("Ingrese Apellidos:");
					apellidos= sc.next();
					clientes.get(i).setApellidos(apellidos);
					System.out.println("Ingrese Edad:");
					edad= sc.nextInt();
					clientes.get(i).setEdad(edad);		
				}
			}
			System.out.println("Usted ha modificado al cliente exitosamente");
			break;
			
		case 3:
			
			System.out.println("Ingrese índice a Eliminar: ");
			int id= sc.nextInt();
			
			for (int i=0;i<clientes.size();i++){
				
				if (i==id){

               clientes.remove(i);
               System.out.println("Usted ha eliminado al cliente exitosamente");
				}
					
				
			}
			
			break;
			
			
		case 4:
			System.out.println("Lista de clientes");
			for (int i=0;i<clientes.size();i++){
				Cliente temp = clientes.get(i);
				System.out.println(temp);
			}
			break;
		}
		
	}while(op!=5);
	System.out.println("Gracias por usar el sistema");
	
	}

}
