public class calculadora{

 	public int a;
    public int b;


    public calcuradora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();


        calcuradora calculadora = new calcuradora(a, b);

        
        System.out.println("MI CALCULADORA");
        System.out.println("Escoja: ");
        System.out.println("1. suma ");
        System.out.println("2. resta");
        System.out.println("3. potencia");
        System.out.println("4. multiplicación");
        System.out.println("5. división");


        char choice = scanner.next().charAt(0);

       
        switch (choice) {
            case '1':
                System.out.println("Suma");
                calculadora.suma();
                break;
                
            case '2':
                System.out.println("Resta");
                calculadora.resta();
                break;
                
            case '3':
                System.out.println("Potencia");
                calculadora.potencia();
                break;
                
            case '4':
                System.out.println("Multiplicación");
                calculadora.multiplicacion();
                break;
                
            case '5':
                System.out.println("División");
                calculadora.division();
                break;
                
            default:
                System.out.println("La elección no existe");
                break;
        }
        
        scanner.close();
    }

    public double suma() {
        double suma = a + b;
        System.out.println("La suma es: " + suma);
        return suma;
    }

    public double resta() {
        double resta = a - b;
        System.out.println("La resta es: " + resta);
        return resta;
    }

    public double potencia() {
        double potencia = Math.pow(a, b);
        System.out.println("La potencia es: " + potencia);
        return potencia;
    }

    public double multiplicacion() {
        double multiplicacion = a * b;
        System.out.println("La multiplicación es: " + multiplicacion);
        return multiplicacion;
    }

    public double division() {
        if (b == 0) {
            System.out.println("Error: División entre cero no permitida.");
            return 0;
        }
        double division =  a / b;
        System.out.println("La división es: " + division);
        return division;
    }

}