package Biblioteca;

public class Revista extends Material {

    private String edicion;
    private String tematica;

    public Revista(String codigo, String titulo, int anio,
                   boolean disponible, String edicion, String tematica) {

        super(codigo, titulo, anio, disponible);
        this.edicion = edicion;
        this.tematica = tematica;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
