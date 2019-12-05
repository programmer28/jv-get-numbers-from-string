package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        List<Integer> list = new ArrayList<>();
        char[] array = text.toCharArray();
        String number = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '-' && i + 1 < array.length
                    && Character.isDigit(array[i + 1]) && number.equals("")) {
                number += array[i];
            }
            if (!Character.isDigit(array[i]) && !number.equals("") && !number.equals("-")) {
                list.add(Integer.parseInt(number) * 2);
                if (array[i] == '-') {
                    number = "-";
                } else {
                    number = "";
                }
            }
            if (Character.isDigit(array[i])) {
                number += array[i];
                if (i == array.length - 1) {
                    list.add(Integer.parseInt(number) * 2);
                }
            }
        }
        int k = list.size();
        int[] resArray = new int[k];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = list.get(i);
        }
        return resArray;
    }
}
