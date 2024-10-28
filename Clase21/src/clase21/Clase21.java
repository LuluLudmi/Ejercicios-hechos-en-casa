package clase21;

import java.util.Arrays;

public class Clase21 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[4];
        String[] nombres = new String[4];
        //Carga de los vectores
        numeros[0] = 1;
        nombres[0] = "Juan";
        numeros[1] = 2;
        nombres[1] = "Maria";
        numeros[2] = 3;
        nombres[2] = "Jose";
        numeros[3] = 4;
        nombres[3] = "Ana";
        //numeros[4]=5;
        // nombres[4]="Mirta";
        //La primer posicion 
        //La ultima posicion de un vector tiene indice n-1
        System.out.println(numeros[2] + " " + nombres[2]);
        System.out.println("x:**********************");
        //Recorrido del vector
        for (int a = 0; a < 4; a++) {
            System.out.println(numeros[a] + " " + nombres[a]);

        }
        //metodo length
        System.out.println("Longitud numeros:" + numeros.length);
        // recorrido usando
//        for (int a = 0; a <numeros.length; a++) {
//            System.out.println(numeros[a]+" "+nombres[a]);

        //recorrido inverso
        for (int a = numeros.length - 1; a >= 0; a--) {
            System.out.println(numeros[a] + " " + nombres[a]);

        }
        //Recorrido con while
        int x = 0;
        while (x < numeros.length) {
            System.out.println(numeros[x] + " " + nombres[x]);
            x++;
        }
        //inicializaion abreviada 
        int[] vector = {10, 23, 26, 29, 38, 10, 6, 14, 65, 46, 35, 10, 16};// longitud del vector 14
        System.out.println("longitud vector:" + vector.length);
        for (int a = 0; a < vector.length; a++) {
            System.out.print(vector[a] + ",");
        }
        System.out.println(); //salto de linea
        // totalizar un vector numerico
        //promediar el vector
        int total = 0;  // empieza en cero
        for (int i = 0; i < vector.length; i++) {
            total += vector[i]; //operadores incrementales
        }
        System.out.println("total:" + total);
        System.out.println("promedio:" + ((float) total / vector.length)); //operador de casteo me permite 
        // ver el resultado en decimales al sacarme el promedio
        // me permite transformar un valor, en este caso que es un numero entero lo paso a decimales
        //int[] vector= {10,23,26,29,38,39,10,6,14,65,46,35,10,16};
        //calcular valor minimo y valor maximo
        int min = vector[0];
        int max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }

            if (vector[i] > max) {
                max = vector[i];
            }

        }
        System.out.println("Valor minimo:" + min);
        System.out.println("Valor maximo:" + max);
        //contar cantidad de numeros pares
        //contar cantidad de numeros impares
        //contar cantidad de veces que se repite el 10
        int cantPares = 0;
        int cantImpares = 0;
        int cant10 = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                cantPares++;
                if (vector[i] == 10) {
                    cant10++;
                }
            } else {
                cantImpares++;
            }

        }

//      
//        for (int i = 0; i < vector.length; i++) {
//           if(vector[i]%2==0)   cantPares++;
//           else                 cantImpares++;
//           if(vector[i]==10)    cant10++;
//        }
//     for (int a = 0; a < vector.length; a++) 
//     {
//         if(vector[a] ){
//             cantPares++;
//             if( %2==0)
//             {
//             cant10++;
//             }
//         }
//         else 
//         {int cantImpares - Clase21Gi.main(String[])
//                  
//           cantImpares++;
//         }
//     }
        System.out.println("Cantidad Pares:" + cantPares);
        System.out.println("Cantidad Impares:" + cantImpares);
        System.out.println("Cantidad Veces 10:" + cant10);
        // Ordenar vectores
        Arrays.sort(vector);
        
        for (int v :vector)  System.out.print(v +" "); 
            
        

        //foreach
        // el foreach es una simplificacion del for
        /*
       
       for(tipo_de_dato elemento : coleccion){
       
       cuerpo del foreach
       es decir, las instrucciones que se ejecutaran en cada iteracion
       }
         */
       
        for(int v : vector){ // i es el valor o el elemento que esta ahi adentro
                             // es una variable local
            System.out.print(v + " ");
            
        char[] origen = {'a','b','c','d'} ;  
           
      //crear un vetor con la misma longitud que origen
         char [] destino = new char[origen.length]; 
        }
    }
}
