public class lab7 {
    public static class ObjectWrapper <typename> {
        private typename data;
        public ObjectWrapper(typename data) { this.data = data; }
        public void swap(ObjectWrapper object) {
            ObjectWrapper buf = this;
            if (buf.get_data().getClass() == object.get_data().getClass()){
                Object buf_data = object.data;
                object.data = buf.data;
                buf.data = buf_data;
            }
        }
        public typename get_data() { return data; }
        public void set_data (typename data) { this.data = data;}
    }


    public static class Dog {
        String name;
        String breed;
        Dog(String name_, String breed_) {
            this.name = name_;
            this.breed = breed_;
        }

        void print(){
            System.out.println("[ " + "name: " + name + "\tbreed: " + breed + " ]");
        }
    }



    public static void main(String[] args) {
        String str1 = "string1";
        String str2 = "string2";

        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);

        ObjectWrapper<String> wrap_str1 = new ObjectWrapper<>(str1);
        ObjectWrapper<String> wrap_str2 = new ObjectWrapper<>(str2);

        System.out.println("\n---swap---\n");
        wrap_str1.swap(wrap_str2);
        str1 = wrap_str1.get_data();
        str2 = wrap_str2.get_data();

        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);

        Dog doggy1 = new Dog("Gera", "German Shepherd");
        Dog doggy2 = new Dog("Crocby", "Boston Terrier");

        System.out.println("\n----------------\n");

        System.out.println("First dog ");
        doggy1.print();
        System.out.println("Second dog ");
        doggy2.print();

        ObjectWrapper<Dog> wrap_dog1 = new ObjectWrapper<>(doggy1);
        ObjectWrapper<Dog> wrap_dog2 = new ObjectWrapper<>(doggy2);

        System.out.println("\n---swap--- ");
        wrap_dog1.swap(wrap_dog2);
        doggy1 = wrap_dog1.get_data();
        doggy2 = wrap_dog2.get_data();

        System.out.println("\nFirst dog ");
        doggy1.print();
        System.out.println("Second dog ");
        doggy2.print();
//        System.out.println("Before:\n" +
//                "FirstInt:\t" + firstInteger + "\n" +
//                "SecondInt:\t" + secondInteger);
//
//        firstIntegerWrap.swap(secondIntegerWrap);
//
//        firstInteger = firstIntegerWrap.get_data();
//        secondInteger = secondIntegerWrap.get_data();
//
//        System.out.println("After:\n" +
//                "FirstInt:\t" + firstInteger + "\n" +
//                "SecondInt:\t" + secondInteger + "\n");
//
//
//        ObjectWrapper<String> wrapper1 = new ObjectWrapper<>(firstString);
//        ObjectWrapper<String> wrapper2 = new ObjectWrapper<>(secondString);
//
//        System.out.println("Before:\n" +
//                "FirstInt:\t" + firstString + "\n" +
//                "SecondInt:\t" + secondString);
//
//        firstStringWrap.swap(secondStringWrap);
//
//        firstString = firstStringWrap.getData();
//        secondString = secondStringWrap.getData();
//
//        System.out.println("After:\n" +
//                "FirstInt:\t" + firstString + "\n" +
//                "SecondInt:\t" + secondString + "\n");
//
//
//        ObjectWrapper<Animal> firstAnimalWrap = new ObjectWrapper<>(firstAnimal);
//        ObjectWrapper<Animal> secondAnimalWrap = new ObjectWrapper<>(secondAnimal);
//
//        System.out.println("Before:\n" +
//                "FirstInt:\t" + firstAnimal + "\n" +
//                "SecondInt:\t" + secondAnimal);
//
//        firstAnimalWrap.swap(secondAnimalWrap);
//
//        firstAnimal = firstAnimalWrap.getData();
//        secondAnimal = secondAnimalWrap.getData();
//
//        System.out.println("After:\n" +
//                "FirstInt:\t" + firstAnimal + "\n" +
//                "SecondInt:\t" + secondAnimal);
//        MyObject obj1 = new MyObject("красный", 5, 45.8);
//        MyObject obj2 = new MyObject("жёлтый", 7, 24.6);
//
//        System.out.println("Object 1: ");
//        obj1.print_obj();
//        System.out.println("Object 2: ");
//        obj2.print_obj();
//
//        obj1.swap(obj2);
//
//        System.out.println("Object 1: ");
//        obj1.print_obj();
//        System.out.println("Object 2: ");
//        obj2.print_obj();

    }
}
