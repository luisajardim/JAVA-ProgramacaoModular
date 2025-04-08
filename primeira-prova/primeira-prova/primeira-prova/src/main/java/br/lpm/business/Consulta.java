package br.lpm.business;

import java.time.LocalDateTime;

public class Consulta extends Item{
    private LocalDateTime horario;
    private String nomeVeterinario;
    private Animais animal;
    


public Consulta(LocalDateTime horario, String nomeVeterinario, Animais animal, float valor){
    super(valor);
    this.setHorario(horario);
    this.setNomeVeterinario(nomeVeterinario);
    this.setAnimal(animal);
}


public void setAnimal(Animais animal) {
this.animal=animal;
}

public void setNomeVeterinario(String nomeVeterinario) {
    this.nomeVeterinario=nomeVeterinario;
}

public void setHorario(LocalDateTime horario) {
    this.horario=horario;
}

@Override
public String getDescricao() {
 return "Nome veterinario:" + nomeVeterinario + "Data:" + horario + "Animal: " + animal;
}
}