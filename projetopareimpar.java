import java.util.Scanner;

/**
 * projetopareimpar
 */
public class projetopareimpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int n;
        int contador;
    
        int par = 0;
        int impar = 0;

       for (contador = 1; contador < 11;contador++) {
         System.out.println("Digite o número");
          n = teclado.nextInt();

          if (n % 2 == 0) {
         
         System.out.println("Esse número é par");
        
               par++;

           }else{
           n = n % 3;
           System.out.println("Esse número é impar");
                  impar++;
           }
    

        }

             System.out.println("Pares " + par);
             System.out.println("Impares " + impar);
             

             teclado.close();
        


        }
         

        
        

        
    


            
        

         

     

            
    }
