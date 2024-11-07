import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear instancia del árbol binario de búsqueda
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        // Crear empleados
        Empleado emp1 = new Empleado(1001, "Carlos Pérez");
        Empleado emp2 = new Empleado(1002, "Ana López");
        Empleado emp3 = new Empleado(1003, "José Martínez");
        Empleado emp4 = new Empleado(1004, "Lucía García");
        Empleado emp5 = new Empleado(1005, "Raúl Gómez");
        Empleado emp6 = new Empleado(1006, "María Fernández");
        Empleado emp7 = new Empleado(1007, "Pedro Díaz");
        Empleado emp8 = new Empleado(1008, "Sofía Rodríguez");
        Empleado emp9 = new Empleado(1009, "Luis Herrera");
        Empleado emp10 = new Empleado(1010, "Marta Sánchez");
        Empleado emp11 = new Empleado(1011, "Ricardo González");
        Empleado emp12 = new Empleado(1012, "Eva Ramírez");

        // Insertar empleados en el árbol
        arbol.insertar(emp1);
        arbol.insertar(emp2);
        arbol.insertar(emp3);
        arbol.insertar(emp4);
        arbol.insertar(emp5);
        arbol.insertar(emp6);
        arbol.insertar(emp7);
        arbol.insertar(emp8);
        arbol.insertar(emp9);
        arbol.insertar(emp10);
        arbol.insertar(emp11);
        arbol.insertar(emp12);

        // Mostrar recorridos
        System.out.println("Recorrido Preorden:");
        arbol.preorden();

        System.out.println("\nRecorrido Inorden:");
        arbol.inorden();

        System.out.println("\nRecorrido Posorden:");
        arbol.posorden();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean continuar = true;

        // Bucle principal para consultar empleados
        while (continuar) {
            System.out.println("\nIngrese el ID del empleado que desea buscar o 'salir' para terminar:");
            input = scanner.nextLine().trim(); // Leer la entrada y eliminar espacios innecesarios

            if (input.equalsIgnoreCase("salir")) {
                continuar = false; // Salir del bucle si el usuario escribe 'salir'
            } else {
                try {
                    int idBuscar = Integer.parseInt(input); // Convertir la entrada a un número entero
                    Empleado empleado = arbol.buscar(idBuscar); // Buscar el empleado por ID

                    if (empleado != null) {
                        // Si el empleado existe, mostrar el nombre
                        System.out.println("El empleado con ID " + idBuscar + " es: " + empleado.getNombre());
                    } else {
                        System.out.println("El empleado con ID " + idBuscar + " no fue encontrado.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un ID válido.");
                }
            }
        }

        // Cerrar el scanner
        scanner.close();
        System.out.println("Programa terminado.");
    }
}
