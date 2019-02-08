package list;

import java.util.ArrayList;

public class StdentEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList arrayList= new ArrayList();
		arrayList.add(new Student(1,"Array is type safe"));
		arrayList.add(new Employee(1,"Emran"));
		arrayList.add(4);
		arrayList.add("Collection are not type safe");
		
		System.out.println(arrayList);
		
		for(Object object:arrayList) {
			
			if(object instanceof Employee) {
				
				        Employee emp =(Employee)object;
				        System.out.println("ID:"+emp.getEmpId()+"    "+"NAME:"+emp.getEmpNameString());
			}
			
			if(object instanceof Student) {
				
				Student std= (Student)object;
				System.err.println("Student ID: "+std.getStuId()+"   "+"Stdent Name:  "+std.getStuName());
			}
			
			if(object instanceof Integer) {
				
				
				System.err.println(object);
				
			}
			
			if(object instanceof String) {
				System.err.println(object);
				
			}
			
			if(object==null) {
				System.err.println(object);
				
			}
			
		}
		


	}

}
