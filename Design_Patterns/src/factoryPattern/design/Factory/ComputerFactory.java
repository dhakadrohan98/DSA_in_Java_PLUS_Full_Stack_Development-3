package factoryPattern.design.Factory;

import factoryPattern.design.model.Computer;
import factoryPattern.design.model.PC;
import factoryPattern.design.model.Server;

public class ComputerFactory {
	//(Computer) Super class in factory design pattern can be an interface, abstract class or 
	//a normal java class
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if("Pc".equalsIgnoreCase(type.trim())) {
			return new PC(ram,hdd,cpu);
		} 
		else if("Server".equalsIgnoreCase(type.trim())) {
			return new Server(ram,hdd,cpu);
		}
		return null;
	}
}
