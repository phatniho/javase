package day04;

/*
 * ����ţ��֯Ů�����16.4����
 * ����299792458��ÿ��
 * ϲȵ��0.46��
 * ţ��֯Ů��ᣬ��Ҫ����ֻϲȵ
 * ������
 * �ȼ���1������ڶ�����
 * �ٸ��ݹ���ֵ���ţ��֯Ů���ܾ���
 * Ȼ�����ܾ������ϲȵ��
 * ������Ľ������ȡ��Math.ceil()//Math.floor()����ȡ��
 * �����ӡ���
 */
public class Test3_NiuLangZhiNv {
	public static void main(String[] args) {
		long y = 299792458l * 60 * 60 * 24 * 365;// ��Ҫ����long�ͼ��㣬����������
		double s = 16.4 * y;
		double m = s / 0.46;
		System.out.println("��Ҫϲȵ������" + (long) (Math.ceil(m)));// ����ȡ����ת��
	}
}
