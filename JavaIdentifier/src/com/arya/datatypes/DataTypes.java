package com.arya.datatypes;

public class DataTypes {
	public static void main(String[] args) {
		ByteDataType();
		FloatDataType();
		DoubleDataType();
		LongDataType();
		ShortDataType();
		IntegerDataType();
		CharDataType();
		
	}
	public static void ByteDataType () {
		byte byteMaxVariable = Byte.MAX_VALUE;
		byte byteMinVariable = Byte.MIN_VALUE;
		System.out.println("Byte Max:"
				+ byteMaxVariable
				+ " Min:"
				+ byteMinVariable
				);
	}
	public static void LongDataType () {
		Long longMaxVariable = Long.MAX_VALUE;
		Long longMinVariable = Long.MIN_VALUE;
		System.out.println("Long Max:"
				+ longMaxVariable
				+ " Min:"
				+ longMinVariable
				);
	}
	public static void ShortDataType () {
		Short ShortMaxVariable = Short.MAX_VALUE;
		Short ShortMinVariable = Short.MIN_VALUE;
		System.out.println("Short Max:"
				+ ShortMaxVariable
				+ " Min:"
				+ ShortMinVariable
				);
	}
	public static void IntegerDataType () {
		Integer IntegerMaxVariable = Integer.MAX_VALUE;
		Integer IntegerMinVariable = Integer.MIN_VALUE;
		System.out.println("Integer Max:"
				+ IntegerMaxVariable
				+ " Min:"
				+ IntegerMinVariable
				);
	}
	public static void FloatDataType () {
		Float floatMaxVariable = Float.MAX_VALUE;
		Float floatMinVariable = Float.MIN_VALUE;
		System.out.println("Float Max:"
				+ floatMaxVariable
				+ " Min:"
				+ floatMinVariable
				);
	}
	public static void DoubleDataType () {
		Double doubleMaxVariable = Double.MAX_VALUE;
		Double doubleMinVariable = Double.MIN_VALUE;
		System.out.println("Double Max:"
				+ doubleMaxVariable
				+ " Min:"
				+ doubleMinVariable
				);
	}
	public static void CharDataType() {
		char ch = 'A';
		System.out.println(ch);
		
		ch = '\ubbbb';
		System.out.println(ch);
		
		ch = 65;
		System.out.println(ch);
		
	}
	static void booleanDataType() {
		boolean isValid = true;
		if(isValid)
			System.out.println("True");
	}

}
