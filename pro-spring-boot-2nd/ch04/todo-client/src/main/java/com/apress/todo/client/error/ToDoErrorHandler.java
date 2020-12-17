package com.apress.todo.client.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author Shabunina Anita
 */
@Slf4j
public class ToDoErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return !clientHttpResponse.getStatusCode().is2xxSuccessful();
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        log.error(clientHttpResponse.getStatusCode().toString());
        log.error(StreamUtils.copyToString(clientHttpResponse.getBody(), Charset.defaultCharset()));
    }
}
