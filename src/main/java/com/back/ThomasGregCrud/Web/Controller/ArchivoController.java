package com.back.ThomasGregCrud.Web.Controller;

import com.back.ThomasGregCrud.Domain.Archive;
import com.back.ThomasGregCrud.Domain.Service.ArchiveService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consulta")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ArchivoController {

    @Autowired
    private ArchiveService archiveService;

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Archive> getAll() {return archiveService.getAll(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Archive> getRegister(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return archiveService.getRegister(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Archive saveRegister(@RequestBody Archive archive){
        return archiveService.saveRegister(archive);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int archiveId) {
        return archiveService.delete(archiveId);
    }
}
