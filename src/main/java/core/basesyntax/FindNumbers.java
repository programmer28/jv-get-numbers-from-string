package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern p = Pattern.compile("-?[0-9]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            list.add(Integer.parseInt(m.group()) * 2);
        }
        int[] resArray = new int[list.size()];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = list.get(i);
        }
        return resArray;
    }
}
