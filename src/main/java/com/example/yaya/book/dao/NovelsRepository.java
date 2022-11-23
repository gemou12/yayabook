package com.example.yaya.book.dao;

import com.example.yaya.book.model.Novels;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovelsRepository extends MongoRepository<Novels, String> {
    Novels findByNovelId(String novelId);
//    @Query(value="{'novelName':?0}",fields="{'novelName':1}")
    Page<Novels> findByNovelNameLike(String name, Pageable pageable);
    Page<Novels> findByNovelCopywritingLike(String name, Pageable pageable);
    Page<Novels> findByAuthorNameLike(String name, Pageable pageable);

}
