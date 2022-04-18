public class MyNestedClass {
	int a=10;
	class inner
	{
		public void show()
		{
			System.out.println("Inner Class Function and the values of a is "+a);
		}
	}
	public static void main(String[] args) {		
		MyNestedClass ob = new MyNestedClass();
		MyNestedClass.inner obIn = ob.new inner();
		obIn.show();
	}
}