package co.yedam.api;

class Student implements Comparable<Student> {
	String sno;
	String name;
	int grade;

	Student(Student sno, int grade) {
		this.sno = sno;
		this.grade;
	}

	@Override
	public int compareTo(Student o) {
		this.sno.compareTo(o.sno); // -1(음의값) a compare to b => 오름차순 순서가 맞다.
									// 1(양의값) a compare to b => 오름차순 순서가 틀리다.
		// return 0;
	}
}

class StudentComparator implememts comparator<Student>
{

	}

	@Override
	public int compare(Student o1, Studento2) {
		return o1.grade - o2.grade ;
	}


public class ObjectsExample {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 20;
		Student s1 = new Student("a001",1);
		Student s2 = new Student("a002",2);
		Student s3 = new Student("a003",3);
		
		int result = Objects.compare(s1, s2, null); //1.class 2.claa 3.interface(비교)
		System.out.println(result);
		
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.println(ts.first().sno);
		
	}
}
