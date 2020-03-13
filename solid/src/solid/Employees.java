package solid;

public abstract class Employees{
	 private int id;
	    private String job ;
	    private int workingHours;
	    private int salary;
	    
	public Employees() {
		// TODO Auto-generated constructor stub
	}
		/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(final String job) {
		this.job = job;
	}
	/**
	 * @return the workingHours
	 */
	public int getWorkingHours() {
		return workingHours;
	}
	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(final int workingHours) {
		this.workingHours = workingHours;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(final int salary) {
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}
	
		

}
