package one.digitalinnovation.personAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personAPI.enums.PhoneType;

import javax.persistence.*;

//indica que e uma entidade entao precisa de chave primaria
//como sera gravado no banco de dados
//insere construtores
//insere getter e setter

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Phone {

    //                    ANOTACOES JPA

    //diz que tem que ser id
    //incrementa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //indica que e enum e o tipo dele
    //cria uma regra que o dado nao pode ser null
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    //cria uma regra que o dado nao pode ser null
    @Column(nullable = false)
    private String number;


}
