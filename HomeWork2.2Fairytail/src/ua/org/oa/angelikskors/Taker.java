package ua.org.oa.angelikskors;

public interface Taker {
	int force = 1;

	void take();

	void take(GrandFather f, GrandMother m, Repka r);

	void take(GrandFather f, GrandMother m, Repka r, Granddaugter d);

	void take(GrandFather f, GrandMother m, Repka r, Juchka j);

	void take(GrandFather f, GrandMother m, Repka r, Juchka j, Granddaugter d);

	void take(GrandFather f, GrandMother m, Repka r, Juchka j, Granddaugter d,
			Cat a);

	void take(GrandFather f, GrandMother m, Repka r, Juchka j, Cat a);

	void take(GrandFather f, GrandMother m, Repka r, Juchka j, Granddaugter d,
			Cat a, Mouse mo);

}
