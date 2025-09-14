package Assigment_1;

public class Tost {
    public static void main(String[] args) {
        BuilderTost tost = new BuilderTost.Builder()
                .setBread("Romanovski")
                .setSosage("Halal one")
                .setCheese("White")
                .setSous("Ketchunez")
                .build();

        System.out.println(tost);
    }
}