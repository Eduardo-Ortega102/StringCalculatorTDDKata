import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringCalculatorShould_ {
    // Examples:
    //  "1,2,3" -> 6
    //  "3,a,5" -> 8
    //  "5,5,5,5" -> 20
    // "3g1n6g." -> 0
    // "3" -> 3
    // "//#/2#2" -> 4
    // "//<>/3<>1<>1" -> 5


    @Test
    public void sum_separated_numbers() {
        assertThat(StringCalculator.sum("20")).isEqualTo(20);
        assertThat(StringCalculator.sum("6,5,1")).isEqualTo(12);
    }

    @Test
    public void ignore_non_numeric_characters() {
        assertThat(StringCalculator.sum("6,F")).isEqualTo(6);
        assertThat(StringCalculator.sum("5,")).isEqualTo(5);
        assertThat(StringCalculator.sum("3,g,1,n,6,g,.")).isEqualTo(10);
        assertThat(StringCalculator.sum("3g1n6g.")).isEqualTo(0);
        assertThat(StringCalculator.sum("//#/2#3#g#6#,")).isEqualTo(11);
    }

    @Test
    public void sum_numbers_with_custom_separator() {
        assertThat(StringCalculator.sum("//#/20")).isEqualTo(20);
        assertThat(StringCalculator.sum("//<>/3<>1<>1")).isEqualTo(5);
    }

}
