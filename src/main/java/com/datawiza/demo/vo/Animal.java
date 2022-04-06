package com.datawiza.demo.vo;


public class Animal {
    private String name;
    private String latinName;
    private String alias;
    private String[] distributions;
    private Species species;

    public Animal() {
        System.out.println("[+] invoke Animal.Animal");
    }

    public String getName() {
        System.out.println("[+] invoke Animal.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] invoke Animal.setName");
        this.name = name;
    }

    public Species getSpecies() {
        System.out.println("[+] invoke Animal.species");
        return species;
    }

    public void setSpecies(Species species) {
        System.out.println("[+] invoke Animal.setSpecies");
        this.species = species;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String[] getDistributions() {
        return distributions;
    }

    public void setDistributions(String[] distributions) {
        this.distributions = distributions;
    }
}
