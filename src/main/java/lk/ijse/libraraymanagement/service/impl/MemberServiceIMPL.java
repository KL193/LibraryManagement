package lk.ijse.libraraymanagement.service.impl;



import lk.ijse.libraraymanagement.dto.MemberDTO;
import lk.ijse.libraraymanagement.service.MemberService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.libraraymanagement.util.UtilityData;

@Service
public class MemberServiceIMPL implements MemberService {

    @Override
    public void saveMember(MemberDTO member) {
        member.setMemberId(UtilityData.generatememberId());
        System.out.println(member);
    }
    @Override
    public void updateMember(String memberId, MemberDTO member) {
    }
    @Override
    public void deleteMember(String memberId) {
    }
    @Override
    public MemberDTO getSelectedMember(String memberId) {
        return new MemberDTO("12345", "John Doe", "johndoe@example.com", "2023-01-01");
    }
    @Override
    public List<MemberDTO> getAllMembers() {
        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("12345", "John Doe", "johndoe@example.com", "2023-01-01"));
        members.add(new MemberDTO("12346", "Jane Smith", "janesmith@example.com", "2023-02-01"));
        members.add(new MemberDTO("12347", "Alice Johnson", "alicejohnson@example.com", "2023-03-01"));
        members.add(new MemberDTO("12348", "Bob Brown", "bobbrown@example.com", "2023-04-01"));
        members.add(new MemberDTO("12349", "Charlie Davis", "charliedavis@example.com", "2023-05-01"));
        return members;
    }
}
