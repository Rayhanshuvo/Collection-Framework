package list;

import java.util.ArrayList;

public class ArrayListProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays are type safe

		int[] array = { 1, 2, 3, 4, 5 };
		for (int var : array) {

			System.out.println(var);

		}

		// Collections are not Type safe
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Student(1, "Taposh"));
		arrayList.add(new Employee(1, "Second Taposh"));

		for (Object o : arrayList) {

			if (o instanceof Student) {

				Student student = (Student) o;
				System.out.println(student.getStuId() + "" + student.getStuName());

			}

			if (o instanceof Employee) {

				Employee employee = (Employee) o;
				System.out.println(employee.getEmpId() + "" + employee.getEmpNameString());
			}

			if (o.equals(null)) {

				System.out.println("NULL VALUE");
			}

		}
		
		Object ooObject= arrayList.get(1);
		
		if(ooObject instanceof Student) {
			Student student=(Student) ooObject;
			System.out.println(student.getStuId()+""+student.getStuName());
			
			
		}
		
		if(ooObject instanceof Employee) {
			
			Employee employee= (Employee) ooObject;
			System.out.println(employee.getEmpId()+""+employee.getEmpNameString());
			
			
		}
		
		//Provide the type safety to call using generics
		
		ArrayList<Employee> arrayList2=new ArrayList<Employee>();//It simply says that arraylist can only hold employee data
		
        arrayList2.add(new Employee(1,"Empl"));
        arrayList2.add(new Employee(3,"Emp2"));
        for(Employee emp:arrayList2) {
        	
        	System.out.println(emp.getEmpId()+""+emp.getEmpNameString());
        }
	}
	//Collections are hetrogenous but it is not recommended
	//Generics are recommended means homogenous are recommended

}
