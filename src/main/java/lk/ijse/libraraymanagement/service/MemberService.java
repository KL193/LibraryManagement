package lk.ijse.libraraymanagement.service;


import lk.ijse.libraraymanagement.dto.MemberDTO;

import java.util.List;

public interface MemberService {

    void saveMember(MemberDTO member);
    void updateMember(String memberId,MemberDTO member);
    void deleteMember(String memberId);
    MemberDTO getSelectedMember(String memberId);
    List<MemberDTO> getAllMembers();
}
