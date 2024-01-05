package Member.TestExample;

class Data {int x;}

class ReferenceReturnEx{
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;	//d생성자에 x 10이라고 넣어줌
		
		Data d2 = copy(d);
		System.out.println("d.x= " +d.x);
		System.out.println("d2.x=" +d2.x);
	}
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
}