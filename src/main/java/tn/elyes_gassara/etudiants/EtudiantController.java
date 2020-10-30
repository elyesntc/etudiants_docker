package tn.elyes_gassara.etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EtudiantController {
    @Autowired
    private EtudiantService service;

    @GetMapping("/Etudiants")
    public List<Etudiant> getEtudiants(){
        return service.getEtudiants();
    }

    @PostMapping("/Etudiants/ajouter")
    public void ajouterEtudiant(@RequestBody Etudiant etudiant){
        service.ajouterEtudiant(etudiant);
    }

    @PutMapping("/Etudiants/{id}/editer")
    public void modifierEtudiant(@PathVariable("id") Integer id,@RequestBody Etudiant etudiant){
        service.modifierEtudiant(etudiant);
    }

    @DeleteMapping("/Etudiants/{id}/supprimer")
    public void supprimerEtudiant(@PathVariable("id") Integer id){
        service.supprimerEtudiant(id);
    }

}
