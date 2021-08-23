package test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import tallerPruebas.Employee;
import tallerPruebas.EmployeeType;    
    
public class EmployeeTest {
    Employee trabajador;

    @Before
    public void setup(){
        trabajador = new Employee(20, "USD", 0, EmployeeType.Worker);
    }
        
    @Test
    public void csWorker() {
        float bonusWorker = trabajador.CalculateYearBonus();
    }
}
    