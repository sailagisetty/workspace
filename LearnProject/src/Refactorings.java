class ExtractVar{

    final static int a_const = 10000;
    final static int b_const = 500;


    public void calc(){

        int i1 = (new InnerCalc()).process(a_const, b_const);
        i1 = i1;
        int i2 = 1;
        i1 = i2;
        i1 = i1;
        long i = i2;

    }

    class InnerCalc{

        final static int some_const = 124136;

        int process(int a, int b){
            return  a * b + some_const;
        }
    }

}