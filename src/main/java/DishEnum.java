public enum DishEnum {
    PASTA(540,true, 12.99){
        public boolean checkCalories() {
            if(PASTA.getCalories()>600){
                System.out.println("High calories");
                return true;
            } else
            return false;
        }
    },
    PIZZA(7000,false,20.0){
        public boolean checkCalories() {
            if(PASTA.getCalories()>600){
                System.out.println("High calories");
                return true;
            } else
                System.out.println("Low calories");
                return false;
        }
    },
    SPAGHETTI(650,false,15.50){
        public boolean checkCalories() {
            if(PASTA.getCalories()>600){
                System.out.println("High calories");
                return true;
            } else
                System.out.println("Low calories");
                return false;
        }
    };

    private int calories;
    private boolean vegetarian;

    public int getCalories() {
        return calories;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    DishEnum(int calories, boolean vegetarian, double price) {
        this.calories=calories;
        this.vegetarian=vegetarian;
        this.price=price;
    }

    public abstract boolean checkCalories();

}

