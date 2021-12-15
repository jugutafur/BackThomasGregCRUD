package com.back.ThomasGregCrud.Persistence.CRUD;

import com.back.ThomasGregCrud.Domain.Archive;
import com.back.ThomasGregCrud.Persistence.Entity.Archivo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArchivoCRUDRepository extends CrudRepository<Archivo, Integer> {
}
