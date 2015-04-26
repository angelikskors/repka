package ua.org.oa.angelikskors;

public class GrandMother implements Taker, Voiceable {

	private String name;

	public GrandMother(String name) {

		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r) {
		System.out.println();
		String s = f.getName().concat("ку");
		String s1 = r.getName().replace("а", "у");
		String s2 = f.getName().concat("кa");
		System.out.println(m.getName() + " за " + s);
		System.out.println(s2 + " за " + s1);

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void take() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(GrandFather e, GrandMother m, Granddaugter d) {
		System.out
				.println(d.getName() + " Давай иди сюда! Будем репку тащить!");

	}

	@Override
	public void call(GrandFather e, GrandMother m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Granddaugter d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(GrandFather e, GrandMother m, Granddaugter d, Juchka j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(Juchka j, Cat a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j,
			Granddaugter d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(Cat a, Mouse a2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j,
			Granddaugter d, Cat a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j, Cat a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j,
			Granddaugter d, Cat a, Mouse mo) {
		// TODO Auto-generated method stub

	}
}