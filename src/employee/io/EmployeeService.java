package employee.io;

import java.util.*;

public class EmployeeService {

	public void addEmployee(String name, double salary) {

	}

	public static void main(String[] args) {
		DisplayDetails displayDetails = new DisplayDetails();

		List<Employee> employee = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			displayDetails.showDetails();
			int num = sc.nextInt();

			if (num == -1) {
				break;
			}

			switch (num) {
			case 1:

				// System.out.println("enter id");
				// long id= sc.nextInt();
				System.out.println("add name");
				String name = sc.next();
				System.out.println("add salary");
				Double salary = (double) sc.nextInt();

				Employee emp = new Employee(name, salary);
				employee.add(emp);
				break;

			case 2:

				System.out.println("traversing through employee list");

				Iterator<Employee> itr = employee.iterator();

				while (itr.hasNext()) {

					Employee emp1 = itr.next();
					System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());

				}
				break;
			case 3:

				System.out.println("Search by employee id");

				int index = sc.nextInt() - 1;
				Employee newemployee = employee.get(index);

				System.out.println("Element at given id is: " + newemployee.getId() + " " + newemployee.getName() + " "
						+ newemployee.getSalary());
				break;

			}
		}

	}
}
