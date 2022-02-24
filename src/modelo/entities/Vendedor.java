package modelo.entities;

import java.sql.Date;

public class Vendedor extends Departamento{
    private String Email;
    private Date bithDate;
    private Double Salario;

    private Departamento departamento;
    
    public Vendedor(){
        super();
    }
    
    public Vendedor(Integer id, String nome, String email, Date bithDate, Double salario, Departamento departamento) {
        super(id, nome);
        Email = email;
        this.bithDate = bithDate;
        Salario = salario;
        this.departamento = departamento;
    }


    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public Date getBithDate() {
        return bithDate;
    }
    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }
    public Double getSalario() {
        return Salario;
    }
    public void setSalario(Double salario) {
        Salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((Email == null) ? 0 : Email.hashCode());
        result = prime * result + ((Salario == null) ? 0 : Salario.hashCode());
        result = prime * result + ((bithDate == null) ? 0 : bithDate.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vendedor other = (Vendedor) obj;
        if (Email == null) {
            if (other.Email != null)
                return false;
        } else if (!Email.equals(other.Email))
            return false;
        if (Salario == null) {
            if (other.Salario != null)
                return false;
        } else if (!Salario.equals(other.Salario))
            return false;
        if (bithDate == null) {
            if (other.bithDate != null)
                return false;
        } else if (!bithDate.equals(other.bithDate))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Vendedor [Email=" + Email + ", Salario=" + Salario + ", bithDate=" + bithDate + "]";
    }
    
      
    
    
}
