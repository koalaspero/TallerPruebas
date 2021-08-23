package test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import tallerPruebas.Employee;
import tallerPruebas.EmployeeType;

public class SupervisorTest {
    Employee supervisor1;
    Employee supervisor2;

    @Before
    public void setup(){
        supervisor1 = new Employee(20, "USD", 0, EmployeeType.Supervisor);
        supervisor2 = new Employee(20, "EUR", 0, EmployeeType.Supervisor);
    }
     
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo CalculateYearBonus()
    	al utlizar una instancia de Empleado con enum Supervisor y con USD como su moneda*/   	   
    @Test
    public void cybSupervisor1() {
        float bonusSupervisor = supervisor1.CalculateYearBonus();
        assertNotEquals(0.0F, bonusSupervisor);
    }
    
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo cs()  
        al utlizar una instancia de Empleado con enum Supervisor y con USD como su moneda*/
    @Test
    public void csSupervisor1() {
    	float SalarySupervisor= supervisor1.cs();
        assertNotEquals(0.0F, SalarySupervisor);
    }
    
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo CalculateYearBonus()
        al utlizar una instancia de Empleado con enum Supervisor y con EUR como su moneda*/
    @Test
    public void cybSupervisor2() {
        float bonusSupervisor = supervisor2.CalculateYearBonus();
        assertNotEquals(0.0F, bonusSupervisor);
    }
    
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo cs()  
        al utlizar una instancia de Empleado con enum Supervisor y con ERU como su moneda*/
    @Test
    public void csSupervisor2() {
    	float SalarySupervisor= supervisor2.cs();
        assertNotEquals(0.0F, SalarySupervisor);
    }
}
