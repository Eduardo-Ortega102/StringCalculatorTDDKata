public class StringCalculator {
    public static int sum(String numbers) {
        int sum = 0;
        String[] split = numbers.split(",");
        for (String i: split) {
            try{
                sum += Integer.parseInt(i);
            } catch (NumberFormatException e){
                continue;
            }
        }
        return sum;
    }
}
