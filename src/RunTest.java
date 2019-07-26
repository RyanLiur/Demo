import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import object.Book;
import object.HashMapTest;

public class RunTest {

	public static void main(String[] args) {
		// 数组去重
		distinctList();
		// hashcode输出
        hashMap();
	}
	
	/**
	 * 通过重写equal跟hashcode两个方法，数组去重
	 */
	private static void distinctList() {
		List<Book> list = new ArrayList<>();
        {
           list.add(new Book("Core Java", 200));
           list.add(new Book("Core Java", 200));
           list.add(new Book("Learning Freemarker", 150));        	
           list.add(new Book("Spring MVC", 300));
           list.add(new Book("Spring MVC", 300));
        }
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct books:"+l);
        list.stream().distinct().forEach(b -> System.out.println(b.getName()+ "," + b.getPrice()));
	}
	
	/**
	 * 输出实例hashcode值
	 */
	private static void hashMap() {
        Map<HashMapTest, Integer> map = new HashMap<HashMapTest, Integer>();
        HashMapTest instance = new HashMapTest(1);
        System.out.println("instance.hashcode:" + instance.hashCode());
        HashMapTest newInstance = new HashMapTest(1);
        System.out.println("newInstance.hashcode:" + newInstance.hashCode());
        map.put(instance, 1);
        map.put(newInstance, 2);
        Integer value = map.get(instance);
        System.out.println("instance value:"+value);
        Integer value1 = map.get(newInstance);
        System.out.println("newInstance value:"+value1);
	}

}
