package Biblioteca;


import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.Set;

public class SistemaBiblioteca {

    private HashMap<String, Material> catalogo = new HashMap<>();
    private Set<String> membresias = new HashSet<>();
    private Map<String, List<String>> listasEspera = new HashMap<>();

    public void agregarMaterial(Material material) {
        catalogo.put(material.getCodigo(), material);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {
        for (Material material : catalogo.values()) {
            material.mostrarInfo();
        }
    }
    // LISTAS DE ESPERA
    public void agregarAListaEspera(String codigo, String nombre) {
        listasEspera.putIfAbsent(codigo, new ArrayList<>());
        listasEspera.get(codigo).add(nombre);
    }

    public void mostrarListaEspera(String codigo) {
        List<String> personas = listasEspera.get(codigo);

        if (personas == null || personas.isEmpty()) {
            System.out.println("No hay personas en lista de espera.");
            return;
        }

        System.out.println("Lista de espera para " + codigo + ":");

        for (String persona : personas) {
            System.out.println("- " + persona);
        }
    }

    // MEMBRESÍAS
    public void registrarMiembro(String documento) {
        boolean registrado = membresias.add(documento);

        if (registrado) {
            System.out.println("Miembro registrado: " + documento);
        } else {
            System.out.println("El miembro ya estaba registrado.");
        }
    }

    public boolean esMiembro(String documento) {
        return membresias.contains(documento);
    }
}
