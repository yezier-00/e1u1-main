package operaciones;
import java.util.*;
public class logica {
	Scanner entrada=new Scanner(System.in);
int num1,num2,resta,suma,multiplicacion,division,opcion;
public void pedirdatos(){
	System.out.println("dame un numero:");
	num1=entrada.nextInt();
	System.out.println("dame un numero:");
	num2=entrada.nextInt();
	
}


public void  suma(){
	suma=num1+num2;
}
public void resta() {
	resta=num1-num2;
}
public void multiplicacion(){
	multiplicacion=num1*num2;
}
public void division(){
	division=num1/num2;
}
public void mostrarresultados(){
	System.out.println("la suma es:"+suma);
	System.out.println("la resta es:"+resta);
	System.out.println("la multiplicacion es:"+multiplicacion);
	System.out.println("la division es:"+division);
}

}//class
