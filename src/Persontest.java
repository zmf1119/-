
public class Persontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Person person = new Person();
			person.age = 40;
			person.isMarried =true; 
			person.name = "김영섭";
			person.numberOfchildren = 3;
			
			System.out.println("나이 : " +person.age);
			System.out.println("결혼여부 : " +person.isMarried);
			System.out.println("이름 : " +person.name);
			System.out.println("자녀 수  : " +person.numberOfchildren);
	}

}
