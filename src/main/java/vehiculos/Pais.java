package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    public ArrayList<Fabricante> fabricantes = new ArrayList<>();
    static ArrayList<Pais> paises = new ArrayList<>();

    public Pais (String nombre){
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        Pais mayor = null;
        int m = 0;
        for(Pais p: paises) {
            int n = 0;
            for (Fabricante f: p.fabricantes) {
                n += f.getVehiculosFabricados();
            }
            if (n > m) {
                mayor = p;
                m = n;
            }
        }
        return mayor;
    }
}
