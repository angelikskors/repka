package ua.org.oa.angelikskors;

import java.util.ArrayList;

public class Repka {
	private String name;

	int gravity = 5;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Repka(String name) {
		setName(name);
	}

	public void beingGrownUp() {
		System.out.println("������� ����� ������, ������, �������-����������.");
	}

	public void beingtaken() {
		System.out.println(" � �������� ����� ");

	}
}
