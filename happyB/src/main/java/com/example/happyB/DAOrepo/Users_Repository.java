//package com.example.happyB.DAOrepo;
//import com.example.happyB.DBmodel.Users;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface Users_Repository extends CrudRepository<Users, Long> {
//
//    @Query("select smp_id_unit from users where smp_id_unit = :smp_id_unit")
//    String selectUsersbuSmpID(@Param("smp_id_unit") String smp_id_unit);
//
//    @Query("select smp_id_unit from users where smp_id_unit = :smp_id_unit")
//    List<String> countSmpID(@Param("smp_id_unit") String smp_id_unit);
//
//}
