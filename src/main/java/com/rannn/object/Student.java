package com.rannn.object;

public class Student implements Cloneable {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof Student))
//			return false;
//		Student other = (Student) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

//	@Override
//	public boolean equals(Object obj) {    
//		//default:return super.equals(obj);
//		//equals代码优化 
//		//1.提高效率
//		if (this == obj) {
//			return true;
//		}
//		//2.提高程序健壮性
//		//先判断(对象是否是某个类的对象)再向下转型
//		//instanceof
//		 if (!(obj instanceof Student)) {
//			 return false;
//		 }
//		//downcasting
//		Student s = (Student)obj;
//		//方式1
////		if (this.name.equals(s.name) && this.age == s.age) {
////			return true;
////		}else {
////			return false;
////		}
//		//方式2
//		return this.name.equals(s.name) && this.age == s.age;
//	}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
