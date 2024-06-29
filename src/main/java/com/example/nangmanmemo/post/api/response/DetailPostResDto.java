package com.example.nangmanmemo.post.api.response;

import com.example.nangmanmemo.comment.domain.Comment;
import com.example.nangmanmemo.image.domain.Image;
import com.example.nangmanmemo.post.domain.Post;
import lombok.Builder;

import java.util.List;

@Builder
public record DetailPostResDto(
        String title,
        String content,
        String imageUrl,

        List<String> comments

) {
    public static DetailPostResDto from (Post post, List<Comment> comments, Image image) {
        List<String> comments1 = post.getCommentList().stream()
                .map(Comment::getContent)
                .toList();


        return DetailPostResDto.builder()
                .title(post.getTitle())
                .content(post.getContent())
                .imageUrl(image.getImageUrl())
                .comments(comments1)
                .build();
    }
}