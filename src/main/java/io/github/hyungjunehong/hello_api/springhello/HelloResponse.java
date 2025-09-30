package io.github.hyungjunehong.hello_api.springhello;

public record HelloResponse(
        String koreaTime,
        long timestamp,
        String message
) {}