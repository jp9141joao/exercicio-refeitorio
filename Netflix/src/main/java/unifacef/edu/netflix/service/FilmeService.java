package unifacef.edu.netflix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import unifacef.edu.netflix.model.dto.FilmeDTO;
import unifacef.edu.netflix.model.entity.DiretorEntity;
import unifacef.edu.netflix.model.entity.FilmeEntity;
import unifacef.edu.netflix.model.repository.DiretorRepository;
import unifacef.edu.netflix.model.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository injecaoFilme;
    @Autowired
    DiretorRepository injecaoDiretor;
    @Autowired
    ConversorService converser;
    public FilmeDTO insere(FilmeDTO filmeDTO){

        DiretorEntity diretorEntity = converser.converteDiretorDTO(filmeDTO.getDiretor());
        diretorEntity = injecaoDiretor.save(diretorEntity);

        FilmeEntity auxEntity = converser.converteFilmeDTO(filmeDTO);
        auxEntity.setDiretor(diretorEntity);
        System.out.println(auxEntity.toString());
        FilmeEntity novoEntity = injecaoFilme.save(auxEntity);

        return converser.converteFilmeEntity(novoEntity);
    }

    public List<FilmeDTO> consultaTodos(){
        List<FilmeEntity> todos = injecaoFilme.findAll();
        return todos.stream().map(converser::converteFilmeEntity).collect(Collectors.toList());
    }

    public FilmeDTO consultaPorId(Long id){
        Optional<FilmeEntity> optional = injecaoFilme.findById(id);
        if (optional.isPresent()) { 
            return converser.converteFilmeEntity(optional.get());
        }
        return null; 

    public String remove(Long id){

        if (injecaoFilme.existsById(id)){ 
            injecaoFilme.deleteById(id);
            return "Remoção realizada com sucesso";
        }
        return "Nenhum filme foi removido";
    }
    public List<FilmeDTO> aumentaNotas(){
        List<FilmeEntity> filmes = injecaoFilme.findAll();
        for(FilmeEntity filme: filmes){
            if (filme.getNota() + 0.5 <= 10) {
                filme.setNota(filme.getNota() + 0.50f); 
            }
        }

        List<FilmeEntity> filmesEntity = injecaoFilme.saveAll(filmes);
        return filmesEntity.stream().map(converser::converteFilmeEntity).collect(Collectors.toList()); 
    }

    public FilmeDTO atualizaPorId(Long id, FilmeDTO filme){
        if (injecaoFilme.existsById(id)){
            filme.setId(id);

            FilmeEntity filmeEntity = converser.converteFilmeDTO(filme);
            return converser.converteFilmeEntity(injecaoFilme.save(filmeEntity));
        }
        else return null;
    }

}
