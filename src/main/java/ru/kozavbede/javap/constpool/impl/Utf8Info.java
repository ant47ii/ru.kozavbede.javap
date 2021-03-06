package ru.kozavbede.javap.constpool.impl;

import ru.kozavbede.javap.constpool.BaseConstantPoolRow;
import ru.kozavbede.javap.constpool.Tag;

public class Utf8Info extends BaseConstantPoolRow {

	private final String value;

	public Utf8Info(int index, String value) {
		super(index);
		this.value = value;
	}

	@Override
	public Tag getTag() {
		return Tag.UTF8;
	}

	@Override
	public String toString() {
		return value;
	}

	public String getValue() {
		return value;
	}

}
