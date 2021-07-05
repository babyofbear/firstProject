package co.yedam.exercise;

public class Pet {
	private int petId;
	private String petType;
	private String petName;
	private String petBirth;
	
	
	public Pet() {
		
	}
	
	public Pet(int petId, String petType, String petName, String petBirth) {
		super();
		this.petId = petId;
		this.petType = petType;
		this.petName = petName;
		this.petBirth = petBirth;
	}

	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetBirth() {
		return petBirth;
	}
	public void setPetBirth(String petBirth) {
		this.petBirth = petBirth;
	}
	

}
