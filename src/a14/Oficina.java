package a14;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Oficina implements Runnable{
    String strPrint;
    SorteoB sorteoX;
    boolean otraPersona=true;
    boolean semafor = false;
    private ArrayList<Integer> numeroBoletoX = new ArrayList<Integer>();
    private List<List<Integer>> boletoXConcursante = new ArrayList<>();
    private EstadoCuentas cuentasOficina;
    private int numBoleto[] = new int[6];
    Random rand = new Random();

    public Oficina(String strP) {
        this.strPrint=strP;
    }
    @Override
    public void run() {
        try {
            System.out.println("Se ha creado la oficina " + strPrint);
            do {
                //0,25 Y 2 SEGUNDOS
                Thread.sleep((int)Math.random() * (2000 + 1 - 250) + 250);
                System.out.println("Una persona a llegado a la oficina " + strPrint);
                for (int i = 0; i < 6; i++) {
                    int int_random = rand.nextInt(49);
                    numBoleto[i] = int_random;
                    for (int j = 0; j < 6 && semafor == false; j++ ) {
                        if (numBoleto[i] == numBoleto[j] && j != i) {
                            numBoleto[i] = rand.nextInt(49);
                        }
                        else if (numBoleto[i] != numBoleto[j]) {
                            semafor = true;
                        }
                    }
                }
//
                ArrayList<Integer> al = new ArrayList<Integer>();
                for (int x : numBoleto) {
                    al.add(x);
                }
                //Apuestas 30 SEGUNDOS
                Thread.sleep(3000);
                System.out.println("Esta persona ha apostado por el numero " + al);

                boletoXConcursante.add(al);

                //System.out.println("Actualmente los boletos " + boletoXConcursante + " han sido apostados en la oficina");

                //Randomizar la llegada de otra persona
                otraPersona=rand.nextBoolean();
                otraPersona=rand.nextBoolean();
                //System.out.println(otraPersona);
            }while (otraPersona==true);
            //La secuencia de numeros que recibe la persona
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //No hay forma de estraer los numeros del hilo aun. Es un problema serio
        cuentasOficina.setBoletoEnSorteo(new ArrayList<>(boletoXConcursante));
//        sorteoX.setBoletoEnSorteo(boletoXConcursante);
//        sorteoX.getBoletoEnSorteo();

        //Pide numero a la persona
        //Empiezan apuestas
            //Saber el numero de apustas
            //Sincronizar hilos?
            //
    }



    //Setters y Getters

}
