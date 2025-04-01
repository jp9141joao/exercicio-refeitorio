package unifacef.edu.netflix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.netflix.model.dto.DiretorDTO;
import unifacef.edu.netflix.model.entity.DiretorEntity;
import unifacef.edu.netflix.model.repository.DiretorRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DiretorService {

    @Autowired
    DiretorRepository injecaoDiretor;
    @Autowired
    ConversorService injecaoConversor;

    public DiretorDTO insere(DiretorDTO diretorDTO){
        DiretorEntity diretorEntity = injecaoConversor.converteDiretorDTO(diretorDTO);
        diretorEntity = injecaoDiretor.save(diretorEntity);
        return injecaoConversor.converteDiretorEntity(diretorEntity);
    }

    public List<DiretorDTO> consultaTodos(){

        List<DiretorEntity> todos = injecaoDiretor.findAll();
        return todos.stream().map(injecaoConversor::converteDiretorEntity).collect(Collectors.toList());
    }

    public DiretorDTO consultaPorId(Long id){

        Optional<DiretorEntity> optional = injecaoDiretor.findById(id);
        if (optional.isPresent()) { 
            return injecaoConversor.converteDiretorEntity(optional.get());
        }
        return null;
    }

    public String remove(Long id){
  
        if (injecaoDiretor.existsById(id)){
            injecaoDiretor.deleteById(id);
            return "Remoção realizada com sucesso";
        }
        return "Nenhum diretor foi removido";
    }

    public DiretorDTO atualizaPorId(Long id, DiretorDTO diretor){
        if (injecaoDiretor.existsById(id)){
            diretor.setId(id); 

            DiretorEntity diretorEntity = injecaoConversor.converteDiretorDTO(diretor);

            return injecaoConversor.converteDiretorEntity(injecaoDiretor.save(diretorEntity));
        }
        else return null;
    }

    public List<DiretorDTO> nomeSpielberg(){
        List<DiretorEntity> diretores = injecaoDiretor.findAll();
        for(DiretorEntity diretor: diretores){
            diretor.setNome("Spielberg"); 
        }

        List<DiretorEntity> diretoresEntity = injecaoDiretor.saveAll(diretores);
        return diretoresEntity.stream().map(injecaoConversor::converteDiretorEntity).collect(Collectors.toList()); 
    }
}
