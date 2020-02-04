
public class main {
    public static void main(String[] args){
        String name = "Ryan";
        int age = 30;
        String gender = "male";
        String[] interest = {"being a hardarse", " agile", " and ssd hard drives"};

        Person person =  new Person(name, age, gender, interest);
        String greetings = person.hello();
        System.out.println(greetings);
    }
}
