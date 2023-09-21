package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="instructor_detail")
@Data // to generate getters, setters, toString, and hashCode/equals methods
public class InstructorDetail {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="youtube_channel")
    private String youtubeChannel;

    @Column(name="hobby")
    private String hobby;

    public InstructorDetail() {
    }

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }
}
