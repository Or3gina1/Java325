
class Animals {
    public String name;
    public int ves;

    public String color;
    public int activnost;

    public void eat(int eda) {
        ves += eda;
        if (ves  > 15) {
            ves  = 15;
        }
        System.out.println("Питомец " + name + " Покушал " + "(" + eda + "):его вес (" + ves  + ")");
        ves = ves-1;
    }
    public void play() {
        if (ves >= 1) {
            ves -= activnost*2;
            System.out.println("Питомец " + name + " играет " + ves);
        } else {
            System.out.println("Надо покушать");
        }
    }
    String[] SOUNDS ={"Гав Гав", "Мяу Мяу", "Вовка Дурак"};
    public void sound() {
        if (this.name.equals("bobik")){
            System.out.println(SOUNDS[0]);
        }
        if (this.name.equals("murka")){
            System.out.println(SOUNDS[1]);
        }
        if (this.name.equals("kesha")){
            System.out.println(SOUNDS[2]);
        }
    }
    public void info() {
        System.out.println("Питомец ==> " + name +";"+ " ВЕС: " + ves + ";" +" Цвет ==> " + color+".");
    }

}
public class Main {
    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.name ="bobik";
        dog.ves =15;
        dog.color ="Brown";
        dog.activnost = 3;
        dog.sound();
        dog.play();
        dog.eat(5);
        dog.info();
        Animals cat = new Animals();
        cat.name ="murka";
        cat.ves =10;
        cat.color ="Black";
        cat.sound();
        cat.play();
        cat.eat(3);
        cat.info();
        cat.activnost = 2;
        Animals parrot = new Animals();
        parrot.name ="kesha";
        parrot.ves =8;
        parrot.color ="Black";
        parrot.sound();
        parrot.play();
        parrot.eat(1);
        parrot.info();
        parrot.activnost =1;


    }
}
