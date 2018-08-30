package ua.rozhkov;

public class Envelop {

    private double width;
    private double height;

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public Envelop() {

    }

    public Envelop(double width, double height) {

        this.width = width;
        this.height = height;
    }

    public double square() {

        return height * width;
    }

    public boolean compareEnv(Envelop envelop) {

        if (this.square() > envelop.square()) {
            if (((envelop.getWidth() < this.getWidth()) & (envelop.getHeight() < this.getHeight())) ||
                    ((envelop.getHeight() < this.getWidth()) & (envelop.getWidth() < this.getHeight()))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
