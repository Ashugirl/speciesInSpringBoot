package speciesPackage.controllers;

import org.springframework.web.bind.annotation.*;
import speciesPackage.data.Species;
import speciesPackage.service.SpeciesService;

import java.util.List;

@RestController
public class SpeciesController {

    private SpeciesService speciesService;

    public SpeciesController(SpeciesService speciesService) {
        this.speciesService = speciesService;
    }

    @GetMapping("/species")
    public List<Species> getAllSpecies(){

        return speciesService.getAllSpecies();
    }

    @GetMapping("/species/{name}")
    public Species getSpecies(@PathVariable String name){
        return speciesService.getSpecies(name);
    }

    @PostMapping(value = "/species")
    public void addSpecies(@RequestBody Species species){
        speciesService.addSpecies(species);
    }

    @PutMapping (value = "/species/{name}")
    public void updateSpecies(@RequestBody Species species, @PathVariable String name){
        speciesService.updateSpecies(name, species);
    }
    @DeleteMapping("/species/{name}")
    public void deleteSpecies(@PathVariable String name){
        speciesService.deleteSpecies(name);
    }

}
