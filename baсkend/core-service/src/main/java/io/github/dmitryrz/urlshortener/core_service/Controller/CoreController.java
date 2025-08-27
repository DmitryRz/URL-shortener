package io.github.dmitryrz.urlshortener.core_service.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.dmitryrz.urlshortener.core_service.dto.request.UrlDtoRequest;
import io.github.dmitryrz.urlshortener.core_service.dto.response.UrlDtoResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController("/api/core")
public class CoreController {


    @PostMapping("/create")
    public ResponseEntity<UrlDtoResponse> create(@RequestBody UrlDtoRequest RequestBody) {
        return ResponseEntity.ok().build();
    }
}
