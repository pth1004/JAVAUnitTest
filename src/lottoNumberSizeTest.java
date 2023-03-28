
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

//로또테스트공통규칙
public class lottoNumberSizeTest {
    @DisplayName("로또 번호 갯수 테스트")
    @Test
    void lottoNumberSizeTest(){

        //given
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        final int price = 1000;
        //우선 로또를 생성받기 위해서는 로또 생성기 객체와 금액이 필요하다.
        // 그렇기에 given 단계에서는 LottoNumberGenerator 객체와 금액을 적어주면 된다.


        //when
        final List<Integer> lottoNumber = lottoNumberGenerator.generate(price);
        //준비가 끝났으면 주어진 금액을 지불하여 로또를 받아야 한다.


        //then
        //assertThat();

    }
}
