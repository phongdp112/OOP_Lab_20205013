package src;

public class TestPassingParameter {
    public static class Wrapper<T> {
        public T value;
        public Wrapper(T value) {
            this.value = value;
        }
    }

//    public static void main(String[] args) {
//        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
//
//        swap(jungleDVD, cinderellaDVD);
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
//
//        changeTitle(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//    }
//
//    public static void swap(Object o1, Object o2) {
//        Object tmp = o1;
//        o1 = o2;
//        o2 = tmp;
//    }
public static void main(String[] args) {
    Wrapper<DigitalVideoDisc> jungleDVD = new Wrapper<>(new DigitalVideoDisc("Jungle"));
    Wrapper<DigitalVideoDisc> cinderellaDVD = new Wrapper<>(new DigitalVideoDisc("Cinderella"));

    System.out.println("Before swap:");
    System.out.println("jungleDVD title: " + jungleDVD.value.getTitle());
    System.out.println("cinderellaDVD title: " + cinderellaDVD.value.getTitle());

    swap(jungleDVD, cinderellaDVD);

    System.out.println("After swap:");
    System.out.println("jungleDVD title: " + jungleDVD.value.getTitle());
    System.out.println("cinderellaDVD title: " + cinderellaDVD.value.getTitle());
}

    public static <T> void swap(Wrapper<T> w1, Wrapper<T> w2) {
    T temp = w1.value;
    w1.value = w2.value;
    w2.value = temp;
}

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
