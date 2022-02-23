package a14;

import java.util.ArrayList;
import java.util.List;

public class EstadoCuentas {
    private List<List<Integer>> boletoEnSorteo = new ArrayList<>();

    public EstadoCuentas(List<List<Integer>> boletoEnSorteo) {
        this.boletoEnSorteo = boletoEnSorteo;
    }
    public EstadoCuentas() {
        this.boletoEnSorteo = boletoEnSorteo;
    }

    public void setBoletoEnSorteo(List<List<Integer>> boletoEnSorteo) {
        this.boletoEnSorteo = boletoEnSorteo;
    }

    public List<List<Integer>> getBoletoEnSorteo() {
        return boletoEnSorteo;
    }

}
