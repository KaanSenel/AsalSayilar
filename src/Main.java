public class Main {

    public static void main(String[] args) {
	// write your code here
        int asal;
        for (int i = 2; i < 100; i++) {
            asal=0;
            for (int j = 2; j < i; j++) {
                if(i%j==0)
                    asal=1;
            }
            if(asal==0)
                System.out.print(i+"\t");
        }

    }
}
