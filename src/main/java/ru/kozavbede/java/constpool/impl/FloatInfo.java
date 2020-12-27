package ru.kozavbede.java.constpool.impl;

import ru.kozavbede.java.constpool.BaseInfo;
import ru.kozavbede.java.constpool.Tag;

public class FloatInfo extends BaseInfo {

	private final float value;

	public FloatInfo(int index, float value) {
		super(index);
		this.value = value;
	}

	@Override
	public Tag getTag() {
		return Tag.FLOAT;
	}

	@Override
	public String toString() {
		return Float.toString(value) + "f";
	}

	public float getValue() {
		return value;
	}

}