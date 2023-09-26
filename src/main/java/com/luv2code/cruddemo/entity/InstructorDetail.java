package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="instructor_detail")
@Data // to generate getters, setters, toString, and hashCode/equals methods
@ToString(exclude = "instructor") // https://terasolunaorg.github.io/guideline/5.0.0.RELEASE/en/Appendix/Lombok.html
public class InstructorDetail {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="youtube_channel")
    private String youtubeChannel;

    @Column(name="hobby")
    private String hobby;

    // mappedBy = "instructorDetail" refers to property in Instructor class
    @OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
    private Instructor instructor;

    public InstructorDetail() {
    }

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }
}
