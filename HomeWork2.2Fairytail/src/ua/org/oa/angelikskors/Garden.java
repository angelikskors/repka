package ua.org.oa.angelikskors;

import java.util.ArrayList;
import java.util.Iterator;

public class Garden {
	public static void main(String[] args) {
		GrandFather dfs = new GrandFather("���");
		GrandMother sf = new GrandMother("�����");
		Repka ff = new Repka("�����");
		Granddaugter ds = new Granddaugter("������");
		Juchka jh = new Juchka("����� ");
		Cat a = new Cat("�����");
		Mouse m = new Mouse("�����");
		dfs.grow();
		ff.beingGrownUp();
		Garden.collect(dfs, sf, ff, ds, jh, a, m);
		System.out.println("��� � �������� �����, � ��� ������ - �������!");
	}

	public static void collect(GrandFather f, GrandMother m, Repka c,
			Granddaugter s, Juchka j, Cat a, Mouse mo) {
		if (f.force < c.gravity) {
			System.out.println("T����-�������, �������� �� �����.");
		}
		f.call(f, m);
		f.take(f, m, c);
		if (f.force + m.force < c.gravity) {
			System.out.println("�����-�������, �������� �� �����.");
		}
		m.call(f, m, s);
		s.take(f, m, c, s);
		if (f.force + m.force + s.force < c.gravity) {
			System.out.println("�����-�������, �������� �� �����.");
		}
		s.call(f, m, s, j);
		j.take(f, m, c, j, s);
		if (f.force + m.force + s.force + j.force < c.gravity) {
			System.out.println("�����-�������, �������� �� �����.");
		}
		j.call(j, a);
		a.take(f, m, c, j, s, a);
		if (f.force + m.force + s.force + j.force + a.force < c.gravity) {
			System.out.println("�����-�������, �������� �� �����.");
		}
		a.call(a, mo);
		mo.take(f, m, c, j, s, a, mo);
		if (f.force + m.force + s.force + j.force + a.force + mo.force < c.gravity) {
			System.out.println("�����-�������, �������� �� �����.");
		} else {
			System.out.print("�����-�������");
			c.beingtaken();
		}
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
