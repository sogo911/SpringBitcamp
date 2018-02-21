package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.MobileDTO;

public interface MobileService {
	public ResultMap findMobileById(Command cmd);
	public ResultMap openPhone(Command cmd);
}
