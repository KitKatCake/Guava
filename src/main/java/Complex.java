public class Complex {
    private double re,im;
    public Complex(double re,double im){
        this.re = re;
        this.im = im;
    }

//    @Override
//    public String toString() {
//        //return super.toString();
//        return String.format(re+" + i"+im);
//    }


    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);

        // If the object is compared with itself then return true
        if (obj == this){
            return true;
        }

         /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if(!(obj instanceof Complex)){
            return false;
        }
        // typecast o to Complex so that we can compare data members
        Complex c = (Complex) obj;
        // Compare the data members and return accordingly
        return Double.compare(re,c.re) == 0 && Double.compare(im,c.im) == 0;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        Complex c3 = c1;

        System.out.println(c3==c1);
//        if (c1 == c2) {
//            System.out.println("Equal ");
//        } else {
//            System.out.println("Not Equal ");
//        }
        //System.out.println(c1);


        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

    }
}
