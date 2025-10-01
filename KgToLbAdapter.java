package Assignment_3;

//Lb = pounds

public class KgToLbAdapter implements converterTolb {
    private static final double KG_TO_LB = 2.20462262185;

    private final weightLbForExternalService external;

    public KgToLbAdapter(weightLbForExternalService external) {
        this.external = external;
    }

    @Override
    public double toPounds(double kg){
        double pounds = external.Lb(kg * KG_TO_LB);
        return pounds;
    }
}
