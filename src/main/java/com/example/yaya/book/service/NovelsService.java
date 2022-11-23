package com.example.yaya.book.service;

import com.example.yaya.book.dao.NovelsDao;
import com.example.yaya.book.model.Novels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class NovelsService {
    @Autowired
    private NovelsDao novelsdao;

    public NovelsService(NovelsDao novelsdao) {
        this.novelsdao = novelsdao;
    }

    public Novels insertNovelsData(Novels book) {
        return novelsdao.insertNovelsData(book);
    }

    public Collection<Novels> getAllNovelsInformation() {
        return novelsdao.getAllNovelsInformation();
    }

    public Novels getNovelsInformationUsingId(String id) {
        return novelsdao.getNovelsInformationById(id);
    }

    public void updateNovelsUsingId(String id, Novels book) {
        novelsdao.updateNovelsUsingId(id, book);
    }

    public void deleteNovelsUsingId(String id) {
        novelsdao.deleteNovelsUsingId(id);
    }

    public Collection<Novels> findByNovelNameLike(int page, int rows, String name)  {
        PageRequest pageRequest = PageRequest.of(page-1,rows);
        return novelsdao.findByNovelNameLike(name,pageRequest);
    }

}
