package com.iabacus.zerolist.boarddao;

import java.util.List;
import com.iabacus.zerolist.boarddto.boardDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface boardDao {
    List<boardDto> selectBoardList() throws Exception;

    boardDto selectBoardDetail(int id) throws Exception;

    int insertBoard(boardDto board) throws Exception;

    int updateBoard(boardDto board) throws Exception;

    int deleteBoard(int id) throws Exception;
}
