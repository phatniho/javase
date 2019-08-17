package day12;

public interface Weapon {
	int TYPE_COLD = 0;
	int TYPE_HOT = 1;
	int TYPE_NUCLEAR = 2;

	void kill();

	String getName();

	int getType();
}
