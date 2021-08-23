package test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import tallerPruebas.Employee;
import tallerPruebas.EmployeeType;


public class ManagerTest {
    Employee manager;
	
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo cs()  
        al utlizar una instancia de Empleado con enum Manager y con USD como su moneda*/
    @Test
    public void csManager1Test() {//Caso de prueba en el que se calcula 
        manager = new Employee(20, "USD", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.cs());
    }

    /*En este caso de prueba, se verifica que haya una salida correcta del metodo CalculateYearBonus()
    	al utlizar una instancia de Empleado con enum Manager y con USD como su moneda*/
    @Test
    public void cybManager1Test() {
        manager = new Employee(20, "USD", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.CalculateYearBonus());
    }

    /*En este caso de prueba, se verifica que haya una salida correcta del metodo cs()  
        al utlizar una instancia de Empleado con enum Manager y con ERU como su moneda*/
    @Test
    public void csManager2Test () {
        manager = new Employee(20, "EUR", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.cs());

    }

    /*En este caso de prueba, se verifica que haya una salida correcta del metodo CalculateYearBonus()
        al utlizar una instancia de Empleado con enum Manager y con EUR como su moneda*/
    @Test
    public void cybManager2Test() {
        manager = new Employee(20, "EUR", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.CalculateYearBonus());
    }
}
