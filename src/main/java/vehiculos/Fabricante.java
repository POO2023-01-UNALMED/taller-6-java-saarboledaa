package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int vehiculosFabricados;
    static ArrayList<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante (String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
        this.pais.fabricantes.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getVehiculosFabricados() {
        return vehiculosFabricados;
    }

    public void setVehiculosFabricados(int vehiculosFabricados) {
        this.vehiculosFabricados = vehiculosFabricados;
    }

    public void agregarVehiculo(){
        vehiculosFabricados+=1;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = null;
        int n = 0;
        for(Fabricante f: fabricantes)
            if(f.vehiculosFabricados>n) {
                mayor = f;
                n = f.vehiculosFabricados;
            }
        return mayor;
    }
}
