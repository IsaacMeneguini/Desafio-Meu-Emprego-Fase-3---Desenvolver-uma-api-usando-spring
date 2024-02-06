package mainApplication.estrutura.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mainApplication.estrutura.dto.Dto;
import org.springframework.stereotype.Service;


@Service
public class Facade {

    private static final Map<Long, Dto> desenvolver = new HashMap<>();

    public Dto criar(Dto dto) {
        Long proximoId = desenvolver.keySet().size() + 1L;
        dto.setId(proximoId); while
        (desenvolver.containsKey(proximoId)) {
            proximoId++;
        }

        dto.setId(proximoId);
        desenvolver.put(proximoId, dto);
        return dto;

    }

    public Dto atualizar(Dto dto, Long desenvolverId) {

        desenvolver.put(desenvolverId, dto);
        return dto;

    }

    public Dto getById (Long desenvolverId) {

        return desenvolver.get(desenvolverId);

    }

    public List <Dto> getAll (){

        return new ArrayList<>(desenvolver.values());
    }

    public String delete (Long desenvolverId) {
        desenvolver.remove(desenvolverId);
        return "Deleted";

    }
}

