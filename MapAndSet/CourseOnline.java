import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CourseOnline {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com quantos alunos tem o curso A");
		Integer n = sc.nextInt();
		System.out.println("Entre com id dos alunos do curso A:");
		List<Integer> a = new ArrayList<>();
		for (int i =1 ; i <= n; i++) {
			Integer id = sc.nextInt();
			a.add(id);
		}
		List<Integer> b = new ArrayList<>();
		System.out.println("Entre com quantos alunos tem o curso B");
		Integer n1 = sc.nextInt();
		System.out.println("Entre com id dos alunos do curso B:");
		for(int i = 1 ; i <= n1; i++) {
			Integer id = sc.nextInt();
			b.add(id);	
		}
		List<Integer> c = new ArrayList<>();
		System.out.println("Entre com quantos alunos tem o curso C");
		Integer n2 = sc.nextInt();
		System.out.println("Entre com id dos alunos do curso C:");
		for(int i = 1 ; i <= n2; i++) {
			Integer id = sc.nextInt();
			c.add(id);	
		}
		
		Set<Integer> d = new TreeSet<>(a);
		d.addAll(b);
		d.addAll(c);
		
		System.out.println("Total de alunos: "+ d.size());
		
		
		sc.close();
		
	}

}
