package com.example.yaya.book.dao;
import com.example.yaya.book.model.Novels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class NovelsDao {
    @Autowired
    private NovelsRepository novelsRepository;

    public NovelsDao(NovelsRepository novelsRepository) {
        this.novelsRepository = novelsRepository;
    }

    public Novels insertNovelsData(Novels book) {
        return novelsRepository.insert(book);
    }

    public Collection<Novels> getAllNovelsInformation() {
        return novelsRepository.findAll();
    }

    public Novels getNovelsInformationById(String id) {
        return novelsRepository.findByNovelId(id);
    }

    public Novels updateNovelsUsingId(String id, Novels book) {
        Optional<Novels> findPersonQuery = novelsRepository.findById(id);
        Novels bookValues = findPersonQuery.get();
        //bookValues.setId(Novels.getId());
        return novelsRepository.save(bookValues);
    }

    public void deleteNovelsUsingId(String id) {
        try {
            novelsRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public Collection<Novels> findByNovelNameLike(String name, Pageable pageable) {
        return novelsRepository.findByNovelNameLike(name, pageable).getContent();
    }
    public Collection<Novels> findByNovelCopywritingLike(String name, Pageable pageable) {
        return novelsRepository.findByNovelCopywritingLike(name, pageable).getContent();
    }
    public Collection<Novels> findByAuthorNameLike(String name, Pageable pageable) {
        return novelsRepository.findByAuthorNameLike(name, pageable).getContent();
    }
}

