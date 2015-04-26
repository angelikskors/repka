package ua.org.oa.angelikskors;

public class Granddaugter implements Taker, Voiceable {

	private String name;

	public Granddaugter(String name) {

		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Granddaugter d) {
		System.out.println();
		String s = f.getName().concat("ку");
		String s1 = r.getName().replace("а", "у");
		String s2 = f.getName().concat("кa");
		String s3 = m.getName().substring(0, 4).concat("y");
		System.out.println(d.getName() + " за " + s3);
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
	public void call(GrandFather e, GrandMother m) {
		System.out
				.println(m.getName() + " Давай иди сюда! Будем репку тащить!");

	}

	@Override
	public void call(GrandFather e, GrandMother m, Granddaugter d, Juchka j) {
		String s = j.getName().replace("а", "у");
		System.out.println("Позвала " + d.getName() + " " + s);

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(GrandFather e, GrandMother m, Granddaugter d) {
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
