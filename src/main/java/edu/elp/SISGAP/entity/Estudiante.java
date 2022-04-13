package edu.elp.SISGAP.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name ="estudiante")
@PrimaryKeyJoinColumn (referencedColumnName = "idpersona")
public class Estudiante extends Persona {

    @Column (name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 8)
    private  String serie;

    @Column (name = "estado_egreso", length = 5)
    private String estadoEgreso;

    public Estudiante(Long idpersona) {
        super(idpersona);
    }
}
