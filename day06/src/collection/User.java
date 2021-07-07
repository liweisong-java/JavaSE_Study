package collection;

/**
 * @author liweisong
 * @2021072021/7/713:58
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {//return name.hashCode() + age；
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
// 按照姓名从大到小排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User)o;
            return -this.name.compareTo(user.name);
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
