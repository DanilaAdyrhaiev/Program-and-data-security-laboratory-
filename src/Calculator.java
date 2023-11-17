public class Calculator {
    public double[][] sumClases(int[] a, int[] b, int mod){
        double[][] val = new double[a.length][b.length];
        for(int i=0; i<val.length; i++){
            for(int j=0; j<val[i].length; j++){
                val[i][j] = (a[i] + b[j]) % mod;
            }
        }
        return val;
    }


    public double[][] subClases(int[] a, int[] b, int mod){
        double[][] val = new double[a.length][b.length];
        for(int i=0; i<val.length; i++){
            for(int j=0; j<val[i].length; j++){
                double numb = a[i] - b[j];
                while(numb <=0){
                    numb+=mod;
                }
                val[i][j] = numb%mod;
            }
        }
        return val;
    }


    public double[] reverseElements(int[] a, int mod){
        double val[] = new double[a.length];
        for(int i = 0; i < val.length; i++){
            double numb = a[i] * -1;
            while(numb <=0){
                numb+=mod;
            }
            val[i] = numb%mod;
        }
        return val;
    }


    public double[][] multClasses(int[] a, int[] b, int mod){
        double[][] val = new double[a.length][b.length];
        for(int i=0; i<val.length; i++){
            for(int j=0; j<val[i].length; j++){
                double numb = a[i] * b[j];
                while(numb <=0){
                    numb+=mod;
                }
                val[i][j] = numb%mod;
            }
        }
        return val;
    }


    public void displayResult(double[][] res){
        for(int i=0; i<res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public void displayResult(double[] res){
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + "\t");
            System.out.println();
        }
    }
}

