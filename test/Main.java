import java.util.*; 
public class Main
{ 
    public static void main(String[] args){ 
	
		Payrolldatabase db = new Payrolldatabase();
		Employee e1 = new Employee(1, "Bob", "New york","salary", 20000,"account");
		Employee e2 = new Employee(2, "Rob", "Tokyo", "salary", 30000,"cash");
		Employee e3 = new Employee(3, "Sam", "Delhi", "hourly", 150,"cash");
		Employee e4 = new Employee(4, "Ram", "London", "hourly", 100,"cash");

		db.addEmployee(1, e1);
		db.addEmployee(2, e2);
		db.addEmployee(3, e3);
		db.addEmployee(4, e4);

		Transaction t1 = new Transaction();
		distributor d1 = new distributor();

		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		double x;
		for(int i = 1; i <= days; i++){
			int day = sc.nextInt();
				System.out.println("Day: " + day);
			for(int j = 1; j <= 4; j++){
				int id;
				double per, com ,hrs;
				id = sc.nextInt();
				per = sc.nextDouble();
				com = sc.nextDouble();
				hrs = sc.nextDouble();
				System.out.println("EmployId: " + id);
				Employee emp = db.getEmployee(id);
				Salesreceipt s1 = new Salesreceipt(id, per, com);
				Timecard tc1 = new Timecard(id, hrs); 	
				emp = t1.calculateforday(emp, tc1);
				emp = t1.salescalculateforday(emp, s1);
				emp = d1.payroll(emp, day);
				db.addEmployee(id, emp);
			}
		}

	}
	 
} 

