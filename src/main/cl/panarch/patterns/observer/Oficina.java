package cl.panarch.patterns.observer;

public class Oficina {

    public static void main(String[] args){
        Recepcionista secretaria = new Recepcionista();
        secretaria.setName("Luz");

        Observer empleado2 = new Empleado(secretaria, "Reny");
        Empleado empleado3 = new Empleado(secretaria, "Poly");
        Empleado empleado4 = new Empleado(secretaria, "Ramonchy");

        secretaria.avisarPastryAndresLlego();
        secretaria.cuentaCopucha("\n Adivina quien se va a US ?? ...",empleado2);
    }


}