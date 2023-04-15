public class Main {
    public static void main(String[] args) throws Exception {
       Parent pa = new Parent();
       Child1 ch1 = new Child1();
       Child2 ch2 = new Child2();

        //Attributes for Parent
       pa.Attidude = "Jolly";
       pa.HairColor = "Gray";
       pa.BloodType = "A+";
       pa.Property = "BMW";

        //Attributes for Child 1
       ch1.Attidude = "Moody";
       ch1.HairColor = "Black";
       ch1.BloodType = "AB+";
       ch1.Property = "BMW";
       ch1.Name = "Andrew";
       ch1.Age = 42;
       ch1.Birthdate = "July 12 , 1980";

       //Attributes for Child 2
       ch2.Attidude = "Jolly";
       ch2.HairColor = "Gray";
       ch2.BloodType = "O+";
       ch2.Property = "Toyota Trueno";
       ch2.Name = "Liza";
       ch2.Age = 23;
       ch2.Birthdate = "August 19 , 2000";

       System.out.println("Parent:");
       pa.ParentAtrributes();

       System.out.println("Child 1");
       ch1.ParentAtrributes();
       ch1.ChildAttributes();

       System.out.println("Child 2");
       ch2.ParentAtrributes();
       ch2.ChildAttributes();
       
    }
    
}
