package a14;

import java.util.Scanner;

public class TheMain {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws InterruptedException {
        int opcio;
        String nombreOficina;
        System.out.println("Escoge que quieres hacer");
        do {
            System.out.println("\n-1. Crear oficina \n-2. Que una persona pida un boleto \n-3. Iniciar sorteo \n-4. Salir del programa");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    //Crear oficinas
                    do {
                        System.out.println("Dime el nombre de una oficina");
                        sc.nextLine();
                        nombreOficina = sc.nextLine();
                        Thread.sleep(3000);
                        Thread oficinaX = new Thread(new Oficina(nombreOficina));
                        oficinaX.start();
                        oficinaX.join();
                        System.out.println("¿Quiere hacer otra oficina? 1=Si, 2=No");
                        opcio = sc.nextInt();
                    } while (opcio == 1);
                    System.out.println("Saliendo del creador de oficinas");
                    break;
                case 2:
                    //Estado de cuentas
                    break;
                case 3:
                    //Escrutiño (saber quien ha ganado)
                    break;
                case 4:
                    System.out.println("Te saliste de la loteria wey");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Algunos dicen que la vida es una tombola pero resulta que todo ya esta planeado. \nEn resumen, no se han ofrecido más opciones. Solo tiene disponibles de la 1 a la 4.");


            }
        }while (opcio!=4);

    }
}
