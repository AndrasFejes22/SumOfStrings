import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Kata {

    /*
    public static String sumStrings(String a, String b) {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        if(a.equals("")){
            return String.valueOf(Integer.parseInt(b));
        } else if (b.equals("")){
            return String.valueOf(Integer.parseInt(a));
        } else {
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            int intSum = A + B;
            String sum = String.valueOf(intSum);
            return sum;
        }
    }
    */


    public static String sum(String a, String b) {
        String result;
        if (a.startsWith("0") || b.startsWith("0")) {
            a = noNullsInTheBeginning(a);
            b = noNullsInTheBeginning(b);
        }
        if (a.length() != b.length()) {
            if (b.length() > a.length()) {
                int c = b.length() - a.length();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c; i++) {
                    sb.append("0");
                }
                a = sb.toString().concat(a);
            } else {
                int c = a.length() - b.length();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c; i++) {
                    sb.append("0");
                }
                b = sb.toString().concat(b);
            }

        } else if (a.length() != 1) {
            a = "0".concat(a);
            b = "0".concat(b);
        }
        int sum;
        int temp = 0;
        List<Integer> sumList = new ArrayList<>();
        String[] strArrayA = a.split("");
        String[] strArrayB = b.split("");

        for (int i = strArrayA.length - 1; i >= 0; i--) {
            for (int j = strArrayB.length - 1; j >= 0; j--) {
                if (i == j && j != 0) {
                    sum = Integer.parseInt(strArrayA[i]) + Integer.parseInt(strArrayB[j]) + temp; // 600 + 1400 // HA a temp-et hozzáadjuk, ki kell nullázni!!!
                    temp = 0;
                    if (sum < 10) {
                        sumList.add(sum);
                    } else {
                        String[] sumArray = String.valueOf(sum).split("");
                        sumList.add(Integer.valueOf(sumArray[1])); // 10-nél ez 0
                        temp = Integer.parseInt(sumArray[0]);
                    }

                } else if (i == j) {
                    sum = Integer.parseInt(strArrayA[0]) + Integer.parseInt(strArrayB[0]) + temp;
                    sumList.add(sum);
                }
            }

        }
        Collections.reverse(sumList);
        result = sumList.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining());

        if (result.startsWith("0")) {
            return noNullsInTheBeginning(result);
        } else {
            return result;
        }

    }

    public static String sumStringsWithBig(String a, String b) { // validálásra
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        if(a.equals("")){
            return String.valueOf(new BigInteger(b));
        } else if (b.equals("")){
            return String.valueOf(new BigInteger(a));
        } else {
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            BigInteger BSum = A.add(B);
            return String.valueOf(BSum);
        }
    }

    public static String noNullsInTheBeginning(String stringNumber){
        return stringNumber.replaceFirst("^0+(?!$)", "");
    }

    public static boolean startsWithNull(String number){
        return number.startsWith("0");
    }


    public static String doubleToString(Double d){
        String D = String.valueOf(d);
        D = D.replace(".", "");
        return D;
    }

}
