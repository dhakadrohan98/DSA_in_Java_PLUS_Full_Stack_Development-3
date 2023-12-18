package org.codeship.design.factory;

import org.codeship.design.model.*;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if("PC".equalsIgnoreCase(type.trim())) {
			return new PC(ram,hdd,cpu);
		} 
		else if("Server".equalsIgnoreCase(type.trim())) {
			return new Server(ram,hdd,cpu);
		}
		return null;
	}
}
