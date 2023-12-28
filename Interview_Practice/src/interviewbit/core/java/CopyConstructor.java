package interviewbit.core.java;

public class CopyConstructor {

		private String departments;
		private String service;
		
		
		
		public CopyConstructor() {
			super();
		}

		public CopyConstructor(CopyConstructor ib) {
			this.departments = ib.departments;
			this.service = ib.service;
		}
		
		@Override
		public String toString() {
			return "InterviewBit [departments=" + departments + ", service=" + service + "]";
		}

		public static void main (String[] args) {
			CopyConstructor intr = new CopyConstructor();
			intr.departments = "CSE";
			intr.service = "developer";
			CopyConstructor obj = new CopyConstructor(intr);
			System.out.println(obj);
			
		}
		//Main methods overloading
		 public static void main(char[] args){
		        System.out.println("Overloaded Character array Main Method");
		    }
		    public static void main(double[] args){
		        System.out.println("Overloaded Double array Main Method");
		    }
		    public static void main(float args){
		        System.out.println("Overloaded float Main Method");
		    }


}
