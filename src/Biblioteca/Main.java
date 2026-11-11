package Biblioteca;

public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro(
                "L001", "Cien años de soledad", 1967,
                true, "Gabriel García Márquez", "978-0307474728"
        );

        Revista revista = new Revista(
                "R001", "National Geographic", 2024,
                false, "Edición 125", "Ciencia"
        );

        SistemaBiblioteca sistema = new SistemaBiblioteca();

        sistema.agregarMaterial(libro);
        sistema.agregarMaterial(revista);

        sistema.mostrarCatalogo();

        Material encontrado = sistema.buscarMaterial("L001");

        System.out.println("\nMaterial encontrado:");
        encontrado.mostrarInfo();

        System.out.println("\nLISTA DE ESPERA:");

        sistema.agregarAListaEspera("L001", "Carlos");
        sistema.agregarAListaEspera("L001", "Laura");
        sistema.agregarAListaEspera("L001", "Andrés");

        sistema.mostrarListaEspera("L001");

        System.out.println("\nREGISTRO DE MIEMBROS:");

        sistema.registrarMiembro("12345");
        sistema.registrarMiembro("67890");
        sistema.registrarMiembro("12345");

        System.out.println("¿Es miembro? " + sistema.esMiembro("12345"));
    }

}
