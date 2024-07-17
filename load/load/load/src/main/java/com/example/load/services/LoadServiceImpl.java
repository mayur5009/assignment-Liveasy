package com.example.load.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.load.entities.LoadEntity;
import com.example.load.repositories.LoadDao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LoadServiceImpl implements LoadService {

	
	@Autowired
	private LoadDao loadDao;
	
	
	@Override
	public List<LoadEntity> getAll() {
		
		return loadDao.findAll();
	}

	@Override
	public LoadEntity getById(Integer id) {
		// TODO Auto-generated method stub
		return loadDao.findById(id).get();
	}

	@Override
	public LoadEntity upadateLoad(LoadEntity load) {
		
		LoadEntity load2 = loadDao.findById(load.getShipperId()).get();
		load2.setDate(load.getDate());
		load2.setLoadingPoint(load.getLoadingPoint());
		load2.setNoOfTrucks(load.getNoOfTrucks());
		load2.setProductType(load.getProductType());
		load2.setUnloadingPoint(load.getUnloadingPoint());
		load2.setWeight(load.getWeight());
		
		return loadDao.save(load2);
	}

	@Override
	public String deleteLoad(Integer id) {
		// TODO Auto-generated method stub
		
		if(loadDao.findById(id).get() != null) {
			return "Id not Exist";
		}
		else {
			loadDao.deleteById(id);
			return "Load deleted by id = "+id;
		}
	}

	@Override
	public LoadEntity addLoad(LoadEntity load) {
		// TODO Auto-generated method stub
		return loadDao.save(load);
	}

}
