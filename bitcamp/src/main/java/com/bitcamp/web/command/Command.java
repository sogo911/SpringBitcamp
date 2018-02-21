package com.bitcamp.web.command;

import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.AttendDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.enums.Action;
import com.bitcamp.web.enums.Table;

import lombok.Data;
@Data

public class Command{
	protected String cmd,dir,page,view,column,data;
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	protected Action action;
	protected Table table;
	protected MemberDTO member;
	protected AccountDTO account;
	protected AttendDTO attend;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	
	public void setPage(String page) {
			this.page = (page==null) ? "login": page;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}

	public AccountDTO getAccount() {
		return account;
	}

	public void setAccount(AccountDTO account) {
		this.account = account;
	}

	public AttendDTO getAttend() {
		return attend;
	}

	public void setAttend(AttendDTO attend) {
		this.attend = attend;
	}

	public LottoDTO getLotto() {
		return lotto;
	}

	public void setLotto(LottoDTO lotto) {
		this.lotto = lotto;
	}

	public FoodDTO getFood() {
		return food;
	}

	public void setFood(FoodDTO food) {
		this.food = food;
	}

	public MobileDTO getMobile() {
		return mobile;
	}

	public void setMobile(MobileDTO mobile) {
		this.mobile = mobile;
	}

	public String getPage() {
		return page;
	}

}
