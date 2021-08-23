package test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

import tallerPruebas.Employee;
import tallerPruebas.EmployeeType;

@RunWith(value = Parameterized.class)
public class EmployeeTest {
    Employee employee;
	private static int nCaso = 0;
	
	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> emp = new ArrayList<>();
		emp.add(new Object[] { 400.00f, "USD", 5.00f, EmployeeType.Worker });		
		emp.add(new Object[] { 400.00f, "USD", 5.00f, EmployeeType.Supervisor });
		emp.add(new Object[] { 400.00f, "USD", 5.00f, EmployeeType.Manager });
		
		emp.add(new Object[] { 400.00f, "EUR", 5.00f, EmployeeType.Worker });
		emp.add(new Object[] { 400.00f, "EUR", 5.00f, EmployeeType.Supervisor });
		emp.add(new Object[] { 400.00f, "EUR", 5.00f, EmployeeType.Manager });
		
		return emp;
	}
	
	private final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    private String currency;
    //porcentaje de bonus
    private float bonusPercentage;    
    //variable de tipo employeeType
    private EmployeeType employeeType; 
    
    public EmployeeTest(float salary, String currency, 
            float bonusPercentage, EmployeeType employeeType)
    {
    	this.salary = salary;
        this.currency = currency;
        this.bonusPercentage = bonusPercentage;
        this.employeeType = employeeType;
    }
    
    @Before
    public void before() {
    	nCaso++;
    	System.out.println("Caso #"+nCaso);
    	System.out.printf("Salary: %.2f, Currency: %s, Bonus: %.2f%%, EmployeeType: %s \n", salary, currency,
    			bonusPercentage, employeeType);
    	employee = new Employee(salary,currency,bonusPercentage,employeeType);
    }

    /*En este caso de prueba, verificamos que se realicen correctamente los calculos para los distintos casos
    presentados (mes impar, mes par, moneda USD y otra moneda) para los tres tipos de empleado*/
    @Test
    public void testCs() {
    	//
    	System.out.println("Doing cs...");
    	float salario = 0;
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate;
        localDate = date.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        // Si la moneda es USD, se considera todo el salario,
        // caso contrario se resta 5% por cambio de moneda
        if(currency == "USD"){salario = salary; }
        else{salario = (float) (salary * 0.95);}
        switch (employeeType)         
        {
            case Worker:
                //Si el mes es impar entonces le entrega 
                //se realizan otros calculos adicionales
            	assertEquals ( month%2==0?salario:salario + rmu/12*2, employee.cs(), 0f);
            	return;
            case Supervisor:
                float valueS = salario + (bonusPercentage * 0.35F);
                /*Si el mes es impar entonces le entrega 
               un valor distinto*/
                assertEquals( month%2==0?valueS:valueS + rmu/12*2, employee.cs(), 0f );
                return;
            case Manager:
                float valueM = salario + (bonusPercentage * 0.7F);
                /*Si el mes es impar entonces se realizan mas calculos*/
                assertEquals( month%2==0?valueM:valueM + rmu/12*2, employee.cs(), 0f);
                return;
        }
        assertEquals(0.0F, employee.cs(), 0f);
    }

}
