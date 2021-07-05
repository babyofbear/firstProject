package co.yedam.exercise;

public class MyCats {
	public static void main(String[] args) {
		Pet p1 = new Pet();
		p1.setPetId(001);
		p1.setPetType("Munchikin");
		p1.setPetName("먼지");
		p1.setPetBirth("2017");
		
		Pet p2 = new Pet();
		p2.setPetId(002);
		p2.setPetType("ScotishFold");
		p2.setPetName("홍시");
		p2.setPetBirth("2018");
		
		Pet p3 = new Pet();
		p3.setPetId(003);
		p3.setPetType("Ragdoll");
		p3.setPetName("구름");
		p3.setPetBirth("2019");
		
		Pet p4 = new Pet() ;
		p4 = new Pet(004,"BritishShort","톰","2021");
				
		
		Pet[] pets = new Pet[5];
		pets[0] = p1;
		pets[1] = p2;
		pets[2] = p3;
		pets[3] = p4;
		pets[4] = null;
		
		for(int i = 0; i < pets.length; i++) {
			if(pets[i] != null) {
				System.out.println(pets[i].getPetId()+", "+pets[i].getPetType()+", "+pets[i].getPetName()+", "+pets[i].getPetBirth());
				}
			
		}
	}
}
