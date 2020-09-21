package plantas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String email;
    private String nome;
    private String senha;
    private List<PlantasUsuario> plantacao = new ArrayList<PlantasUsuario>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        if (this.senha == null) {
            System.out.println("Crie sua primeira senha: ");
            this.senha = senha;
        } else {
            throw new RuntimeException("Sua senha já foi criada");
        }
    }

    public String getPlantacao() {
        String listaDePlantas = "";
        for (PlantasUsuario p: plantacao) {
            if(p.equals(plantacao.get(plantacao.size()-1))) {
                listaDePlantas += p + ".";
            } else {
                listaDePlantas += p + ", ";
            }
        }
        return listaDePlantas;
    }

    public void addPlantacao(PlantasUsuario novaPlanta) {
        this.plantacao.add(novaPlanta);
    }
}
