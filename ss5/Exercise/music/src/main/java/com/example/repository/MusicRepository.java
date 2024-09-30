package com.example.repository;

import com.example.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;
@Repository
public class MusicRepository implements IMusicRepository{
    @Override
    public List<Music> findAll() {
        List<Music> music = BaseRepository.entityManager.createQuery("select m from Music m",Music.class).getResultList();
        return music;
    }

    @Override
    public void create(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Music music = BaseRepository.entityManager.createQuery("select m from Music m where id = ?1",Music.class).setParameter(1,id).getSingleResult();
        BaseRepository.entityManager.remove(music);
        entityTransaction.commit();

    }

    @Override
    public Music findById(Integer id) {
        Music music = BaseRepository.entityManager.createQuery("select m from Music m where id = ?1",Music.class).setParameter(1,id).getSingleResult();
        return music;
    }

    @Override
    public void edit(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();
    }
}
