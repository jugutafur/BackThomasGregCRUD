package com.back.ThomasGregCrud.Persistence.CRUD;

import com.back.ThomasGregCrud.Persistence.Entity.Archivo;
import org.springframework.data.repository.CrudRepository;

public interface ArchivoCRUDRepository extends CrudRepository<Archivo, Integer> {
}
