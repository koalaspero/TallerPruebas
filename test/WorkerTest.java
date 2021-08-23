package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

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
        
    @Test
    public void cybTrabajador1() {
        float bonusTrabajador = trabajador1.CalculateYearBonus();
        assertNotEquals(0.0F, bonusTrabajador);
    }
    
    @Test
    public void csTrabajador1() {
    	float SalaryTrabajador= trabajador1.cs();
        assertNotEquals(0.0F, SalaryTrabajador);
    }
    
    @Test
    public void cybTrabajador2() {
        float bonusTrabajador = trabajador2.CalculateYearBonus();
        assertNotEquals(0.0F, bonusTrabajador);
    }
    
    @Test
    public void csTrabajador2() {
    	float SalaryTrabajador= trabajador2.cs();
        assertNotEquals(0.0F, SalaryTrabajador);
    }


}
    