package hash;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "길동길동");
		Student s2 = new Student(2, "호의둘리");
		System.out.println(s1.hashCode());
		System.out.println( Objects.hashCode(s2) );
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode()	{
			return Objects.hash(sno, name);
		}
	}
}