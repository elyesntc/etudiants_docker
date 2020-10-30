package tn.elyes_gassara.etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository repository;
    public List<Etudiant> getEtudiants(){
        return repository.findAll();
    }
    public void ajouterEtudiant(Etudiant etudiant){
        repository.save(etudiant);
    }
    public void modifierEtudiant(Etudiant etudiant){
        repository.save(etudiant);
    }
    public void supprimerEtudiant( Integer id){
        repository.deleteById(id);
    }
}
