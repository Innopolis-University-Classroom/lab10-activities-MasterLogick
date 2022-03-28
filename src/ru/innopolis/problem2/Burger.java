public class Burger {
    private PartSize cheese, peperone, letucci, tomato;

    private Burger(PartSize cheese, PartSize peperone, PartSize letucci, PartSize tomato) {
        this.cheese = cheese;
        this.peperone = peperone;
        this.letucci = letucci;
        this.tomato = tomato;
    }

    public class BurgerBuilder {
        private PartSize cheese, peperone, letucci, tomato;

        public BurgerBuilder() {
            cheese = PartSize.Medium;
            peperone = PartSize.Medium;
            letucci = PartSize.Medium;
            tomato = PartSize.Medium;
        }

        BurgerBuilder setCheeseSize(PartSize size) {
            cheese = size;
            return this;
        }

        BurgerBuilder setPeperoneSize(PartSize size) {
            peperone = size;
            return this;
        }

        BurgerBuilder setLetucciSize(PartSize size) {
            letucci = size;
            return this;
        }

        BurgerBuilder setTomatoSize(PartSize size) {
            tomato = size;
            return this;
        }

        Burger build() {
            return new Burger(cheese, peperone, letucci, tomato);
        }
    }
}
