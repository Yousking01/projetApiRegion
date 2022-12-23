package com.apiRegion.springjwt.controllers;


import com.apiRegion.springjwt.models.Commentaire;
import com.apiRegion.springjwt.models.Regions;
import com.apiRegion.springjwt.models.User;
import com.apiRegion.springjwt.repository.CommentaireRepository;
import com.apiRegion.springjwt.repository.RegionsRepository;
import com.apiRegion.springjwt.repository.UserRepository;
import com.apiRegion.springjwt.security.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "/projet/odk/Commentaire",name ="Commentaire")
public class CommentaireController {

    private CommentaireService commentaireService;
    private RegionsRepository region;
    private UserRepository user;

    /*@Autowired
    private CommentService commentService;*/

    public CommentaireController(CommentaireService commentaireService, RegionsRepository region, UserRepository user, CommentaireRepository commentaireRepository) {
        this.commentaireService = commentaireService;
        this.region = region;
        this.user = user;
        this.commentaireRepository = commentaireRepository;
    }

    private final CommentaireRepository commentaireRepository;


    /*@RestController
    @RequestMapping("/comments")
    public class CommentController {*/



        /*@PostMapping(path = "/commenter")

        public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
            Comment addedComment = commentService.addComment(comment);
            return ResponseEntity.ok(addedComment);
        }*/
   // }
    @PostMapping(path = "/creer/{non}")
    public String ajouterCommentaire(@PathVariable String non, @RequestBody Commentaire commentaire){
         //   System.out.println("############################################: tttt " + commentaire + "##############################");
        User u= user.findByNomUser(non);
      //  Regions r=region.findByNomregions(nomr);
        commentaire.setUser(u);
      //  commentaire.setRegions(r);
        return commentaireService.addNewCommentaire(commentaire);
    }

    @GetMapping(path = "/lister")
    public List<Commentaire> mesCommanteurs(){
        return commentaireService.toutLesCommentaires();
    }


    @GetMapping(path = "/RegionsCommentaire/{id_regions}")
    public List<Commentaire> LesCommentaireDuneRegion(@PathVariable("id_regions") Long id_region){
        return commentaireService.LesCommentaireDuneRegion(id_region);
    }
}
