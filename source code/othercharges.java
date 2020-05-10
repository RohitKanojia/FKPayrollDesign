//other charges contain membership
class othercharges{
	public Employee membership(int id, Employee emp, double val){
		if(id == emp.id){
			emp.setothercharges(val);
		}
		return emp;
	}		

}
