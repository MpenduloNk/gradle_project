import org.omg.CORBA.PRIVATE_MEMBER;

public class Person {
       private String name;
       private int age;
       private String gender;
       private String[] interest = new String[3];

       public Person(String name, int age, String gender, String[] interest){
           this.name = name;
           this.age = age;
           this.gender = gender;
           this.interest = interest;
       }

        public String hello(){
             return "Hello my name is "+ name + " and I am "+ age+" years old. My interests are "+interest[0]+ interest[1]+interest[2];
        }
}
