package day0602;

/*
 * �����½�����ʿ������
 * ����ʿ�������е�ǰ������
 * ����ʿ�������еĹ�������
 */
public class Test1 {
	public static void main(String[] args) {
		Soldier s1 = new Soldier(9527, 100);// ����ָ�������½�ʿ������
		Soldier s2 = new Soldier(9528, 100);

		s1.go();// ָ��ʿ������ǰ��
		s2.go();
		int count = 1;// ���幥������������
		for (int i = 0;; i++) {// ѭ������
			if (s2.blood == 0) {// �ж��Ƿ���
				break;// �����������ѭ��
			}
			s2.attack();// ѭ������
			count++;// ��������1
		}
		System.out.println(s2.id + "��ʿ��������" + count + "�ν���");// ��ӡ���
	}
}
