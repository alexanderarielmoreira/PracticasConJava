package guiatp1;

public class Separadores {

    // Método de clase. No se instancia sino que se accede con la
    // notación de punto llamando a la clase;
    public static void separadorCombinado() {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    };

    // Es instanciable al no contener el modificador 'static';
    public void separadorLinealSimple() {
        System.out.println("--------------------------------------------");
    };

};
