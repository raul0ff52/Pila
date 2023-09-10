

public class Main{

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.InsertarNodo(14);
        pila.InsertarNodo(27);
        pila.InsertarNodo(1);
        pila.InsertarNodo(15);
        pila.InsertarNodo(10);
        pila.InsertarNodo(90);
        pila.InsertarNodo(71);
        pila.InsertarNodo(37);
        pila.InsertarNodo(2);
        pila.InsertarNodo(48);

        //Se imprime el tamaño de la pila
        System.out.println("Insertamos los datos a la pila");
        System.out.println("Tamaño de la Pila: " + pila.TamanoPila());


        //Se quitan 4 elementos de la pila
        System.out.println("Se quitaran 4 elementos");
        for (int i = 0; i < 4; i++) {
            pila.EliminarCima();
        }
         System.out.println("Tamaño de la Pila: " + pila.TamanoPila());

        //Se imprime el elemento de la cima de la pantalla
        System.out.println("El elemento en la cima de la pila es " + pila.MostrarCima());

        //Vaciamos la pila
        System.out.println("A continuacion se vaciara la pila");
        pila.VaciarPila();
        System.out.println("Tamaño de la Pila: " + pila.TamanoPila());

        //Mostramos en pantalla si la pila esta vacia o no
        if(pila.PilaVacia()){
            System.out.println("La pila se encuentra vacia");
        }else{
            System.out.println("La pila tiene elementos");
        }
    }
}