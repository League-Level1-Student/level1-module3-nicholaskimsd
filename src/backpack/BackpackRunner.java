package backpack;

public class BackpackRunner {
	

	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Backpack hi    = new Backpack();
		Pencil bye = new Pencil();
		Ruler joe = new Ruler();
		Textbook go = new Textbook();
		hi.putInBackpack(bye);
		hi.putInBackpack(joe);
		hi.putInBackpack(go);
		hi.packAndCheck();
		hi.goToSchool();
	}
}
