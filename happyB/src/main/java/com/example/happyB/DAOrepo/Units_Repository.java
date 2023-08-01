//package com.example.happyB.DAOrepo;
//import com.example.happyB.DBmodel.Units;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface Units_Repository extends CrudRepository<Units, Long> {
//
//
//    @Query("select DIVISION_ID, SHORT_NAME, DATE_BORN_DM from units where ID = :smp_id_unit")
//    List<String> select_from_users_by_id(@Param("smp_id_unit") String smp_id_unit); //поиск по СМП ИД юзера все записи
//
//
//    @Query("select DIVISION_ID from units where ID = :smp_id_unit")
//    String select_DIVISION_ID_id(@Param("smp_id_unit") String smp_id_unit);
//
//    @Query("select SHORT_NAME from units where ID = :smp_id_unit")
//    String select_SHORT_NAME_id(@Param("smp_id_unit") String smp_id_unit);
//
//    @Query("select DATE_BORN_DM from units where ID = :smp_id_unit")
//    String select_DATE_BORN_DM_id(@Param("smp_id_unit") String smp_id_unit);
//
//
//
//    @Query("select ID from units where ID = :smp_id_unit")
//    String serch_same_id(@Param("smp_id_unit") String smp_id_unit); //поиск по СМП ИД отдела все записи
//
//}
