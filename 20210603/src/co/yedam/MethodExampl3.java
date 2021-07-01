package co.yedam;

public class MethodExampl3 {

	public static void main(String[] args) {
		Student s1 = new Student("최예원", 1, 80, 85);
		Student s2 = new Student("김지연", 2, 70, 77);

		Student[] javaClass = { s1, s2, new Student("최유리", 2, 72, 75) };

		for (int i = 0; i < javaClass.length; i++) {
			if (javaClass[i].getGrade() == 2) {
				System.out.println(javaClass[i].getName() + "," //
						+ javaClass[i].getGrade() + ","//
						+ javaClass[i].getEngscr() + ","//
						+ javaClass[i].getMathscr());
			}
		}

				s1.setName("최예원");
				s1.setGrade(1);
				s1.setEngscr(80);
				s1.setMathscr(85);

				System.out.println(s1.getName() + "." + s1.getGrade() + "." + s1.getEngscr() + "." + s1.getMathscr());

	}

}
