package lotto;


import lotto.generator.BonusNumber;
import lotto.generator.LottoNumber;
import lotto.io.Read;

public class Application {
    public static void main(String[] args) {
        LottoNumber lottoNumberGenerator =new LottoNumber();
        Lotto lotto =new Lotto(lottoNumberGenerator.NumberGenerator());
        BonusNumber bonusNumber = new BonusNumber();
        bonusNumber.bonusNumberGenerator();
        int number=Read.reader();
        System.out.println(number);


        // TODO: 프로그램 구현
    }
}
