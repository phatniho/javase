package day1202;

/*
 * �ӿڣ����˵ĳ����࣬�ڲ�ȫ�ǳ��󷽷�
 * ��interface������class�ؼ���
 * ��implements������extends�ؼ���
 * �ӿ���ֻ�ܶ��幫���ĳ��󷽷�
 * �����ĳ���
 * �������ڲ��ࡢ�ڲ��ӿ�
 * �����ͬʱ�̳ж���ӿ�
 * �ӿڿ��Լ̳нӿڣ�ʹ��extends�ؼ��֣����Լ̳ж��
 */
public interface Weapon {
	// �ӿ��ж��峣������ʡ��ǰ�����ؼ���
	// public static final
	int TYPE_COLD = 0;
	int TYPE_HOT = 1;
	int TYPE_NUCLEAR = 2;

	// �ӿ��еĳ��󷽷������ǹ����ģ��ӿ���ǰ�����ؼ��ֿ���ʡ�Բ�д
	// public abstract
	void kill();

	String getName();

	int getType();
}
