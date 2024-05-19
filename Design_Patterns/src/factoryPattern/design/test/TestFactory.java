package factoryPattern.design.test;

import factoryPattern.design.Factory.*;
import factoryPattern.design.model.*;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","4GB", "1TB", "2.4GHz");
		Computer server = ComputerFactory.getComputer("server","16GB", "10TB", "8.4GHz");
		System.out.println("Factory PC config:: "+ pc);
		System.out.println("Factory Server config:: "+ server);
	}
}
