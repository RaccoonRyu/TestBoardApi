package com.iabacus.zerolist.boardctl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iabacus.zerolist.boarddto.boardDto;
import com.iabacus.zerolist.boardservice.boardService;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RestBoardCtl {

    @Autowired
    private boardService boardService;

    @GetMapping(value="/board") // 게시판 전체 리스트 확인
    public List<boardDto> selectBoardList() throws Exception {
        return boardService.selectBoardList();
    }

    @PostMapping(value="/board/write") // 게시판 글 쓰기
    public void insertBoard(@RequestBody boardDto board) throws Exception {
        // @RequestBody : 리퀘스트에 JSP와 같은 뷰의 폼이 아닌 (JSON 형태의)데이터 전문을 담아 보냄
        boardService.insertBoard(board);
    }

    @GetMapping(value="/board/{id}") // 게시판의 특정 id에 해당하는 글 열람
    public boardDto openBoardDetail(@PathVariable("id") int id) throws Exception {
        //public boardDto openBoardDetail(@RequestBody boardDto board) throws Exception {
        // @PathVariable : URL 경로에 있는 값을 파라미터로 추출하려고 할 때 사용
        return boardService.selectBoardDetail(id);
    }

    @PutMapping(value="/board/{id}") // 게시판의 특정 id에 해당하는 글 수정
    public String updateBoard(@RequestBody boardDto board) throws Exception {
        boardService.updateBoard(board);
        return "redirect:/board";
    }

    @DeleteMapping(value="/board/{id}") // 게시판의 특정 id에 해당하는 글 삭제
    public String deleteBoard(@PathVariable("id") int id) throws Exception {
        //public boardDto openBoardDetail(@RequestBody boardDto board) throws Exception {
        boardService.deleteBoard(id);
        return "redirect:/board";
    }

    @GetMapping(value = "/board/page") // 페이징 처리를 위해 사용할 주소
    public Object getList(HttpServletRequest request) throws Exception{
        PageHelper.startPage(request);
        return PageInfo.of(boardService.selectBoardList());
    }
}