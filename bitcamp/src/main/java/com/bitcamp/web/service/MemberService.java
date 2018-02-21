package com.bitcamp.web.service;
 
import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.IOrder;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.MemberDTO;
 
public interface MemberService {
    public ResultMap  addMember(Command cmd);
    public ResultMap  findMemberById(Command cmd);
    public ResultMap  login(Command cmd);
    public ResultMap  deleteMember(Command cmd);
     
 
}
