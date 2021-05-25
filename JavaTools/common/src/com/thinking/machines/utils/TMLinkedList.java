package com.thinking.machines.util;
public class TMLinkedList implements TMList
{
class TMNode
{
public int data;
public TMNode next;
public TMNode()
{
this.data=0;
this.next=null;
}
}
private TMNode start,end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
}
public void add(int data)
{
TMNode t=new TMNode();
t.data=data;
if(this.start==null)
{
this.start=this.end=t;
return;
}
this.end.next=t;
this.end=t;
this.size++;
}
public void add(int index,int data)
{
if(index<0)throw new IndexOutOfBoundsException("Invalid index");
if(index>=this.size)
{
add(data);
return;
}
TMNode t=new TMNode();
t.data=data;
if(index==0)
{
t.next=this.start;
this.start=t;
}
else
{
TMNode j,k;
k=null;
j=this.start;
for(int e=0;e<index;e++)
{
k=j;
j=j.next;
}
k.next=t;
t.next=j;
}
this.size++;
}
public void insertAt(int index,int data)
{
add(index,data);
}
public int removeAt(int index)
{
if(index<0||index>=this.size)throw new ArrayIndexOutOfBoundsException("Can not remove");
int data;
if(index==0)
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode i,j;
j=this.start;
i=null;
for(int e=0;e<index;e++)
{
i=j;
j=j.next;
}
data=j.data;
i.next=j.next;
this.size--;
return data;
}
public void removeAll()
{
this.start=null;
this.end=null;
this.size=0;
}
public void clear()
{
removeAll();
}
public int size()
{
return this.size;
}
public int get(int index)
{
if(index<0||index>=this.size)throw new ArrayIndexOutOfBoundsException("Invalid index");
if(index==0)
{
return this.start.data;
}
TMNode j;
j=start;
for(int e=0;e<index;e++)
{
j=j.next;
}
return j.data;
}
public void update(int index,int data)
{
if(index<0||index>=this.size)throw new ArrayIndexOutOfBoundsException("Invalid Index");
if(index==0)
{
this.start.data=data;
return;
}
TMNode j;
j=start;
for(int e=0;e<index;e++)
{
j=j.next;
}
j.data=data;
}
public void copyTo(TMList other)
{
other.clear();
for(int e=0;e<this.size();e++)other.add(this.get(e));
}
public void copyFrom(TMList other)
{
this.clear();
for(int e=0;e<other.size();e++)this.add(other.get(e));
}
public void appendTo(TMList other)
{
for(int e=0;e<this.size();e++)other.add(this.get(e));
}
public void appendFrom(TMList other)
{
for(int e=0;e<other.size();e++)this.add(other.get(e));
}
}