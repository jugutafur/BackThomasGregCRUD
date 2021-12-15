package com.back.ThomasGregCrud.Persistence.Mapper;

import com.back.ThomasGregCrud.Domain.Archive;
import com.back.ThomasGregCrud.Persistence.Entity.Archivo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArchiveMapper {

    @Mappings({
            @Mapping(source = "empresa" , target = "company"),
            @Mapping(source = "caja" , target = "box"),
            @Mapping(source = "bolsa" , target = "bag"),
            @Mapping(source = "carpeta" , target = "folder"),
            @Mapping(source = "documento" , target = "document")
    })
    Archive toArchive(Archivo archivo);
    List<Archive> toListArchive(List<Archivo> archivos);

    @InheritInverseConfiguration
    Archivo toArchivo(Archive archive);
}

