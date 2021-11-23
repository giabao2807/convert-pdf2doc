package model.bo;

import java.io.InputStream;
import java.util.List;

import model.bean.Source;
import model.dao.SourceDao;

public class SourceBo {
	private SourceDao dao;
	
	public SourceBo() {
		dao = new SourceDao();
	}
	
	public List<Source> getAll(){
		return dao.getAll();
	}
	
	public boolean save(String filename,InputStream is) {
		return dao.save(filename,is);
	}
}
