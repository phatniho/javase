package day0601;

/*
 * �����½�����ʿ������
 * ����ʿ�������е�ǰ������
 * ����ʿ�������еĹ�������
 */
public class Test1 {
	public static void main(String[] args) {
		Soldier s1 = new Soldier(9527, 100);// ����ָ��ֵ����������
		Soldier s2 = new Soldier(9528, 100);

		s1.go();// ����ǰ������
		s2.go();
		int count = 0;// ���幥������ͳ��
		for (int i = 0;; i++) {// ѭ������
			if (s2.blood == 0) {// �ж�Ѫ���Ƿ�Ϊ0
				System.out.println(s2.id + "���ˣ�");// ��ʾ����
				break;// ���Ѫ��Ϊ0����ֹͣ����
			}
			s2.attack();// ���ù�������
			count++;// ������������
		}
		System.out.println(s2.id + "��ʿ��������" + count + "�ν���");// ͳ�Ʒ����˶��ٴι���
	}
}
