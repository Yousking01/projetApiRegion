/*
package com.apiRegion.springjwt.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

//public class Comment {

    @Entity
    @Table
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String text;

        // Getters et setters
        @ManyToOne
        @JoinColumn(name = "regions_id_regions")
        private Regions regions;
        @JoinColumn(name = "id_users") // ICI IMPORTANT
        @ManyToOne()//cascade=CascadeType.ALL
        private User user;
    }
//}
*/
