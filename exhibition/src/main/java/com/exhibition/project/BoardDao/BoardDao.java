package com.exhibition.project.BoardDao;

import java.util.ArrayList;

import com.exhibition.project.BoardDto.BoardDto;




public interface BoardDao {
	//유저의 최근 활동시간 구하기
	public String userDate(String userid);
	//유저가 있는지 없는지 체크하기//
	public int memberCheck(String userid);
	//이럴리없어 ..//
	public BoardDto board_if(String userid);
	public int userCount(String userid);
	public ArrayList<BoardDto> list( );
	public ArrayList<BoardDto> previous();
	public ArrayList<BoardDto> userlist(String userid);
	public BoardDto findUser(String userid);
	public void write(String userid, String boardtopic, String board_comment);
	public BoardDto board_view(int board_num);
	//public BDto contentView(int bId);
	public BoardDto listPage();
	public void Doboard_update(int board_num,String userid , String boardtopic ,String board_comment);
	public void Doboard_delete(int board_num);
	public void upHit(int board_num);
	public int loginCheck(String id, String passwd);
	
	
	
	public void reply(String userid, String boardtopic, String board_comment, int bGroup, int bStep, int bIndent);
	public void replyShape(int bGroup, int bStep);
	public BoardDto contentView(int board_num);
	//report//
	public void try_report(String userid, String boardTitle, String board_comment,String report_comment);
	
	
	
	
	
	
	
	
	
//	public BDto reply_view(int bId);
//	public void reply(String bName,String bTitle,String bContent,int bGroup,int bStep,int bIndent);
//	public void replyShape(int bGroup ,int bStep);
	
	
	
	
	
	
	
}
