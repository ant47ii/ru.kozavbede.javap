package ru.kozavbede.javap.attributes.impl;

import ru.kozavbede.javap.attributes.BaseAttribute;
import ru.kozavbede.javap.attributes.IAttribute;

public class ConstantAttribute extends BaseAttribute {

	private final int constantValueIndex;

	// TODO: это не IAttribute должен быть, переделать после остальных реализаций
	// атрибутов
	public ConstantAttribute(IAttribute base, int constantValueIndex) {
		super(base.getAttributeNameIndex(), base.getType());
		this.constantValueIndex = constantValueIndex;
	}

	public int getConstantValueIndex() {
		return constantValueIndex;
	}

}
