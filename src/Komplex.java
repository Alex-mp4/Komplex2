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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.re, re) == 0 && Double.compare(komplex.im, im) == 0;
    }

    public Komplex add(Komplex b) {
        return new Komplex(re + b.re, im + b.im);
    }

    public Komplex multiply(Komplex b) {
        return new Komplex(re * b.re - im * b.im, im * b.re + re * b.im);
    }

    public double arg() {
        return (Math.atan(im / re));
    }
}
