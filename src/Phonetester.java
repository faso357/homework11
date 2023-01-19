public class Phonetester {
    public static void main(String[] args) {

Phone phone1 = new Phone();
phone1.name= "Iphone";
phone1.color = "blue";
phone1.battery ="medium";
phone1.camera ="three cameras";
phone1.ring();
        System.out.println(phone1.name);
Phone phone2 = new Phone();
phone2.name = "Samsung";
phone2.color = "black";
phone2.battery= "large";
phone2.camera = "two cameras";
phone2.vibrate();
        System.out.println(phone2.color);

        Phone phone3 = new Phone();
        phone3.name = "pixel";
        phone3.color = "grey";
        phone3.battery = "large";
        phone3.camera = "two cameras";
        phone3.turnon();
        System.out.println(phone3.camera);
















    }
}
