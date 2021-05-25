package com.thinking.machines.collections;
public class TMLinkedList
{ 
class Node
{
public int data;
public Node next;
public Node previous;
}
private Node start;
private Node end;
private int size;
public void add(int data)
{
Node node=new Node();
node.data=data;
if(this.start==null)
{ 
this.start=this.end=node;
} 
else
{ 
this.end.next=node;
node.previous=this.end;
this.end=node;
} 
this.size++;
}
public void add(int index,int data)
{
if(index<0 || index>size)
{ 
throw new ArrayIndexOutOfBoundsException("Invalid index :"+index);
} 
if(index==size)
{ 
add(data);
return;
} 
int x=0;
Node node=this.start;
while(x<index)
{
node=node.next;
x++;
}
Node chch=new Node();
chch.data=data;
if(this.start==node)
{ 
chch.next=this.start;
this.start.previous=chch;
this.start=chch;
} 
else
{ 
chch.next=node;
chch.previous=node.previous;
node.previous.next=chch;
node.previous=chch;
} 
this.size++;
}
public int size()
{
return this.size;
}
public int get(int index)
{ 
if(index<0 || index>=size)
{ 
throw new ArrayIndexOutOfBoundsException("Invalid index :"+index);
}
Node node;
int x;
node=this.start;
x=0;
while(x<index)
{
node=node.next;
x++;
}
return node.data;
}
public int remove(int index)
{ 
if(index<0 || index>=size) throw new ArrayIndexOutOfBoundsException("Invalid index : "+index);
int x;
Node p1;
p1=this.start;
x=0;
while(x<index)
{
p1=p1.next;
x++;
} 
if(this.start==this.end) // only one node
{ 
this.start=this.end=null;
}
else if(this.start==p1) // many but first
{ 
this.start=this.start.next;
this.start.previous=null;
}
else if(this.end==p1) // many but last
{ 
this.end=this.end.previous;
this.end.next=null;
} 
else // neither first nor last
{
p1.previous.next=p1.next;
p1.next.previous=p1.previous;
} 
this.size--;
int data=p1.data;
return data;
}
public void clear()
{ 
this.start=this.end=null;
this.size=0;
}
public Iterator iterator(DIRECTION direction)
{
Iterator iterator=new Iterator();
iterator.direction=direction;
if(direction==TOP_TO_BOTTOM) iterator.node=this.start;
else iterator.node=this.end;
return iterator;
}
private enum DIRECTION{TOP_TO_BOTTOM,BOTTOM_TO_TOP};
public final static DIRECTION TOP_TO_BOTTOM=DIRECTION.TOP_TO_BOTTOM;
public final static DIRECTION BOTTOM_TO_TOP=DIRECTION.BOTTOM_TO_TOP;
public class Iterator
{
private Node node;
private DIRECTION direction;
public boolean hasNext()
{
return node!=null;
}
public int next()
{ 
int data;
if(node==null) throw new RuntimeException("No more elements");
data=node.data;
if(this.direction==TOP_TO_BOTTOM)
{
node=node.next;
} 
if(this.direction==BOTTOM_TO_TOP)
{
node=node.previous;
}
return data;
}
}
public interface ElementProcessor
{
public void process(int data);
}
public void forEach(ElementProcessor elementProcessor)
{
Node node;
for(node=this.start;node!=null;node=node.next)
{ 
elementProcessor.process(node.data);
}
}
public void reverseForEach(ElementProcessor elementProcessor)
{
Node node;
for(node=this.end;node!=null;node=node.previous)
{ 
elementProcessor.process(node.data);
}
}
public interface Filter
{
public boolean considerIt(int data);
}
public TMLinkedList filter(Filter filter)
{
TMLinkedList list=new TMLinkedList();
for(Node node=this.start;node!=null;node=node.next)
{ 
if(filter.considerIt(node.data))
{ 
list.add(node.data);
}
}
return list;
} 
interface Comparator
{
public int compare(int left,int right);
}
public TMLinkedList sort(Comparator comparator)
{ 
if(this.size==0) return new TMLinkedList();
TMLinkedList stack1lb,stack1ub,stack2lb,stack2ub;
stack1lb=new TMLinkedList();
stack1ub=new TMLinkedList();
stack2lb=new TMLinkedList();
stack2ub=new TMLinkedList();
// initially push lb,ub on stack1
stack1lb.add(0,0);
stack1ub.add(0,this.size-1);
int a,b;
while(stack1lb.size()>0)
{
a=stack1ub.remove(0);
b=stack1ub.remove(0);
// push on stack2
//compute mid;
}
while(stack2lb.size()>0)
{
//pop;
//compute mid;
//merge;
}
}
}