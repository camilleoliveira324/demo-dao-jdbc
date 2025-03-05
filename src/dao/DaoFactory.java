package dao;

import dao.impl.SellerDaoJDBC;
import db.DB;

import java.sql.Connection;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
