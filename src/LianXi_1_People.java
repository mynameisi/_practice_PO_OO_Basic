
public class LianXi_1_People {
	public static void main(String[] args){
		//1. 声明一个人类的变量 zs，使得他的姓名是"张三"，性别是"男"，身高是"1.75米"
		
		//2. 调用方法实现打印：张三睡板床
		
		//3. 调用方法实现打印：张三吃大米
	}
}


/**
 * People类
 * @author Administrator
 *
 */
class People{
	String name;//姓名
	String gender;//性别
	String height;//身高
	
	void eat(String food){
		System.out.println(name+"吃"+food);
	}
	void sleep(String bed){
		System.out.println(name+"睡"+bed);
	}
}
