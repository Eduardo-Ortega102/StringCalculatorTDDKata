import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Should {
    // "1,2,3" -> 6
    // "3,a,5" -> 8
    // "5,5,5,5" -> 20
    // "3" -> 3
    // "//#/2#2" -> 4
    // "//<>/3<>1<>1" -> 5
    // "3g1n6g." -> 0

    @Test
    public void return_the_same_number_when_is_the_onlyone() {
        assertThat(StringCalculator.sum("6")).isEqualTo(6);
    }

    @Test
    public void ignore_non_numeric_characters() {
        assertThat(StringCalculator.sum("6,F")).isEqualTo(6);
        assertThat(StringCalculator.sum("6,.")).isEqualTo(6);
        assertThat(StringCalculator.sum("5,")).isEqualTo(5);
        assertThat(StringCalculator.sum("3,g,1,n,6,g,.")).isEqualTo(10);
        assertThat(StringCalculator.sum("3g1n6g.")).isEqualTo(0);
    }
}
