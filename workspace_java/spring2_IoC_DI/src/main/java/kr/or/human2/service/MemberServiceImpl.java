package kr.or.human2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human2.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Override
	public List getList(MemberDAO memberDAO) {
//		MemberDAO memberDAO = new memberDAOImpl();
		
		return memberDAO.select();
	};
//	@Autowired // 필드와 전달인자에만 붙을 수 있음
//	MemberDAO MemberDAO;
//	MemberDAO memberDAOImpl;
//	MemberDAO dao;
	@Autowired
	@Qualifier("dao")
	MemberDAO MemberDAO;
	
	@Override
	public List getList2() {
		
//		MemberDAO memberDAO = new memberDAOImpl();
		return MemberDAO.select();
	}
}
