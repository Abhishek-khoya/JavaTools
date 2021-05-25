package com.thinking.machines.util;
public class TMArrayList implements TMList
{
private int collection[];
private int size;
public TMArrayList()
{
this.collection=new int[10];
this.size=0;
}
public void clear()
{
this.size=0;
}
public void removeAll()
{
this.clear();
}
public int size()
{
return this.size;
}
public void add(int data)
{
if(this.size==collection.length)
{
int tmp[]=new int[this.size+10];
for(int e=0;e<this.size;e++)tmp[e]=collection[e];
collection=tmp;
}
this.collection[this.size]=data;
this.size++;
}
public void add(int index,int data)
{
if(index<0||index>=this.size)throw new IndexOutOfBoundsException("Invalid Index "+index);
if(this.size==collection.length)
{
int tmp[]=new int[this.size+10];
for(int e=0;e<this.size;e++)tmp[e]=collection[e];
collection=tmp;
}
for(int e=this.size;e>index;e--)this.collection[e]=this.collection[e-1];
this.collection[index]=data;
this.size++;
}
public void insertAt(int index,int data)
{
add(index,data);
}
public int removeAt(int index)
{
if(index<0||index>=this.size)throw new IndexOutOfBoundsException("Invalid index "+index);
int data=this.collection[index];
for(int e=index;e<this.size;e++)this.collection[e]=this.collection[e+1];
this.size--;
return data;
}
public void update(int index,int data)
{
if(index<0||index>=this.size)throw new IndexOutOfBoundsException("Invalid index "+index);
this.collection[index]=data;
}
public int get(int index)
{
return this.collection[index];
}
public void appendFrom(TMList other)
{
for(int e=0;e<other.size();e++)this.add(other.get(e));
}
public void appendTo(TMList other)
{
for(int e=0;e<this.size();e++)other.add(this.get(e));
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
}