package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    // 필드주입 : 바꿀수 없다. 최대 단점.
    //@Autowired
    //private MemberRepository memberRepository;

    // 세터주입 : 테스트할때 mock을 set 할 수 있음. 하지만 런타임 시점에 변경 가능해서 안좋음. 사실 조립시점에 변경할 이유가 없어서 열어두는게 좋지 않음.
    //private MemberRepository memberRepository;
    //
    //@Autowired
    //public void setMemberRepository(MemberRepository memberRepository) {
    //    this.memberRepository = memberRepository;
    //}

    private final MemberRepository memberRepository;

    /**
     * 회원가입
     * @param member
     * @return
     */
    @Transactional
    public Long join(Member member) {
        validateDuplicateMember(member); //중복회원검증
        memberRepository.save(member);
        return member.getId();
    }

    /**
     * 회원 목록
     * @return
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    /**
     * 회원 조회(id)
     * @param memberId
     * @return
     */
    public Member findOne(Long memberId) {
        return memberRepository.findOne(memberId);
    }

    //동시에 회원가입하게 되면 save 메서드를 호출할 수 있다. 이는 같은 이름의 두 회원이 가입되게 된다.
    //데이터베이스에 name에 유니크 제약을 걸어두어 해결할 수 있다.
    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

}
