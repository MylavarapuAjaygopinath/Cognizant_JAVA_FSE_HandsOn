package com.account.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccountDetails(@PathVariable String number) {
        return Map.of(
                "number", "88987987973432",
                "type", "savings",
                "balance", 234343
        );
    }
}