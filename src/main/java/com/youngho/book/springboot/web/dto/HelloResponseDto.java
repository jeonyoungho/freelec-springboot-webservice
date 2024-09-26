package com.youngho.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by jyh1004 on 2024-09-26
 */

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;


}
