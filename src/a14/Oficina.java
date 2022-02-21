package a14;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Oficina implements Runnable{
    String strPrint;
    private ArrayList<Integer> numeroBoletoX = new ArrayList<Integer>();
    private ArrayList<Integer> boletoXConcursante = new ArrayList<Integer>();

    // private int boletoA[] = new int[];
    private int numBoleto[] = new int[6];
    private int secuenciaNumerica;
    Random rand = new Random();
    public Oficina(String strP) {
        this.strPrint=strP;
    }
    @Override
    public void run() {
        try {
            System.out.println("Se ha creado la oficina " + strPrint);
            //0,25 Y 2 SEGUNDOS
            Thread.sleep(1000);
            System.out.println("Una persona a llegado a la oficina " + strPrint);
            for (int i=0; i<6; i++){

                int int_random = rand.nextInt(49);
                numBoleto[i] = int_random;
                for (int j=0; j<6; j++){
                    if (numBoleto[i]==numBoleto[j] && j!=i){
                        numBoleto[i] = rand.nextInt(49);

                    }
                }
            }

            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int x: numBoleto) {
                al.add(x);
            }

            System.out.println("Esta persona ha apostado por el numero " + al);


            //La secuencia de numeros que recibe la persona

            //Apuestas

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Pide numero a la persona
        //Empiezan apuestas
            //Saber el numero de apustas
            //Sincronizar hilos?
            //
    }

    //Setters y Getters

}
