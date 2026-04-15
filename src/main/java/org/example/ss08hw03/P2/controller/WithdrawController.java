package org.example.ss08hw03.P2.controller;

import jakarta.validation.Valid;
import org.example.ss08hw03.P2.dto.WithdrawRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/withdraw")
public class WithdrawController {

    @PostMapping
    public ResponseEntity<String> withdraw(@Valid @RequestBody WithdrawRequestDto requestDto) {
        return ResponseEntity.ok("Yêu cầu rút tiền hợp lệ, đang xử lý...");
    }
}

