public class Animal {
  // attributes
  private String species, name;

  Animal(String initialName, String initialSpecies)
  {
    this.setName(initialName);;
    this.setSpecies(initialSpecies);
  }

  public String getSpecies(){
    return species;
  }

  public String getName(){
    return name;
  }

  public void setSpecies(String species){
    this.species = species;
  }

  public void setName(String name){
    this.name = name;
  }



  }