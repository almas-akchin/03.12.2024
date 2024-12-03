public class Solution {
    /**
     * Функция для добавления пробелов в строку по заданным индексам.
     * @param s - Исходная строка.
     * @param spaces - Массив индексов, перед которыми нужно добавить пробелы.
     * @return Модифицированная строка с добавленными пробелами.
     */
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIndex = 0;
        int spacesLength = spaces.length;

        for (int i = 0; i < s.length(); i++) {
            // Проверяем, нужно ли вставить пробел перед текущим символом
            if (spaceIndex < spacesLength && i == spaces[spaceIndex]) {
                sb.append(' ');
                spaceIndex++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    // Метод для тестирования решения
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Пример 1:
        String s1 = "LeetcodeHelpsMeLearn";
        int[] spaces1 = {8,13,15};
        System.out.println(solution.addSpaces(s1, spaces1)); // Вывод: "Leetcode Helps Me Learn"

        // Пример 2:
        String s2 = "icodeinpython";
        int[] spaces2 = {1,5,7,9};
        System.out.println(solution.addSpaces(s2, spaces2)); // Вывод: "i code in py thon"

        // Пример 3:
        String s3 = "spacing";
        int[] spaces3 = {0,1,2,3,4,5,6};
        System.out.println(solution.addSpaces(s3, spaces3)); // Вывод: " s p a c i n g"

        // Дополнительные тесты:

        // Тест 4: Вставка пробела перед первым символом
        String s4 = "HelloWorld";
        int[] spaces4 = {0};
        System.out.println(solution.addSpaces(s4, spaces4)); // Вывод: " HelloWorld"

        // Тест 5: Нет пробелов
        String s5 = "NoSpacesHere";
        int[] spaces5 = {};
        System.out.println(solution.addSpaces(s5, spaces5)); // Вывод: "NoSpacesHere"

        // Тест 6: Все возможные пробелы
        String s6 = "ABC";
        int[] spaces6 = {0,1,2,3};
        System.out.println(solution.addSpaces(s6, spaces6)); // Вывод: " A B C"
    }
}
