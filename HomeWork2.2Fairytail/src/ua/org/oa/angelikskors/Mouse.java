package ua.org.oa.angelikskors;

public class Mouse implements Taker, Voiceable {

	private String name;

	public Mouse(String name) {

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

	}

	@Override
	public void call(Juchka j, Cat a) {
		String s = a.getName().replace("�", "�");
		System.out.println("������� " + j.getName() + " " + s);

	}

	@Override
	public void take() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(GrandFather e, GrandMother m) {
		System.out
				.println(m.getName() + " ����� ��� ����! ����� ����� ������!");

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(GrandFather e, GrandMother m, Granddaugter d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(GrandFather e, GrandMother m, Granddaugter d, Juchka j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r) {
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
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j,
			Granddaugter d, Cat a, Mouse mo) {
		System.out.println();
		String s = f.getName().concat("��");
		String s1 = r.getName().replace("�", "�");
		String s2 = f.getName().concat("�a");
		String s3 = m.getName().substring(0, 4).concat("y");
		String s4 = d.getName().replace("�", "�");
		String s5 = j.getName().replace("�", "�");
		String s6 = a.getName().replace("�", "�");
		System.out.println(mo.getName() + " �� " + s6);
		System.out.println(a.getName() + " �� " + s5);
		System.out.println(j.getName() + " �� " + s4);
		System.out.println(d.getName() + " �� " + s3);
		System.out.println(m.getName() + " �� " + s);
		System.out.println(s2 + " �� " + s1);

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j, Cat a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void take(GrandFather f, GrandMother m, Repka r, Juchka j,
			Granddaugter d, Cat a) {
		// TODO Auto-generated method stub

	}
}
