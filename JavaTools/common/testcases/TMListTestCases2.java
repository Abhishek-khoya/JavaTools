import com.thinking.machines.util.*;
class Testcase2
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
list1.add(100);
list1.add(200);
list1.add(300);
list1.add(400);
list1.add(500);
list1.add(600);
System.out.println("The size of the list1 is "+list1.size());
System.out.println("Representation of the list");
for(int e=0;e<list1.size();e++)
{
System.out.println(list1.get(e));
}
System.out.println("Logic of addAt or insertAt");
list1.insertAt(3,1000);
System.out.println("After addAt or insertAt method");
for(int e=0;e<list1.size();e++)
{
System.out.println(list1.get(e));
}
System.out.println("Logic of removeAt");
list1.removeAt(5);
System.out.println("After removeAt Method");
for(int e=0;e<list1.size();e++)
{
System.out.println(list1.get(e));
}
System.out.println("Logic of update");
list1.update(2,11111);
System.out.println("After updation");
for(int e=0;e<list1.size();e++)
{
System.out.println(list1.get(e));
}
System.out.println("Logic of removeAll or clearall");
list1.removeAll();
System.out.println("After removeAll or clearall");
for(int e=0;e<list1.size();e++)
{
System.out.println(list1.get(e));
}
}
}