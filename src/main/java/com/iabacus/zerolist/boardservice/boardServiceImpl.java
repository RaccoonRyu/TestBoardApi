package com.iabacus.zerolist.boardservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iabacus.zerolist.boarddto.boardDto;
import com.iabacus.zerolist.boarddao.boardDao;

@Service
public class boardServiceImpl implements boardService {

    @Autowired
    private boardDao boardDao;

    @Override
    public List<boardDto> selectBoardList() throws Exception {
        return boardDao.selectBoardList();
    }

    @Override
    public boardDto selectBoardDetail(int id) throws Exception {
        boardDto board = boardDao.selectBoardDetail(id);
        return board;
    }

    @Override
    public int insertBoard(boardDto board) throws Exception {
        int insertResult = boardDao.insertBoard(board);
        return insertResult; // insert 개수(여부) 확인
    }

    @Override
    public int updateBoard(boardDto board) throws Exception {
        int updateResult = boardDao.updateBoard(board);
        return updateResult; // update 개수(여부) 확인
    }

    @Override
    public int deleteBoard(int id) throws Exception {
        int deleteResult = boardDao.deleteBoard(id);
        return deleteResult; // delete 개수(여부) 확인
    }
}
