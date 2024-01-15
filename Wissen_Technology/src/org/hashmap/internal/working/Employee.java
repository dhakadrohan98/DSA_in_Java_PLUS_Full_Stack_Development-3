package org.hashmap.internal.working;

import java.util.Objects;

public class Employee
{
  private String name;
  
  Employee(String name)
  {
    this.name = name;
  }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Employee)) {
//			return false;
//		}
//		Employee other = (Employee) obj;
//		return Objects.equals(name, other.name);
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
  
 }
