package org.design.patterns;

public class Database {
	
	private static Database dbObject;
	
	private Database() {}
	
	public static Database getInstance() {
		
		if(dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;
	}

	@Override
	public String toString() {
		return "Database [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
