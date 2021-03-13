package com.app;

import java.util.List;

import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.datasource.JKDataAccessFactory;
import com.jk.util.JK;

public class App {

	private static Integer id;

	public static void main(String[] args) {
		JKObjectDataAccess da = JKDataAccessFactory.getObjectDataAccess();

		insert(da);
		find(da);
		update(da);
		getAll(da);
		delete(da);
	}

	private static void insert(JKObjectDataAccess da) {
		Model model = new Model();
		model.setNationalId("12345678");
		model.setName("Jalal");
		model.setAddress("Reno, NV");
		model.setEmail("kiswanij@gmail.com");
		id= da.insert(model).getId();
	}

	private static void find(JKObjectDataAccess da) {
		Model model = da.find(Model.class, id);
		JK.printBlock(model);
	}

	private static void update(JKObjectDataAccess da) {
		Model model = da.find(Model.class, id);
		model.setName("Updated " + model.getName());
		da.update(model);
	}

	private static void getAll(JKObjectDataAccess da) {
		List<Model> list = da.getList(Model.class);
		for (Model model : list) {
			JK.printBlock(model);
		}
	}

	private static void delete(JKObjectDataAccess da) {
		da.delete(Model.class, id);
	}

}
