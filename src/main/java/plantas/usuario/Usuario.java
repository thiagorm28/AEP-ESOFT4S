package plantas.usuario;

import plantas.BaseEntity;
import plantas.plantasUsuario.PlantasUsuario;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends BaseEntity {

    private String email;
    private String nome;
    private String senha;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PlantasUsuario> plantacao = new ArrayList<PlantasUsuario>();

    public Usuario() {
        super();
    }

    public Usuario(String email, String senha) {
        super();
    }

    public Usuario(String email, String nome, String senha) {
        this();
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

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
        if (this.senha != null) {
            throw new RuntimeException("Sua senha já foi criada");
        } else {
            this.senha = senha;
            System.out.println("Senha criada com sucesso");
        }
    }

    public void atualizarSenha (String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
        } else {
            throw new RuntimeException("Essa senha não corresponde a sua senha atual");
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

    public void login (String email, String senha) {
        if (!this.email.equals(email) || !this.senha.equals(senha)) {
            throw new RuntimeException("Essa combinação de Email e senha não existe ou está incorreta");
        } else {
            System.out.println("Login efetuado com sucesso");
        }
    }

}
