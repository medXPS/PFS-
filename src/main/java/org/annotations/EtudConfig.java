package org.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EtudConfig {
    @Bean(name = "etudiant")
    public Etudiant etudiant() {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("zaid ");
        etudiant.setAge(24);
        return etudiant;
}
}
