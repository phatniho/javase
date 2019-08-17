package day1403;

/*
 * 
 */
public class MyList {
	// 首尾节点
	private Node first;// null
	private Node last;// null
	private int size;// 数据的数量，默认0

	public void add(Object value) {
		// 如果添加的是第一个节点
		// 添加第一个
		Node n = new Node();
		n.value = value;// 为变量赋值
		if (size == 0) {// 如果没有数据
			// 将变量前后引用为自己
			n.prev = n;
			n.next = n;
			// 将对象节点设置为链表最前和最后
			first = n;
			last = n;
		} else {
			// 在尾部新加数据
			n.prev = last;// 将尾部引用赋值给新增元素的向前引用
			last.next = n;// 将n的值设为尾部向后的引用
			n.next = first;// 将头部引用赋值给新增元素的向后引用
			first.prev = n;// 将n的值设为头部向前的引用
			last = n;// 将n设为新的尾部值
		}
		size++;// 添加完成后数据量自增
	}

	public Object get(int i) {
		// 越界
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("" + i);// 抛出角标越界异常
		}
		// 访问i位置的节点对象
		Node n = getNode(i);
		// 返回节点中封装的数据
		return n.value;
	}

	private Node getNode(int i) {
		if (i == 0) {// 如果找的是第一个位置
			return first;// 直接返回首位置的值
		} else if (i == size - 1) {// 如果找的是末尾位置
			return last;// 直接返回尾位置的值
		}
		// 计算中间位置的下标
		// 判断要找的值与中间角标的大小关系，小于则从前往后，大于则从后往前
		if (i < size >> 1) {
			Node n = first;// 从前往后找
			// 从下标1到下标i
			for (int j = 1; j <= i; j++) {// 循环遍历，起点为第二个位置，一直找到i位置
				n = n.next;// 循环往后找
			}
			return n;// 返回结果
		} else {
			Node n = last;// 从后向前找
			for (int j = size - 2; j >= i; j--) {// 循环遍历，起点为倒数第二位置
				n = n.prev;// 循环向前找
			}
			return n;// 返回结果
		}
	}

	public int size() {
		return size;
	}

	// 内部类，辅助双向链表，封装局部的数据：保存的值，前后的引用
	private class Node {
		Node prev;// 向前引用
		Node next;// 向后引用
		Object value;// 值
	}
}
