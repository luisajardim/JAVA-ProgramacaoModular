package br.lpm.business;

import java.time.LocalDateTime;

public class ServicoPet extends Item{
        private ServicoPetShop servicoPetShop;
        private LocalDateTime horario;
        private String responsavel;

public ServicoPet(ServicoPetShop servicoPetShop, LocalDateTime horario, String responsavel, float valor){
    super(valor);
    this.setServicoPetShop(servicoPetShop);
    this.setHorario(horario);
    this.setResponsavel(responsavel);
}       

public ServicoPetShop getServicoPetShop() {
    return servicoPetShop;
}

public LocalDateTime getHorario() {
    return horario;
}

public String getResponsavel() {
    return responsavel;
}

public void setServicoPetShop(ServicoPetShop servicoPetShop) {
    this.servicoPetShop = servicoPetShop;
}

public void setHorario(LocalDateTime horario) {
    this.horario = horario;
}

public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
}

@Override
public String getDescricao() {
    return "ServicoPet [valor=" + valor + ", servicoPetShop=" + servicoPetShop + ", horario=" + horario
            + ", responsavel=" + responsavel + "]";
}

}