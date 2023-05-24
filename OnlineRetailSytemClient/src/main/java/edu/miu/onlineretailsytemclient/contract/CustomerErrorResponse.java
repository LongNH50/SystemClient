package edu.miu.onlineretailsytemclient.contract;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerErrorResponse {
    private String errorMessage;
}
