package j22;

public class Stringed_Instrument extends instrument{
	String numberofstrings;

	@Override
	void play() {
		// TODO Auto-generated method stub
		numberofstrings = "3";
		super.name="Violin";
		System.out.println("Playing "+numberofstrings+" Strings");
		System.out.println("Playing "+name);
		
	}

}
