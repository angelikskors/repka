package ua.org.oa.angelikskors;

import java.util.ArrayList;
import java.util.Iterator;

public class Garden {
	public static void main(String[] args) {
		GrandFather dfs = new GrandFather("Дед");
		GrandMother sf = new GrandMother("Бабка");
		Repka ff = new Repka("Репка");
		Granddaugter ds = new Granddaugter("Внучка");
		Juchka jh = new Juchka("Жучка ");
		Cat a = new Cat("Кошка");
		Mouse m = new Mouse("Мышка");
		dfs.grow();
		ff.beingGrownUp();
		Garden.collect(dfs, sf, ff, ds, jh, a, m);
		System.out.println("Вот и сказочке конец, а кто слушал - молодец!");
	}

	public static void collect(GrandFather f, GrandMother m, Repka c,
			Granddaugter s, Juchka j, Cat a, Mouse mo) {
		if (f.force < c.gravity) {
			System.out.println("Tянет-потянет, вытянуть не может.");
		}
		f.call(f, m);
		f.take(f, m, c);
		if (f.force + m.force < c.gravity) {
			System.out.println("Тянут-потянут, вытянуть не могут.");
		}
		m.call(f, m, s);
		s.take(f, m, c, s);
		if (f.force + m.force + s.force < c.gravity) {
			System.out.println("Тянут-потянут, вытянуть не могут.");
		}
		s.call(f, m, s, j);
		j.take(f, m, c, j, s);
		if (f.force + m.force + s.force + j.force < c.gravity) {
			System.out.println("Тянут-потянут, вытянуть не могут.");
		}
		j.call(j, a);
		a.take(f, m, c, j, s, a);
		if (f.force + m.force + s.force + j.force + a.force < c.gravity) {
			System.out.println("Тянут-потянут, вытянуть не могут.");
		}
		a.call(a, mo);
		mo.take(f, m, c, j, s, a, mo);
		if (f.force + m.force + s.force + j.force + a.force + mo.force < c.gravity) {
			System.out.println("Тянут-потянут, вытянуть не могут.");
		} else {
			System.out.print("Тянут-потянут");
			c.beingtaken();
		}
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
