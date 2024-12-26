package _10_loops.while_;

public class Loop2 {
    public static void main(String[] args) {
        Loop2 obj = new Loop2();
        System.out.println(obj.countDuplicates("Mac Book Pro"));

    }

    public int countDuplicates(String word) {
        int count = 0;
        int index = 0;
        while (index < word.length()) {
            if (word.charAt(index) == 'o'){
                count++;
            }
            index++;

        }
        return count;

    }

}

