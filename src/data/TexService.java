package data;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TexService {
	

	public List<Employee> evaluateaTexUser() {
		return MyDataBase.getEmployees().stream()
				.filter(emp -> emp.getSalary() >= 6 - 00000 || emp.getName()
				.startsWith("S"))
				.collect(Collectors.toList());

	}

	public List<Employee> FindbyName(String nam) {
		return MyDataBase.getEmployees()
				.stream()
				.filter(name -> name.getName()
				.equals(nam))
				.collect(Collectors.toList());
	}

	public List<Employee> getList() {
		return MyDataBase.getEmployees();
	}

	public static TexService getboj() {
		 return new TexService();
	}

	public static void main(String[] args) {
		// TexService ts = new TexService();
//		List<Employee> le=ts.evaluateaTexUser();
//		le.stream().forEach(System.out::println);
		// TexService().evaluateaTexUser().stream().forEach(System.out::println);

		// ts.FindbyName("Roshan").stream().forEach(System.out::println);
		// short
		getboj()
		.getList()
		.stream()
		.sorted(Comparator.comparing(Employee::getId))
		.forEach(System.out::println);
		
	}

}
