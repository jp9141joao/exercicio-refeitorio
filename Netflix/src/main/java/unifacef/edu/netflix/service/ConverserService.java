package unifacef.edu.netflix.service;

import org.springframework.stereotype.Service;
import unifacef.edu.netflix.model.dto.FilmeDTO;
import unifacef.edu.netflix.model.entity.FilmeEntity;

@Service
public class ConverserService {

    public FilmeDTO converteFilmeEntity(FilmeEntity filmeEntity){
        if (filmeEntity == null){
            return null;
        }

        FilmeDTO aux = new FilmeDTO();
        aux.setId(filmeEntity.getId());
        aux.setNome(filmeEntity.getNome());
        aux.setNota(filmeEntity.getNota());
        aux.setAnoLancamento(filmeEntity.getAnoLancamento());
        return aux;
    }

    public FilmeEntity converteFilmeDTO(FilmeDTO filmeDTO){
        if (filmeDTO == null){
            return null;
        }
        FilmeEntity aux = new FilmeEntity();
        aux.setId(filmeDTO.getId());
        aux.setNome(filmeDTO.getNome());
        aux.setNota(filmeDTO.getNota());
        aux.setAnoLancamento(filmeDTO.getAnoLancamento());
        return aux;
    }
}
