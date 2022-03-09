package modelo.entities;

public class Livros {
    private String NomeDoLivro;
    private String NomeDoAutor;
    private String Sexo;
    private Integer NumeroDePaginas;
    private String NomeDaEditora;
    private Double ValorDoLivro;
    private String UF;
    private Integer AnoPublicacao;

    public Livros(){

    }
    public Livros(String NomeDoLivro, String NomeDoAutor, String Sexo, Integer NumeroDePaginas, String NomeDaEditora,
            Double ValorDoLivro, String UF, Integer AnoPublicacao) {
        this.NomeDoLivro = NomeDoLivro;
        this.NomeDoAutor = NomeDoAutor;
        this.Sexo = Sexo;
        this.NumeroDePaginas = NumeroDePaginas;
        this.NomeDaEditora = NomeDaEditora;
        this.ValorDoLivro = ValorDoLivro;
        this.UF = UF;
        this.AnoPublicacao = AnoPublicacao;
    }

    public String getNomeDoLivro() {
        return NomeDoLivro;
    }
    public void setNomeDoLivro(String NomeDoLivro) {
        this.NomeDoLivro = NomeDoLivro;
    }
    public String getNomeDoAutor() {
        return NomeDoAutor;
    }
    public void setNomeDoAutor(String NomeDoAutor) {
        this.NomeDoAutor = NomeDoAutor;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public Integer getNumeroDePaginas() {
        return NumeroDePaginas;
    }
    public void setNumeroDePaginas(Integer NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }
    public String getNomeDaEditora() {
        return NomeDaEditora;
    }
    public void setNomeDaEditora(String NomeDaEditora) {
        this.NomeDaEditora = NomeDaEditora;
    }
    public Double getValorDoLivro() {
        return ValorDoLivro;
    }
    public void setValorDoLivro(Double ValorDoLivro) {
        this.ValorDoLivro = ValorDoLivro;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String UF) {
        this.UF = UF;
    }
    public Integer getAnoPublicacao() {
        return AnoPublicacao;
    }
    public void setAnoPublicacao(Integer AnoPublicacao) {
        this.AnoPublicacao = AnoPublicacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((AnoPublicacao == null) ? 0 : AnoPublicacao.hashCode());
        result = prime * result + ((NomeDaEditora == null) ? 0 : NomeDaEditora.hashCode());
        result = prime * result + ((NomeDoAutor == null) ? 0 : NomeDoAutor.hashCode());
        result = prime * result + ((NomeDoLivro == null) ? 0 : NomeDoLivro.hashCode());
        result = prime * result + ((NumeroDePaginas == null) ? 0 : NumeroDePaginas.hashCode());
        result = prime * result + ((Sexo == null) ? 0 : Sexo.hashCode());
        result = prime * result + ((UF == null) ? 0 : UF.hashCode());
        result = prime * result + ((ValorDoLivro == null) ? 0 : ValorDoLivro.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livros other = (Livros) obj;
        if (AnoPublicacao == null) {
            if (other.AnoPublicacao != null)
                return false;
        } else if (!AnoPublicacao.equals(other.AnoPublicacao))
            return false;
        if (NomeDaEditora == null) {
            if (other.NomeDaEditora != null)
                return false;
        } else if (!NomeDaEditora.equals(other.NomeDaEditora))
            return false;
        if (NomeDoAutor == null) {
            if (other.NomeDoAutor != null)
                return false;
        } else if (!NomeDoAutor.equals(other.NomeDoAutor))
            return false;
        if (NomeDoLivro == null) {
            if (other.NomeDoLivro != null)
                return false;
        } else if (!NomeDoLivro.equals(other.NomeDoLivro))
            return false;
        if (NumeroDePaginas == null) {
            if (other.NumeroDePaginas != null)
                return false;
        } else if (!NumeroDePaginas.equals(other.NumeroDePaginas))
            return false;
        if (Sexo == null) {
            if (other.Sexo != null)
                return false;
        } else if (!Sexo.equals(other.Sexo))
            return false;
        if (UF == null) {
            if (other.UF != null)
                return false;
        } else if (!UF.equals(other.UF))
            return false;
        if (ValorDoLivro == null) {
            if (other.ValorDoLivro != null)
                return false;
        } else if (!ValorDoLivro.equals(other.ValorDoLivro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livros [AnoPublicacao=" + AnoPublicacao + ", NomeDaEditora=" + NomeDaEditora + ", NomeDoAutor="
                + NomeDoAutor + ", NomeDoLivro=" + NomeDoLivro + ", NumeroDePaginas=" + NumeroDePaginas + ", Sexo="
                + Sexo + ", UF=" + UF + ", ValorDoLivro=" + ValorDoLivro + "]";
    }
         
}
