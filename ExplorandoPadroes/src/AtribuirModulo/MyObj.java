package AtribuirModulo;

public class MyObj {
	Integer num;
	
	public MyObj(Integer num) {
		this.num = num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public String ReturnString() {
		return this.num.toString(); 
	}
}
