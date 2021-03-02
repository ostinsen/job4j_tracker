package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
                throw new ElementNotFoundException("Element isn't found");
            }

        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(FindEl.indexOf(new String[]
                    {"hi", "everybody", "I", "am", "happy"}, "amm"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
