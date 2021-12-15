package com.back.ThomasGregCrud.Persistence;

import com.back.ThomasGregCrud.Domain.Archive;
import com.back.ThomasGregCrud.Domain.Repository.ArchiveRepository;
import com.back.ThomasGregCrud.Persistence.CRUD.ArchivoCRUDRepository;
import com.back.ThomasGregCrud.Persistence.Entity.Archivo;
import com.back.ThomasGregCrud.Persistence.Mapper.ArchiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArchivoRepository implements ArchiveRepository {

    @Autowired
    private ArchivoCRUDRepository archivoCRUDRepository;

    @Autowired
    private ArchiveMapper archiveMapper;

    @Override
    public List<Archive> getAll() {
        List<Archivo> ListEstructuraCargueMovimiento = (List<Archivo>) archivoCRUDRepository.findAll();
        return archiveMapper.toListArchive(ListEstructuraCargueMovimiento);
    }

    @Override
    public Optional<Archive> getRegister(int id) {
        return archivoCRUDRepository.findById(id).map(Archivo -> archiveMapper.toArchive(Archivo));
    }

    @Override
    public Archive saveRegister(Archive archive) {
        Archivo archivo = archiveMapper.toArchivo(archive);
        return archiveMapper.toArchive(archivoCRUDRepository.save(archivo));
    }
    @Override
    public void delete(int archiveId) {
        archivoCRUDRepository.deleteById(archiveId);
    }
}
