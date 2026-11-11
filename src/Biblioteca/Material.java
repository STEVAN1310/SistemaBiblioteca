package Biblioteca;

public abstract class Material implements Catalogable{

    private String codigo;
    private String titulo;
    private int anio;
    private boolean disponible;

    public Material(String codigo, String titulo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract String getTipo();

    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";

        System.out.println("[" + getTipo() + "] " +
                titulo + " (" + anio + ") — " + estado);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }
}


