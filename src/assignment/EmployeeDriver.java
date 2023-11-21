package assignment;

/*Author: Md Molla
 * Class: DA 151 Assignment 3 eclipse
 * Lesson 2:Using Object Classes and Driver Classes
*/
/*run the project as java application:
 *  it should Display three Object Information as output*/

public class EmployeeDriver {

	public static void main(String[] args) {
		/*
		 * Creating three different Employee objects such as
		 * employee1,employee2,employee3
		 */
		/*
		 * creating Employee Object: here Employee is a class name , employee1 object
		 * reference and "new" is a java key word to create new instance of a class
		 */
		Employee employee1 = new Employee();
		// I have called methods from Employee class with the reference of employee1
		// object
		// setting the employee1 object value
		employee1.setfName("Caron");
		employee1.setlName("Newman");
		employee1.setEmpId(123456789);
		employee1.setStatus("Active");
		employee1.setDepartment("Info Tech");

		// getting employee1 object value and printing each object in the console
		System.out.println("employee1 Information : --   --  --    --  --  -- --  --");
		System.out.println("First Name : " + employee1.getfName());
		System.out.println("Last Name : " + employee1.getlName());
		System.out.println("Employee ID : " + employee1.getEmpId());
		System.out.println("Status : " + employee1.getStatus());
		System.out.println("Depaartment : " + employee1.getDepartment());

		System.out.println("<> <> <> <>     <> <> <> <>   <> <> <> <>   <> <> <> <>");
		// setting the employee2 object value
		Employee employee2 = new Employee();
		// I have called methods from Employee class with the reference of employee2
		// object
		employee2.setfName("John");
		employee2.setlName("Smith");
		employee2.setEmpId(987654321);
		employee2.setStatus("Inactive");
		employee2.setDepartment("Business");
		// getting employee2 object value and printing each object in the console
		System.out.println("employee2 Information : --  ---  --  ---  --  ---  --  ----");
		System.out.println("First Name : " + employee2.getfName());
		System.out.println("Last Name : " + employee2.getlName());
		System.out.println("Employee ID : " + employee2.getEmpId());
		System.out.println("Status : " + employee2.getStatus());
		System.out.println("Depaartment : " + employee2.getDepartment());
		System.out.println("<> <> <> <>     <> <> <> <>   <> <> <> <>   <> <> <> <>");
		// setting the employee3 object value
		Employee employee3 = new Employee();
		// I have called methods from Employee class with the reference of employee3
		// object
		employee3.setfName("Leonardo");
		employee3.setlName("DiCaprio");
		employee3.setEmpId(147258369);
		employee3.setStatus("Active");
		employee3.setDepartment("Security");

		// getting employee3 object value and printing each object in the console
		System.out.println("employee3 Information  :--  ---  ---  -- -- --- -- -- --- ");
		System.out.println("First Name : " + employee3.getfName());
		System.out.println("Last Name : " + employee3.getlName());
		System.out.println("Employee ID : " + employee3.getEmpId());
		System.out.println("Status : " + employee3.getStatus());
		System.out.println("Depaartment : " + employee3.getDepartment());

	}
}
