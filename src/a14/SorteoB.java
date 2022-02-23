package a14;

import java.util.ArrayList;
import java.util.List;
//Sorteo va independiente a las acciones de la oficina u cualquier otro hilo (30 segundos)
public class SorteoB {

    private List<List<Integer>> boletoEnSorteo = new ArrayList<>();

    public SorteoB(List<List<Integer>> boletoEnSorteo) {
        this.boletoEnSorteo = boletoEnSorteo;
    }
    public SorteoB() {
        this.boletoEnSorteo = boletoEnSorteo;
    }

    public void setBoletoEnSorteo(List<List<Integer>> boletoEnSorteo) {
        this.boletoEnSorteo = boletoEnSorteo;
    }

    public List<List<Integer>> getBoletoEnSorteo() {
        return boletoEnSorteo;
    }

}
