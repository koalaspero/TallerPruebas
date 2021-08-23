package test;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import tallerPruebas.Employee;
import tallerPruebas.EmployeeType;    
    
public class WorkerTest {
    Employee trabajador1;
    Employee trabajador2;

    @Before
    public void setup(){
        trabajador1 = new Employee(20, "USD", 0, EmployeeType.Worker);
        trabajador2 = new Employee(20, "EUR", 0, EmployeeType.Worker);
    }
    
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo CalculateYearBonus()
        al utlizar una instancia de Empleado con enum Worker y con USD como su moneda*/    
    @Test
    public void cybTrabajador1() {
        float bonusTrabajador = trabajador1.CalculateYearBonus();
        assertNotEquals(0.0F, bonusTrabajador);
    }
       /*En este caso de prueba, se verifica que haya una salida correcta del metodo cs()  
        al utlizar una instancia de Empleado con enum Worker y con USD como su moneda*/    
    @Test
    public void csTrabajador1() {
    	float SalaryTrabajador= trabajador1.cs();
        assertNotEquals(0.0F, SalaryTrabajador);
    }
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo CalculateYearBonus()
        al utlizar una instancia de Empleado con enum Worker y con EUR como su moneda*/    
    @Test
    public void cybTrabajador2() {
        float bonusTrabajador = trabajador2.CalculateYearBonus();
        assertNotEquals(0.0F, bonusTrabajador);
    }
    /*En este caso de prueba, se verifica que haya una salida correcta del metodo cs()  
        al utlizar una instancia de Empleado con enum Worker y con ERU como su moneda*/    
    @Test
    public void csTrabajador2() {
    	float SalaryTrabajador = trabajador2.cs();
        assertNotEquals(0.0F, SalaryTrabajador);
    }


}
    