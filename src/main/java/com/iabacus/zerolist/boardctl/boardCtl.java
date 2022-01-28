/*
package com.iabacus.zerolist.boardctl;

import com.iabacus.zerolist.boarddto.boardDto;
import com.iabacus.zerolist.boardservice.boardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class boardCtl {
    @Autowired
    private com.iabacus.zerolist.boardservice.boardService boardService;

    @RequestMapping("/board/selectBoardList.do") // 전체 게시물 select 하는 주소
    public ModelAndView selectBoardList() throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardList");

        List<boardDto> list = boardService.selectBoardList();
        mv.addObject("list", list);

        return mv;
    }

    @RequestMapping("/board/selectBoardDetail.do") // id를 이용해 게시물 상세 내용 조회할 주소
    public ModelAndView selectBoardDetail(@RequestParam int id) throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardDetail");

        boardDto board = boardService.selectBoardDetail(board);
        mv.addObject("board", board);

        return mv;
    }

    @RequestMapping("/board/openBoardWrite.do") // 게시물 등록화면 호출할 주소
    public String openBoardWrite() throws Exception {
        return "/board/boardWrite";
    }

    @RequestMapping("/board/insertBoard.do") // 작성된 게시글을 등록할 주소
    public String insertBoard(boardDto board) throws Exception {
        boardService.insertBoard(board);
        return "redirect:/board/selectBoardList.do";
    }

    @RequestMapping("board/updateBoard.do") // 작성된 게시글을 수정할 주소
    public String updateBoard(boardDto board) throws Exception {
        boardService.updateBoard(board);
        return "redirect:/board/selectBoardList.do";
    }

    @RequestMapping("board/deleteBoard.do") // 작성된 게시글을 삭제할 주소
    public String deleteBoard(int id) throws Exception {
        boardService.deleteBoard(id);
        return "redirect:/board/selectBoardList.do";
    }


}
*/
