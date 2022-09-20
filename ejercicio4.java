public class ejercicio4 {
    public static void main(String[] args) {

        int numeroIf = -7;


        if (numeroIf == 0) {
            System.out.println("la variable es 0");
        }else if (numeroIf < 0){
            System.out.println("la variable es un número negativo");
        }else {
            System.out.println("la variable es un número positivo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        int numeroDoWhile = 0;

        do{    
        System.out.println(numeroDoWhile);
        numeroDoWhile++;  
            }while (numeroDoWhile < 1); 


        int numeroFor = 0;

        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "verano";

        switch (estacion) { 
            case "primavera":
            System.out.println("estamos en primavera");
            break;
            case "invierno":
            System.out.println("estamos en invierno");
            break;
            case "verano":
            System.out.println("estamos en verano");
            break;
            case "otoño":
            System.out.println("estamos en otoño");
            default:
            System.out.println(estacion + " no es una estación");
            break;
        }
        
    }
}
