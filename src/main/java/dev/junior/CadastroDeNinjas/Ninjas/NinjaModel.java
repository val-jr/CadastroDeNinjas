package dev.junior.CadastroDeNinjas.Ninjas;

import dev.junior.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column (unique = true, name = "email")
    private String email;

    @Column (name = "idade")
    private int idade;

    // @ManyToOne - Vários Ninjas em uma missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key | chave estrangeira
    private MissoesModel missoes;
}
