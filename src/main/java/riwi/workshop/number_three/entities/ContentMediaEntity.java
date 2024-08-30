package riwi.workshop.number_three.entities;

import jakarta.persistence.*;
import riwi.workshop.number_three.services.utils.enums.MediaType;

@Entity
@Table(name = "content_media")

public class ContentMediaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MediaType type;

    private String url;

    @ManyToOne
    @JoinColumn(name = "lesson_id", nullable = false)
    private LessonEntity lesson;


}
