package Assigment_1;

class BuilderTost {

    private String bread;
    private String sosage;
    private String cheese;
    private String sous;

    private BuilderTost(Builder builder){
        this.bread = builder.bread;
        this.sosage = builder.sosage;
        this.cheese = builder.cheese;
        this.sous = builder.sous;
    }

    static class Builder {

        private String bread;
        private String sosage;
        private String cheese;
        private String sous;


        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setSosage(String sosage) {
            this.sosage = sosage;
            return this;
        }

        public Builder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setSous(String sous) {
            this.sous = sous;
            return this;
        }

        public BuilderTost build() {
            return new BuilderTost(this);
        }

    }
    @Override
    public String toString(){
        return "Your Tost ingredients \n" +
                "Bread: " +bread +"\n"+ "Meat: " + sosage + "\n" +
                "Cheese: " + cheese + "\n" + "Sous: " + sous + "\n";
    }
}
