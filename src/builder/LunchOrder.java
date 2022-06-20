package builder;

public class LunchOrder {

    private final String bread;
    private final String meat;
    private final String condiments;
    private final String dressing;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    
    @Override
    public String toString() {
        return
            "LunchOrder [" +
            "bread=" + bread +
            ", meat=" + meat +
            ", condiments=" + condiments +
            ", dressing=" + dressing +
            "]"
        ;
    }

    /*
     * Static inner class used for buiding Lunch
     */
    public static class Builder {
        private String bread;
        private String meat;
        private String condiments;
        private String dressing;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }
    }
}
