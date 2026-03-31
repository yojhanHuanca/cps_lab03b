package pe.edu.tecsup.lab03.repositories;

public class StudentRepository {

    public void guardar() {
        System.out.println("Guardando estudiante...");
    }

    public void buscarPorId(int id) {
        System.out.println("Buscando estudiante con id: " + id);
    }
}