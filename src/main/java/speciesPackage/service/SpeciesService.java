package speciesPackage.service;

import speciesPackage.data.Species;

import java.util.List;

public interface SpeciesService {

    List<Species> getAllSpecies();
    Species getSpecies(String name);
    void addSpecies(Species species);
    void updateSpecies(String name, Species species);
    void deleteSpecies(String name);
}
