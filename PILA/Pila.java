
public class Pila{

    private int tamanio;
    private Nodo cima;
    
    
    public Pila(int tamanio, Nodo cima) {
        this.tamanio = tamanio;
        this.cima = cima;
    }

    public Pila(){
        cima = null;
        tamanio = 0;  
    }

    /*public Pila(Nodo cima, int tamanio) {
        this.cima = cima;
        this.tamanio = tamanio;
    }*/

    //1.-Insertar un nodo a la cima
    public void InsertarNodo(int dato){
        Nodo nuevoNodo = new Nodo(dato);
         if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setNodo(cima);
            cima = nuevoNodo;
        }
        tamanio++;

    }

     //2.-Metodo para quitar el nodo de la cima
     public void EliminarCima(){
        if(cima != null){
            cima = cima.getNodo();
            tamanio--;
        }
    }

     //3.- Metodo para saber si la pila esta vacia
     public boolean PilaVacia(){
        return cima == null;
    }

     //4.-Metodo para vaciar la fila
     public void VaciarPila(){
        while (!PilaVacia()){
            EliminarCima();
        }

    }
    
    //5.-Metodo para conocer el valor del nodo que esta en la cima
    public int MostrarCima(){
        return cima.getDato();
    }

    //6.- Conocer el tamaño de la pila
    public int TamanoPila(){
        return tamanio;

    }
} 