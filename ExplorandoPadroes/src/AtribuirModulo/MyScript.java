package AtribuirModulo;

public class MyScript {
	public static void main(String[] args) {
		MyObj ObjA = new MyObj(1);
		MyObj ObjB = ObjA;
		
		int intA = 5;
		int intB = intA;
		
		System.out.println("intA = " + intA + "\nintB = " + intB);
		intA = 2;
		System.out.println("intA = " + intA + "\nintB = " + intB);
		
		System.out.println("A = " + ObjA.ReturnString() + "\nB = " + ObjB.ReturnString());
		ObjA.setNum(2);
		System.out.println("A = " + ObjA.ReturnString() + "\nB = " + ObjB.ReturnString());
	}
}
