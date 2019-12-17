package ref;
public class Main {
    public static void main(String[] args) {
        Persons p = new Persons("小明", 12);
        Students s = new Students("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Students ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
    }
}

class Persons {
    protected String name;
    protected int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}



class Students extends Persons {
    protected int score;

    public Students(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    public int getScore() { return score; }
}


class PrimaryStudent extends Students  {
    protected int grade;

    public PrimaryStudent(String name,int age,int score,int grade){
        super(name,age,score);
        this.grade=grade;
    }

}

