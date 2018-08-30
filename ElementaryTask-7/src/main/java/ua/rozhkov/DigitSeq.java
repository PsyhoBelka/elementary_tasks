package ua.rozhkov;

public class DigitSeq {

    public String printSeq(String lengthSeq, String maxSquare) {
        int length;
        int max;
        String result = "";
        try {
            length = Integer.parseInt(lengthSeq);
            max = Integer.parseInt(maxSquare);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Wrong parameters!");
        }

        if ((length <= 0) || (max <= 0)) {
            return "0";
        } else {
            int base = (int) Math.sqrt(max);
            for (int i = 0; i < length; i++) {
                result += String.format("%.0f", Math.pow(++base, 2));
                if (i < length - 1) {
                    result += ", ";
                }
            }
        }
        return result;
    }
}