//package hu.nive.ujratervezes.zarovizsga.dogtypes;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DogtypesDao {
//
//    private DataSource dataSource;
//
//    public DogtypesDao(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    public DataSource getDataSource() {
//        return dataSource;
//    }
//
//    public List <DogTypes> selectByPreparedStatement (PreparedStatement stmt) {
//        List<String> result = new ArrayList<>();
//        try (ResultSet rs = stmt.executeQuery()) {
//            while (rs.next()) {
//                DogTypes dogTypes = new DogTypes(rs.getString("country")))));
//                result.add(dogTypes);
//            }
//            return result;
//        } catch (SQLException sqlException) {
//            throw new IllegalArgumentException("Wrong statement", sqlException);
//        }
//    }
//
//    public List<String> getDogsByCountry (String country){
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt =
//                     conn.prepareStatement(" select name from activities where country = ?")){
//            stmt.setString(1, country.toString());
//            return selectByPreparedStatement(stmt);
//        } catch (SQLException sqlException) {
//            throw new IllegalArgumentException("Connection failed", sqlException);
//        }
//
//    }
//}
//
//}
