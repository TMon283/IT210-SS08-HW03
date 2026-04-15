package org.example.ss08hw03.P2.dto;

import jakarta.validation.constraints.Min;
import org.example.ss08hw03.P2.validator.MultipleOfTenThousand;

public class WithdrawRequestDto {

    @Min(value = 50000, message = "Số tiền rút phải từ 50.000 VNĐ trở lên")
    @MultipleOfTenThousand
    private Long withdrawAmount;

}
