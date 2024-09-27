public class calculadora{

public int a;
public int b;

char choice;
		System.out.println("MI CALCURADORA");
		System.out.println("Escoja: ");
		System.out.println("1. suma ");
		System.out.println("2. resta");
		System.out.println("3. potencia");
		System.out.println("4. multiplicacion");
		System.out.println("5. division");
		
		
		
		try {
			choice = (char) System.in.read();
			System.out.println("\n");
			
			switch(choice) {
			
			case '1' :
				System.out.println("suma");
				calculadora.suma();
				
				break;
				
			case '2' :
				System.out.println("resta");
				calculadora.resta();
				break;
				
			case '3' :
				System.out.println("potencia");
				calculadora.potencia();
				break;
				
			case '4' :
				System.out.println("multiplicacion");
				calculadora.multiplicacion();
				break;
				
			case '5' :
				System.out.println("division");
				calculadora.division();
				break;
				
			
			default : 
				System.out.println("La eleccion no existe");
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No fue posible la instruccion");
		}

public double suma(){

 double suma = a + b ;

 System.out.println("La suma es : " + suma);

 return suma;

}

public double resta (){
    double resta = a - b ;
    system.out.println("la resta es :  " + resta );
    return resta;
    



}

public double potencia (){
    double potencia = a ** b;
     system.out.println("la potencia es : " + potencia );
     return potencia;
}

public double multiplicacion (){

    double multiplicacion = a * b;
    system.out.println("la multiplicacion es : " + multiplicacion );
     return multiplicacion;


}

}