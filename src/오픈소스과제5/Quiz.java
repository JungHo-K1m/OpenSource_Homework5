package 오픈소스과제5;
import java.util.Scanner;

class Person {
	private int n1, n2, n3;
	public String name;
	public Person(String name) {
		this.name = name;
	}
	public boolean game() {
		n1 = (int) ((Math.random()*3)+1);
		n2 = (int) ((Math.random()*3)+1);
		n3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+n1+"  "+n2+"  "+n3+"  ");
		if(n1 == n2 && n2 == n3)
			return true;
		else 
			return false;
	}
}

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = sc.next();
		Person person1 = new Person(name);
		System.out.print("2번째 선수 이름>>");
		name =sc.next();
		Person person2 = new Person(name);
		String buffer = sc.nextLine();
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		sc.close();

	}

}
