public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i, i + 1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String originalNumber = "";
        for (int digit : digits) {
            originalNumber += digit + " ";
        }
        return originalNumber + "\n";
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        int decimalValue = 0;
        int power = digits.length - 1;
        for (int digit : digits) {
            decimalValue += digit * Math.pow(base, power);
            power--;
        }
        return decimalValue;
    }

    public int[] convertToBinary() {
        int decimalConversion = convertToDecimal();
        int length = 0;

        int temp = decimalConversion;
        while (temp != 0) {
            length++;
            temp /= 2;
        }

        int[] binaryarray = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            binaryarray[i] = decimalConversion % 2;
            decimalConversion /= 2;
        }

        return binaryarray;
    }

    public int[] convertToOctal() {
        int decimalConversion = convertToDecimal();
        int length = 0;

        int temp = decimalConversion;
        while (temp != 0) {
            length++;
            temp /= 8;
        }
        int[] octarray = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            octarray[i] = decimalConversion % 8;
            decimalConversion /= 8;
        }

        return octarray;
    }
}