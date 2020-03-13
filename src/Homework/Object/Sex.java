package Homework.Object;

public class Sex {
    private boolean isMale;

    public Sex(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean isMale() {
        return isMale;
    }

    public Sex setMale(boolean male) {
        isMale = male;
        return this;
    }

    @Override
    public String toString() {
        return isMale ? "Man" : "Woman";
    }
}
