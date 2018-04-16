package com.rannn.object;

//protected void finalize & protected Object clone方法
public class FinalizeClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建学生对象
        Student s = new Student();

        // Student类重写clone方法
        //克隆学生对象
        s.setName("TA");
        s.setAge(20);
        Object obj = s.clone();
        Student s2 = (Student) obj;
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
