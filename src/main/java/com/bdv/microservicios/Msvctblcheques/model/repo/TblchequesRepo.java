package com.bdv.microservicios.Msvctblcheques.model.repo;

import com.bdv.microservicios.Msvctblcheques.model.entities.Tblcheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TblchequesRepo extends JpaRepository<Tblcheque,Long> {

    @Query(value="SELECT ID,FECHA_CONTABLE as Fechacontable," +
            "COD_BANCO as Codbanco," +
            "AGENCIA," +
            "CAJERO," +
            "DIN," +
            "SERIAL," +
            "BANCO," +
            "OFICINA," +
            "DV," +
            "CUENTA," +
            "TRAN_CODE as Trancode," +
            "MONTO," +
            "FRONT," +
            "REAR," +
            "CORREGIDO," +
            "TRANSMITIDO," +
            "CUENTA_DEPO as Cuentadepo," +
            "SERIALP as Serialp," +
            "DNA," +
            "ESTATUS," +
            "AUXILIAR1," +
            "AUXILIAR2," +
            "AUXILIAR3," +
            "AUXILIAR4," +
            "AUXILIAR5," +
            "TRANSMITIDO_ORACLE " +
            "FROM " +
            "TBL_CHEQUES " +
            "WHERE " +
            "BANCO=?1 and OFICINA=?2 and DV=?3 and CUENTA=?4 and SERIAL=?5",nativeQuery = true)
    Optional<Tblcheque> findTblCheque(String banco,String oficina,String dv,String cuenta,String serial);


}
