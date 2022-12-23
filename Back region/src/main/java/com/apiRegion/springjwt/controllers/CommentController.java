/*
package com.apiRegion.springjwt.controllers;

import com.apiRegion.springjwt.models.Comment;
import com.apiRegion.springjwt.security.services.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/comments")
public class CommentController {

    @Autowired
    private commentService commentService;

    @PostMapping(path = "/Commenter")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        Comment addedComment = commentService.addComment(comment);
        return ResponseEntity.ok(addedComment);
    }
}

*/
