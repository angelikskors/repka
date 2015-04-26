package ua.org.oa.angelikskors;

public interface Voiceable {
	void call();

	void call(GrandFather e, GrandMother m);

	void call(GrandFather e, GrandMother m, Granddaugter d);

	void call(GrandFather e, GrandMother m, Granddaugter d, Juchka j);

	void call(Juchka j, Cat a);

	void call(Cat a, Mouse a2);

	void take(GrandFather f, GrandMother m, Repka r, Juchka j, Granddaugter d,
			Cat a);
}
