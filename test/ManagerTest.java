package test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import tallerPruebas.Employee;
import tallerPruebas.EmployeeType;


public class ManagerTest {
    Employee manager;

    @Test
    public void csManager1Test() {
        manager = new Employee(20, "USD", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.cs());
    }

    @Test
    public void cybManager1Test() {
        manager = new Employee(20, "USD", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.CalculateYearBonus());
    }

    @Test
    public void csManager2Test () {
        manager = new Employee(20, "EUR", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.cs());

    }
    @Test
    public void cybManager2Test() {
        manager = new Employee(20, "EUR", 0, EmployeeType.Manager);
        assertNotEquals(0.0f,manager.CalculateYearBonus());
    }
}
