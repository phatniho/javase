package day1802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 元注解：对注解的注解
 * @Target 设置注解目标：类、方法、成员变量、参数类型...
 * @Retention 保留范围：源码、字节码、运行期内存
 * 	SOURCE源码：编译成字节码时，被丢弃
 * 	CLASS字节码：类被加载到内存时丢弃
 * 	RUNTIME运行期内存：在内存中也保留
 */

//设置多个目标类型
//@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})

@Target(ElementType.METHOD) // 只注解一个类型
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {// 定义注解
	// 如果没有默认值，使用注解时，就必须赋值。
	// 有默认值，可以不赋值
	int id() default 0;

	String title() default "";
	// 特殊的属性名value,有特殊待遇，单独赋值时，可以不写value=
	// @Test("sdfas") 单独赋值，可以不写value=
	// @Test(id = 5, value = "safsd")不是单个赋值就必须写value=
	// @Test(id = 5, title = "safsd")一般建议使用其他变量名来替换value，方便代码阅读

	// title的别名
	String value() default "";
}
