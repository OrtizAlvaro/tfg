package com.tfg.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.tfg.database.tables.Msg_Grupal;

import java.util.List;

@Dao
public interface Dao_Msg_Grupal {
    @Query("SELECT * FROM Msg_Grupal")
    List<Msg_Grupal> getMsgGrupal();

    @Query("DELETE FROM Msg_Grupal WHERE id_grupo = :id")
    void cleanChat(String id);

}
