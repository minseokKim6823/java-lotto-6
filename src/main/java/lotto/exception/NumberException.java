package lotto.exception;

import lotto.io.MoneyReader;

public class NumberException {
    public static void money_reader(int input) {
        if (input % 1000 != 0) {
            throw new NumberFormatException("알맞는 값이 아닙니다 다시 입력 하세요");
        }
    }
}