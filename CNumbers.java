class Complex{
    private int real;
    private int imaginary;
    Complex(){
        real = 0;
        imaginary = 0;
    }
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void set(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getReal(){return real;}
    public int getImaginary(){return imaginary;}
    public Complex sum(Complex c1, Complex c2){
        Complex res = new Complex((c1.getReal() + c2.getReal()), (c1.getImaginary() + c2.getImaginary()));
        return res;
    }
    public Complex diff(Complex c1,Complex c2){
        Complex res = new Complex((c1.getReal() - c2.getReal()), (c1.getImaginary() + c2.getImaginary()));
        return res;
    }
    public Complex product(Complex c1, Complex c2){
        Complex res = new Complex((c1.getReal()*c2.getReal() - c1.getImaginary() * c2.getImaginary()) ,(c1.getReal()*c2.getReal() - c1.getImaginary() * c2.getImaginary()));
        return res;
    }
}
public class CNumbers {
    public static void main(String args[]){
        Complex c1 = new Complex(2,4);
        Complex c2 = new Complex(6,8);
        Complex res = new Complex();
        res = res.sum(c1,c2);
        System.out.println(res.getReal() + " + " + "(" + res.getImaginary() + ")" + "i");
    }
}
