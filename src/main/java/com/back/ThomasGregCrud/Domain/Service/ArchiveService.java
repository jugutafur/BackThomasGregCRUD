package com.back.ThomasGregCrud.Domain.Service;

import com.back.ThomasGregCrud.Domain.Archive;
import com.back.ThomasGregCrud.Domain.Repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchiveService {

    @Autowired
    private ArchiveRepository archiveRepository;

    public List<Archive> getAll(){return archiveRepository.getAll(); }

    public Optional<Archive> getRegister(int id){
        return archiveRepository.getRegister(id); }

    public Archive saveRegister(Archive archive){
        return archiveRepository.saveRegister(archive); }

    public boolean delete(int archiveId) {
        return getRegister(archiveId).map(archive -> {
            archiveRepository.delete(archiveId);
            return true;
        }).orElse(false);
    }
}
