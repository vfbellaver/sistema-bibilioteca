
package bibliotecaTSI.DataModel;

import com.towel.el.annotation.Resolvable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
    @Resolvable(colName = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Resolvable(colName = "Titulo")
    private String Titulo;
    @Resolvable(colName = "Autor")
    private String Autor;
    @Resolvable(colName = "Edicao")
    private String Edicao;
    @Resolvable(colName = "Ano")
    private Integer Ano;
    @Resolvable(colName = "Categoria")
    private String Categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return Titulo;
    }

    public void setNome(String Nome) {
        this.Titulo = Nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        this.Ano = ano;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
 
    
    
}
