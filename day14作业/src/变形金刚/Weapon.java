package ±äÐÎ½ð¸Õ;

public abstract class Weapon {
	public static final int TYPE_COLD = 0;
	public static final int TYPE_HOT = 1;
	public static final int TYPE_NUCLEAR = 2;

	public abstract void kill();

	public abstract String getName();

	public abstract int getType();
}
