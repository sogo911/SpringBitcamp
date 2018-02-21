package com.bitcamp.web.command;

import java.util.List;

import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.AttendDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;

import lombok.Data;

@Data
public class ResultMap {
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
	public List<MemberDTO> getMembers() {
		return members;
	}
	public void setMembers(List<MemberDTO> members) {
		this.members = members;
	}
	public List<AccountDTO> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<AccountDTO> accounts) {
		this.accounts = accounts;
	}
	public List<AttendDTO> getAttends() {
		return attends;
	}
	public void setAttends(List<AttendDTO> attends) {
		this.attends = attends;
	}
	public List<LottoDTO> getLottos() {
		return lottos;
	}
	public void setLottos(List<LottoDTO> lottos) {
		this.lottos = lottos;
	}
	public List<FoodDTO> getFoods() {
		return foods;
	}
	public void setFoods(List<FoodDTO> foods) {
		this.foods = foods;
	}
	public List<MobileDTO> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<MobileDTO> mobiles) {
		this.mobiles = mobiles;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	protected MemberDTO member;
	protected AccountDTO account;
	protected AttendDTO attend;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	protected List<MemberDTO> members;
	protected List<AccountDTO> accounts;
	protected List<AttendDTO> attends;
	protected List<LottoDTO> lottos;
	protected List<FoodDTO> foods;
	protected List<MobileDTO> mobiles;
	protected boolean success;
	protected int count;
}
