public class GenericmethodExample {
    public static void main(String[] args) {
        // initialize the class with Integer data
        GenericDemo dObj = new GenericDemo();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char
        System.out.println();

        // initialize generic class
        // with String and Integer data

        GernericMultipleDataType<String, Integer> mobj = new GernericMultipleDataType<>("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GernericMultipleDataType<String, String> mobj2 = new GernericMultipleDataType<>("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}

