package com.example.yaya.book.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "novels")
public class Novels {
    @Id
    private String _id;
    private String authorId;
    private String authorName;
    private String novelCollectNum;
    private String novelCopywriting;
    private String novelId;
    private String novelImage;
    private String novelIntro;
    private String novelFinished;
    private String novelLabel;
    private String novelName;
    private String novelType;
    private String novelVision;
    private String novelWordCount;
    private Double updatedAt;

}