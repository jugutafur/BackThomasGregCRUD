package com.back.ThomasGregCrud.Domain.Repository;

import com.back.ThomasGregCrud.Domain.Archive;

import java.util.List;
import java.util.Optional;

public interface ArchiveRepository {
    List<Archive> getAll();
    Optional<Archive> getRegister(int id);
    Archive saveRegister(Archive archive);
}
