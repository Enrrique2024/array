//Zahid Enrrique Esquivel Lainez
//Grupo 1M7-s
//Caner: 2024-1693U

import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        public class App {

            public static int tamv = 0;
        
            public static void main(String[] args) throws Exception {
        
                boolean condicioSalida = true;
        
                do {
        
                    try {
        
                        System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                        tamv = new java.util.Scanner(System.in).nextInt();
                        condicioSalida = (tamv >= 2 && tamv <= 16);
        
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Ocurrió algo, por favor revise nuevamente.");
                    }
        
                } while (!condicioSalida);
        
                int[] array = llenado();
        
                System.out.println("Mostrar");
        
                Mostrar(array);
        
                invertirArray(array);
        
                System.out.println("Array invertido:");
        
                Mostrar(array);
            }
        
            public static int[] llenado() {
        
                int[] arreglo = new int[tamv];
        
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Ingrese el valor [" + i + "]");
                    arreglo[i] = new java.util.Scanner(System.in).nextInt();
                }
        
                return arreglo;
            }
        
            public static void Mostrar(int[] a) {
        
                for (int i : a) {
                    System.out.println(i);
                }
            }
        
            public static void invertirArray(int[] array) { //el metodo invertirArray  no tiene cambios, simplemente invierte los elementos del arreglo como lo hacía en el código original que en este caso el codigo original es el suyo.
                int left = 0;
                int right = array.length - 1;
        
                while (left < right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
        
                    left++;
                    right--;
                }
            }
        

//En resumen, lo que hice fue tomar el mismo codigo y nada mas modificarlo para que me coloque los valores invertidos y solo seria eso, porfavor si tengo algun error 
//digamelo para mejorar ;)