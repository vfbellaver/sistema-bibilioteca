
package bibliotecaTSI.DataModel;

import com.towel.el.annotation.Resolvable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
   @Resolvable(colName= "Id") 
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   @Resolvable(colName = "Nome")
   private String Nome;
   @Resolvable(colName = "Nascimento")
   private String Nascimento;
   @Resolvable(colName = "CPF")
   private String CPF;
   @Resolvable(colName = "Fone")
   private String Fone;
   @Resolvable(colName = "Email")
   private String Email;
   @Resolvable(colName = "Rua")
   private String rua;
   @Resolvable(colName = "Numero")
   private String num;
   @Resolvable(colName = "Bairro")
   private String bairro;
   @Resolvable(colName = "Cidade")
   private String cidade;
   

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
   
    
   
    
}
