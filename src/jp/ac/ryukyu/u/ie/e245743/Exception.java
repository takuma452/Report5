package jp.ac.ryukyu.u.ie.e245743;

public class Exception {
  public static void main(String[] args) {
    String str = null;

    try{
      System.out.println(str.length());
    } catch(NullPointerException e){
      System.out.println("NullPointerExceptionが発生しました");
      System.out.println(e.getMessage());
    }
  }
}
