package org.annotations;

public class Etudiant {
    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Etudiant [nom=" + nom + ", age=" + age +"]";
}

}
