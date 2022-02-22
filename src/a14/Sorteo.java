package a14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteo {

    /*    private ArrayList<Boleto> boletoX = new ArrayList<Boleto>();
     *//*public Sorteo (){
        //El sorteo se hace cada 30 segundos
        this.boletoX = boletoX;
    }*//*

    public ArrayList iniciaSorteo (){
        int numeroBoleto;
        boolean estaPremiado;
        for (int i=0; i=49; i++){

            //Asignamos el numero y si están premiados los boletos
            //boletoX.add()

        }
        return null;
    }*/
//
    private ArrayList<Integer> numPremiados = new ArrayList<Integer>();
    static Random rand = new Random();



    public void setNumPremiados(Integer numPremio) {
        numPremiados.add(numPremio);
    }

    public void llenaNumPremiados() {
        boolean semafor = false;
        int numPremio = rand.nextInt(49);
        while (numPremiados.size() < 8) {
            for (int j = 0; j < numPremiados.size() && semafor == false; j++) {
                if (numPremio == numPremiados.get(j)) {
                    semafor = true;
                }
            }
            if (!semafor) {
                setNumPremiados(numPremio);
            }
        }
    }

    public static void main(String[] args) {
    }
}
