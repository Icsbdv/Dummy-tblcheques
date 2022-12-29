package com.bdv.microservicios.Msvctblcheques.services;

import com.bdv.microservicios.Msvctblcheques.model.entities.Tblcheque;
import com.bdv.microservicios.Msvctblcheques.model.repo.TblchequesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TblChequesServiceImpl implements TblChequesService{

    @Autowired
    TblchequesRepo tblchequesRepo;


    @Override
    public Optional<Tblcheque> consultarTblCheque(String banco, String oficina, String dv, String cuenta, String serial) {
        return tblchequesRepo.findTblCheque(banco,oficina,dv,cuenta,serial);
    }

    @Override
    public Tblcheque guardarTblCheque(Tblcheque tblcheque) {
        return tblcheque;
    }
}
