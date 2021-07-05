package co.yedam.exercise;

import co.yedam.pilates.Gender;
import co.yedam.pilates.Member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1 = new Member(101, "Hong", "01012345678", "0101", Gender.MEN);
		System.out.println(m1.getMemberId());
		m1 = new Member(101, "Hwang", "101010101");
		System.out.println(m1.getMemberId()+","+m1.getMemberName()+","+m1.getMemberPhone());
	}
}
