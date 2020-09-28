package principal;

import java.util.Scanner;

import operaciones.logica;

public class main {

	public static void main(String[] args) {
	logica operacion=new logica();
	operacion.pedirdatos();
	
	operacion.suma();
	operacion.resta();
	operacion.multiplicacion();
	operacion.division();
	operacion.division();
	operacion.mostrarresultados();
	

	}//main

}//class
