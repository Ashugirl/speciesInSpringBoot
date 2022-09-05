package speciesPackage.service;

import org.springframework.stereotype.Service;
import speciesPackage.data.Species;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SpeciesServiceImpl implements SpeciesService {

    private List<Species> speciesList = new ArrayList<>();

    public SpeciesServiceImpl() {
        speciesList.add(new Species("cat", 18, false));
        speciesList.add(new Species("dog", 16, false));
        speciesList.add(new Species("dodo", 35, true));
        speciesList.add(new Species("elephant", 40, false));


    }
    @Override
    public List<Species> getAllSpecies(){
        return speciesList;
    }

    @Override
    public Species getSpecies(String name) {
        return speciesList.stream().filter(species -> species.getName().equals(name)).findFirst().get();
    }

    @Override
    public void addSpecies(Species species) {
        speciesList.add(species);
    }

    @Override
    public void updateSpecies(String name, Species species){
        for(int i = 0; i < speciesList.size(); i++){
            Species s =speciesList.get(i);
            if (s.getName().equals(name)){
                speciesList.set(i, species);
                return;
            }
        }
    }

    @Override
    public void deleteSpecies(String name){
        speciesList.removeIf(species -> species.getName().equals(name));
    }





}

