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
        
    @Test
    public void cybSupervisor1() {
        float bonusSupervisor = supervisor1.CalculateYearBonus();
        assertNotEquals(0.0F, bonusSupervisor);
    }
    
    @Test
    public void csSupervisor1() {
    	float SalarySupervisor= supervisor1.cs();
        assertNotEquals(0.0F, SalarySupervisor);
    }
    
    @Test
    public void cybSupervisor2() {
        float bonusSupervisor = supervisor2.CalculateYearBonus();
        assertNotEquals(0.0F, bonusSupervisor);
    }
    
    @Test
    public void csSupervisor2() {
    	float SalarySupervisor= supervisor2.cs();
        assertNotEquals(0.0F, SalarySupervisor);
    }
}
