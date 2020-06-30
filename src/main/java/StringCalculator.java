public class StringCalculator {

    public static final String DEFAULT_SEPARATOR = ",";
    public static final String PREFIX = "//";
    public static final String SUFFIX = "/";

    public static int sum(String expression) {
        int sum = 0;
        for (String element: parseExpression(expression, getSeparator(expression))) {
            boolean isNumber = element.matches("\\d+");
            if (isNumber){
                sum += Integer.parseInt(element);
            }
        }
        return sum;
    }

    private static String[] parseExpression(String expression, String separator) {
        if (!separator.equals(DEFAULT_SEPARATOR)){
            expression = expression.substring(PREFIX.length() + separator.length() + SUFFIX.length());
        }
        return expression.split(separator);
    }

    private static String getSeparator(String expression) {
        if (!expression.startsWith(PREFIX)) return DEFAULT_SEPARATOR;
        return expression.substring(PREFIX.length(), expression.indexOf(SUFFIX, PREFIX.length()));
    }
}
