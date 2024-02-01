package com.learning.blogapp.common.dtos;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ErrorResponse {
    private String message;
}
