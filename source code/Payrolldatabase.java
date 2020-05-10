
//This flie contain database of employee it contain hash map.
import java.util.*;
public class Payrolldatabase {
	private static HashMap<Integer,Employee> employees = new HashMap<Integer,Employee>();
    	
    	public void addEmployee(int id, Employee employee){
        	employees.put(id, employee);
    	}	
    	
    	public Employee getEmployee(int empId){
        	return employees.get(empId);
    	}
    	
    	public void deleteEmployee(int id) {
        	employees.remove(id);
    	}

    	public Collection<Employee> getAllEmployees() {
      		return employees.values();
    	}
}
