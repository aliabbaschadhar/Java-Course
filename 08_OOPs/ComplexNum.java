public class ComplexNum {
    public static void main(String[] args) {
        Complex com = new Complex(89, 22);
        com.print();
        Complex com2 = new Complex(22, 21);
        Complex result = com.add(com2);
        result.print();

    }
}

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.println(real + " + i" + imaginary);
    }

    public Complex add(Complex num) {
        real = real + num.real;
        imaginary = imaginary + num.imaginary;
        return new Complex(real, imaginary);
    }

}