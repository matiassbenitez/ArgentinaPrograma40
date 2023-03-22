
package Clases9a11;

import java.util.Scanner;

/**
 * Escribir un programa que llene con una secuencia ordenada de números
 * iniciada en 1, una matriz de afuera, comenzando desde el elemento (0,0)
 * hacia adentro en forma de espiral.
 * 
 *  1   2   3   4   5   6
 * 20  21  22  23  24   7
 * 19  32  33  34  25   8
 * 18  31  36  35  26   9
 * 17  30  29  28  27  10
 * 16  15  14  13  12  11
 */
public class espiral {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int f = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int c = leer.nextInt();
        int fila=0,columna=0,cont=1;
        int lsFila=f-1,liFila=0,lsCol=c-1,liCol=0;
        int[][] matriz = new int[f][c];
        while (cont<=f*c){
            matriz[fila][columna] = cont;
            cont++;
            
            if (fila==liFila){          //fila está en límite inferior.
                if (columna<lsCol){     //si todavía no llegó al final de la fila, me desplazo a la derecha.
                    columna++;
                    if (columna==lsCol){
                        if(cont!=c){
                            liCol++;        //*
                        }
                    }
                }else{                  //si ya llegó al final de la fila, me desplazo hacia abajo.
                    fila++;
                }
            }else if(fila==lsFila){     //fila está en límite superior.
                if (columna>liCol){     //si todavía no llegó al final de la fila, me desplazo a la izquierda.
                    columna--;
                    if (columna==liCol){
                        lsCol--;        //*
                    }
                }else{                  //si ya llegó al final de la fila, me desplazo hacia abajo.
                    fila--;
                    
                }
            }else{                      //fila no está en ningún límite.
                if (columna==lsCol){    //si está sobre el límite superior, me desplazo hacia abajo.
                    fila++;
                    if (fila==lsFila){  
                        liFila++;       //*
                    }
                }else{                  //si está en el límite inferior(no puede estar en otro lado), me desplazo hacia arriba.
                    fila--;
                    if (fila==liFila){  
                        lsFila--;       //*
                    }
                }
            }
            //* verifico en qué esquina me encuentro para disminuir el límite del lado contrario.
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j]<10){
                    System.out.print(matriz[i][j]+ "  ");
                }else{
                    System.out.print(matriz[i][j]+ " ");
                }
            }
            System.out.println("");
        }

    }

}
