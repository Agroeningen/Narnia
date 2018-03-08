package nl.narnia.holder;

public class Kast {

    private Material material;
    private boolean isBroken;

    public Material getMaterial() {
        return material;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public Kast(Material material) {
        this.material = material;
        this.isBroken = false;
    }
}

