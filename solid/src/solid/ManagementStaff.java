package solid;

public abstract class ManagementStaff extends Employees{
	Employees employee;
	 void performAppraisalOfDirectReport(Employees employee){}
	    void promoteDirectReport(Employees employee){}    
	    abstract void sendCommunication();
	    void calculateSalary() {
	    	employee.setSalary(employee.getWorkingHours()*100);
	    }
}
