package com.thinking.machines.utils;
import java.io.*;
public class Keyboard
{
  private static BufferedReader bufferedReader;
  static
  {
    bufferedReader=new BufferedReader(new InputStreamReader(System.in));
  }
  private Keyboard()
  {
  }
  public static char getCharacter()
  {
    char m=0;
    try
    {
      m=(char)bufferedReader.read();
      while(bufferedReader.ready()) bufferedReader.read();
    }catch(IOException ioException)
    {
    }
    return m;
  }
  public static char getCharacter(String message)
  {
    System.out.print(message);
    return getCharacter();
  }
  public static String getString()
  {
    String m="";
    try
    {
      m=bufferedReader.readLine();
    }catch(IOException ioException)
    {
    }
    return m;
  }
  public static String getString(String message)
  {
    System.out.print(message);
    return getString();
  }
  public static long getLong()
  {
    long l=0;
    try
    {
      l=Long.parseLong(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return l;
  }
  public static long getLong(String message)
  {
    System.out.print(message);
    return getLong();
  }
  public static int getInt()
  {
    int i=0;
    try
    {
      i=Integer.parseInt(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return i;
  }
  public static int getInt(String message)
  {
    System.out.print(message);
    return getInt();
  }
  public static short getShort()
  {
    short i=0;
    try
    {
      i=Short.parseShort(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return i;
  }
  public static short getShort(String message)
  {
    System.out.print(message);
    return getShort();
  }
  public static byte getByte()
  {
    byte i=0;
    try
    {
      i=Byte.parseByte(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return i;
  }
  public static byte getByte(String message)
  {
    System.out.print(message);
    return getByte();
  }
  public static double getDouble()
  {
    double i=0.0;
    try
    {
      i=Double.parseDouble(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return i;
  }
  public static double getDouble(String message)
  {
    System.out.print(message);
    return getDouble();
  }
  public static float getFloat()
  {
    float i=0.0f;
    try
    {
      i=Float.parseFloat(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return i;
  }
  public static float getFloat(String message)
  {
    System.out.print(message);
    return getFloat();
  }
  public static boolean getBoolean()
  {
    boolean i=false;
    try
    {
      i=Boolean.parseBoolean(getString());
    }catch(NumberFormatException nfe)
    {
    }
    return i;
  }
  public static boolean getBoolean(String message)
  {
    System.out.print(message);
    return getBoolean();
  }
}
