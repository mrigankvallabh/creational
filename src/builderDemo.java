import builder.LunchOrder;

public class builderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder sandwiBuilder = new LunchOrder.Builder();
        LunchOrder lunch = 
            sandwiBuilder
                .bread("Parmesan Oregano")
                .meat("Roasted Chicken")
                .condiments("All Veggies")
                .dressing("Sweet Onion & Honey Mustard")
                .build()
        ;

        System.out.println(lunch);
    }
}
