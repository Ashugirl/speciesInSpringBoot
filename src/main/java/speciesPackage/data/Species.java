package speciesPackage.data;


public class Species {
    private String name;
    private int maxAge;
    private boolean extinct;

    public Species() {
    }

    public Species(String name, int maxAge, boolean extinct) {
        this.name = name;
        this.maxAge = maxAge;
        this.extinct = extinct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", maxAge=" + maxAge +
                ", extinct=" + extinct +
                '}';
    }
}

