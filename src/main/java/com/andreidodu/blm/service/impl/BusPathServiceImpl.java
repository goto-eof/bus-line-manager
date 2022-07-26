package com.andreidodu.blm.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.BusPathDB;
import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.input.insert.BusPathInsertInput;
import com.andreidodu.blm.mapper.BusPathMapper;
import com.andreidodu.blm.repository.BusPathDao;
import com.andreidodu.blm.service.BusPathService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BusPathServiceImpl
		extends CommonServiceImpl<BusPath, BusPathDB, BusPathDao, BusPathInsertInput, Long, BusPathMapper>
		implements BusPathService {

	@Autowired
	private BusPathDao busPathDao;

	public BusPathServiceImpl() {
		super(BusPath.class, BusPathDB.class);
	}

	public BusPathDao getDao() {
		return this.busPathDao;
	}

	public boolean delete(Long id) {
		Optional<BusPathDB> dbOpt = this.getDao().findById(id);
		if (dbOpt.isPresent()) {
			this.getDao().deleteById(dbOpt.get().getId());
			return true;
		}
		return false;
	}

}
