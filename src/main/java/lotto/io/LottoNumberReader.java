package lotto.io;

import camp.nextstep.edu.missionutils.Console;
import lotto.entity.Lotto;
import lotto.exception.DuplicateLottoNumbersException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static lotto.exception.LottoNumberException.LottoNumberException;

public class LottoNumberReader {
    public List<Integer> lottonumbers = new ArrayList<>();

    public List<Integer> lotto_reader() {
        try {
            String input = Console.readLine();
            lottonumbers = LottoNumberException(input);

            if (hasDuplicates(lottonumbers)) {
                throw new DuplicateLottoNumbersException("로또 번호에 중복된 값이 있습니다.");
            }

            Lotto lotto = new Lotto(lottonumbers);
            System.out.println("로또 번호 : " + lottonumbers);
            return lottonumbers;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 다시 입력하시오");
            return lotto_reader(); // 예외가 발생한 경우 다시 입력하도록 재귀 호출
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 다시 입력하시오");
            return lotto_reader(); // 예외가 발생한 경우 다시 입력하도록 재귀 호출
        } catch (DuplicateLottoNumbersException e) {
            System.out.println("[ERROR] " + e.getMessage());
            return lotto_reader();
        }
    }

    private boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (Integer number : numbers) {
            if (set.contains(number)) {
                return true; // 중복된 값이 존재
            }
            set.add(number);
        }
        return false; // 중복된 값이 없음
    }

    // LottoNumberException 메서드는 어디에 정의되어 있는지 확인하십시오.
    // 필요하면 추가 정의하고 import 문을 사용하여 올바른 클래스를 가져오십시오.
}
