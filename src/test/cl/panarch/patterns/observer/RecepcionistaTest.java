package cl.panarch.patterns.observer;

import cl.panarch.patterns.observer.Empleado;
import cl.panarch.patterns.observer.Observable;
import cl.panarch.patterns.observer.Recepcionista;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class RecepcionistaTest {
    Recepcionista secre;

    @org.junit.Before
    public void setUp() throws Exception {
        secre = new Recepcionista();
    }


    @Test
    public void wheNonEmpleadoAtOfficeRecepcionistaDoesNotAvisa(){
        //arrange
        List<Empleado> empleadosAtOffice = new ArrayList<>();

        //Act
        secre.avisarPastryAndresLlego();

        //assert
        assertEquals(0,secre.countHowManyPeopleNotified());
    }

    @Test
    public void whenSomeoneAtOfficeRecepcionistaNotifyToThis(){
        //arrange
        List<Empleado> empleadosAtOffice = new ArrayList<>();
        Empleado e1 = new Empleado(secre,"Poly");
        Empleado e2 = new Empleado(secre,"Mony");
        //Act
        secre.avisarPastryAndresLlego();
        //assert
        assertEquals(2,secre.countHowManyPeopleNotified());
    }
}