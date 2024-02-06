package mainApplication.estrutura.api;

import java.util.List;

import mainApplication.estrutura.dto.Dto;
import mainApplication.estrutura.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/estrutura", produces = MediaType.APPLICATION_JSON_VALUE)
public class Api {


    @Autowired
    private Facade facade;

    @PostMapping
    @ResponseBody()
    @ResponseStatus(HttpStatus.CREATED)
    public Dto criar(@RequestBody Dto dto) {


        return facade.criar(dto);
    }



    @PutMapping("/{desenvolverId}")
    @ResponseBody
    public Dto atualizar (@PathVariable("desenvolverId") Long desenvolverId, @RequestBody Dto dto) {


        return facade.atualizar(dto, desenvolverId);
    }

    @GetMapping
    @ResponseBody

    public List<Dto>gatAll(){

        return facade.getAll();
    }

    @DeleteMapping("/{desenvolverId}")
    @ResponseBody

    public String deletar (@PathVariable("desenvolverId") Long desenvolverId) {

        return facade.delete(desenvolverId);
    }
}
