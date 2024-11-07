public class ArbolBinarioBusqueda {

    private class Nodo {
        Empleado empleado;
        Nodo izquierdo, derecho;

        Nodo(Empleado empleado) {
            this.empleado = empleado;
            izquierdo = derecho = null;
        }
    }

    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Inserción en el árbol binario de búsqueda
    public void insertar(Empleado empleado) {
        raiz = insertarRec(raiz, empleado);
    }

    private Nodo insertarRec(Nodo raiz, Empleado empleado) {
        if (raiz == null) {
            raiz = new Nodo(empleado);
            return raiz;
        }

        if (empleado.getId() < raiz.empleado.getId()) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, empleado);
        } else if (empleado.getId() > raiz.empleado.getId()) {
            raiz.derecho = insertarRec(raiz.derecho, empleado);
        }

        return raiz;
    }

    // Buscar un empleado por su ID y devolver el empleado completo
    public Empleado buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Empleado buscarRec(Nodo raiz, int id) {
        if (raiz == null) {
            return null; // Empleado no encontrado
        }

        if (id == raiz.empleado.getId()) {
            return raiz.empleado; // Empleado encontrado
        } else if (id < raiz.empleado.getId()) {
            return buscarRec(raiz.izquierdo, id);
        } else {
            return buscarRec(raiz.derecho, id);
        }
    }
    // Recorrido en preorden
    public void preorden() {
        preordenRec(raiz);
    }

    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.println(raiz.empleado);
            preordenRec(raiz.izquierdo);
            preordenRec(raiz.derecho);
        }
    }

    // Recorrido en inorden
    public void inorden() {
        inordenRec(raiz);
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.println(raiz.empleado);
            inordenRec(raiz.derecho);
        }
    }

    // Recorrido en posorden
    public void posorden() {
        posordenRec(raiz);
    }

    private void posordenRec(Nodo raiz) {
        if (raiz != null) {
            posordenRec(raiz.izquierdo);
            posordenRec(raiz.derecho);
            System.out.println(raiz.empleado);
        }
    }
}
