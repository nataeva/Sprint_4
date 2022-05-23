public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        boolean containsIncorrectSpaces = name.startsWith(" ") || name.endsWith(" ");

        boolean correctLength = name.length() >= 3 && name.length() <= 19;

        boolean containsASingleSpace = name.chars()
                .filter(c -> c == (int) ' ')
                .count() == 1;

        return !containsIncorrectSpaces && correctLength && containsASingleSpace;
    }

}