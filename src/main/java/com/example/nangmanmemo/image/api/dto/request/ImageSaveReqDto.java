package com.example.nangmanmemo.image.api.dto.request;

public record ImageSaveReqDto(
        // 게시글 아이디, 이미지 url
        Long postId,
        String imageUrl
) {
}