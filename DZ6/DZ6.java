public class DZ6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        
        cat1.age = 3;
        cat1.name = "Snejok";
        cat1.owner = "Jeniy";
        cat1.vaccination = true;
    
        Cat cat2 = new Cat();

        cat2.age = 6;        
        cat2.name = "Snejinka";
        cat2.owner = "Taniy";
        cat2.vaccination = false;
    
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

    }

}
