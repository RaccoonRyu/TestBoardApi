package com.iabacus.zerolist.boardservice;

import com.iabacus.zerolist.boarddto.boardDto;
import java.util.List;

public interface boardService {
    List<boardDto> selectBoardList() throws Exception;

    int insertBoard(boardDto board) throws Exception;

    boardDto selectBoardDetail(int id) throws Exception;

    int updateBoard(boardDto board) throws Exception;

    int deleteBoard(int id) throws Exception;
}
