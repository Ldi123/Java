package abcd;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Shoping{
String name;
int price;
int count;
public Shoping(String shuming,int danjia,int shuliang) {
	this.name=shuming;
	this.price=danjia;
	this.count=shuliang;
}
	public String toString() {
		
		return name+" "+"����="+price+" "+"����="+count;
	}
}

public class Sum{
	public static int getSum(Map<String, Shoping> mapp,Shoping cc) {
		int sum=0;
		for(Shoping ss:mapp.values()) {
			sum=ss.price*ss.count;
		}
		return sum;
	}
	public static void main(String[] args) {
		String name="";
		int price=0;
		int count=0;
		int sumall=0;
		int i=0;
		Scanner s=new Scanner(System.in);
		Map<String,Shoping> mapp=new HashMap<String,Shoping>();
		for(i=0;i<5;i++) {
		System.out.println("������������");
		name=s.next();
		System.out.println("�����뵥�ۣ�");
		price=s.nextInt();
		System.out.println("�����빺��������");
		count=s.nextInt();
		Shoping cc=new Shoping(name,price,count);
		mapp.put(name,cc);
		System.out.println(mapp);
		Collection<Shoping>vs=mapp.values();
		sumall+=getSum(mapp,new Shoping(name,price,count));
		}
		System.out.println(i+"������ܼ���:"+sumall+"Ԫ");
}
}