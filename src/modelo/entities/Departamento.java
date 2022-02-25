package modelo.entities;

public class Departamento{
    private Integer Id;
    private String Nome;
    
    public Departamento() {
    }
    public Departamento(Integer id, String nome) {
        Id = id;
        Nome = nome;
    }

    public Integer getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
       
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
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
        Departamento other = (Departamento) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Departamento: Id:" + Id + ", Nome:" + Nome;
    }
    public void Update() {
        // TODO Auto-generated method stub
        
    }
    
}