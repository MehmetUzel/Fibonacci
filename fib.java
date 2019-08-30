
class fib {
    static int fibalti(int n)
    {
        /* Fibonacci serimiz için bir array belirleyip kaydedelim.*/
        int f[] = new int[n + 1];
        int i;

        /* Serinin ilk terimi 0, ikinci terimi 1*/
        f[0] = 0;

        if (n > 0) {
            f[1] = 1;

            for (i = 2; i <= n; i++) {
				/* Önceki iki sayıyının toplamının 1.000.000 a göre modunu alıp kaydediyoruz.
				 * eğer son altı değil de son 2 3 ya da farklı basamaklarını hesaplamak isterseniz modunu ona göre alabilirsiniz */

                f[i] = (f[i - 1] + f[i - 2])%1000000;
            }
        }


        return f[n];
    }

    public static void main(String args[])
    {
        int n = 70;
        System.out.println(fibalti(n));
    }
}

