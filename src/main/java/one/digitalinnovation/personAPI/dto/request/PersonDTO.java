package one.digitalinnovation.personAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

//objeto responsavel por receber todos objetos de entrada
//recebera os dados
//valida na propria requisicao de http
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;
    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @CPF
    private String cpf;



    private LocalDate birthDate;
    public void setBirthDate(String birthDate) {
        DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.birthDate = LocalDate.parse(birthDate,dateTimeFormater);
    }



    //diz para fazer a validacao atraves dos atributos do phone
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
