
package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
       int numeroIf = -34;
       if(numeroIf<0){
           System.out.println("numeroIf es negativo");
       }else if(numeroIf==0){
           System.out.println("numeroIf es 0");
       }else if(numeroIf>0){
           System.out.println("numeroIf es positivo");
       }
        System.out.println("____________");
        
        int numeroWhile = -1;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }
        System.out.println("____________");
        
        int numeroDoWhile = 3;
        do{
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);
        System.out.println("____________");

        for(int numeroFor = 0;numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("____________");
        
        String estacion = "invierno";
        switch(estacion){
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("No hay estacion");
                break;    
        }
    }
    
}
