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
	
	public boolean save(InputStream is, Source source) {
		return dao.save(is,source);
	}
}
