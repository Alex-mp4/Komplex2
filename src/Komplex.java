import java.util.Objects;

public class Komplex {
    double re;
    double im;

    public Komplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return "Komplex{" +
                "re=" + re +
                ", im=" + im + 'i' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public Komplex add(Komplex b) {
        return new Komplex(re + b.re, im + b.im);
    }

    public Komplex multiply(Komplex b) {
        return new Komplex(re * b.re - im * b.im, im * b.re + re * b.im);
    }

    public double arg() {
        return 0;
    }
}
