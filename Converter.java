package Assignment_3;

public class Converter {
    public static void main(String[] args) {
        converterTolb converter = new KgToLbAdapter(new weightLbForExternalService());
        double lb = converter.toPounds(5);
        System.out.println(lb);
    }
}
