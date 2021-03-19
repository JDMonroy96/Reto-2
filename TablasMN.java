public class TablasMN {

    public void tablasMultiplicar(int a,int b){
        int contador = 0;
        for(int i=1;contador < a;i++){
            contador++;
            for (int j=0;j<=b; j++){
                System.out.println(i + " x " + j + " = " + i*j);

            }
            System.out.println("//////////////////////////////");
        }
    }

}
