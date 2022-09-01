//class 자식클래스 extends 부모클래스 {
//	필드, 생성자, 메서드 }

package how;
class Hoegaarden extends Get {
	String type;
	String model;
	
	//생성자 (객체 값 세팅하기)
	public Beer(String type, String model) {	 	 
		this.type = type;
		this.model = model;
	}
	
	public void drink() {
		System.out.println("마십니다.");
	}
	
	public void mix() {
		System.out.println("섞습니다.");
	}
	
	public String getType() {
		return type;
	}
	
	public String getModel() {
		return model;
	}
}
