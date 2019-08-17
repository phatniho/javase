package day1802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Ԫע�⣺��ע���ע��
 * @Target ����ע��Ŀ�꣺�ࡢ��������Ա��������������...
 * @Retention ������Χ��Դ�롢�ֽ��롢�������ڴ�
 * 	SOURCEԴ�룺������ֽ���ʱ��������
 * 	CLASS�ֽ��룺�౻���ص��ڴ�ʱ����
 * 	RUNTIME�������ڴ棺���ڴ���Ҳ����
 */

//���ö��Ŀ������
//@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})

@Target(ElementType.METHOD) // ֻע��һ������
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {// ����ע��
	// ���û��Ĭ��ֵ��ʹ��ע��ʱ���ͱ��븳ֵ��
	// ��Ĭ��ֵ�����Բ���ֵ
	int id() default 0;

	String title() default "";
	// �����������value,�����������������ֵʱ�����Բ�дvalue=
	// @Test("sdfas") ������ֵ�����Բ�дvalue=
	// @Test(id = 5, value = "safsd")���ǵ�����ֵ�ͱ���дvalue=
	// @Test(id = 5, title = "safsd")һ�㽨��ʹ���������������滻value����������Ķ�

	// title�ı���
	String value() default "";
}
