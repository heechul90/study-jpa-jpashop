package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    //스프링부트 스프링데이터제이피에이에서 생성자 주입을 지원해준다.
    private final EntityManager em;

    //생성자 주입이 안되는 환경이라면 이렇게 주입해야한다.
    //@PersistenceContext
    //private EntityManager em;

    /**
     * Member 저장
     * @param member
     */
    public void save(Member member) {
        em.persist(member);
    }

    /**
     * Member 조회(id)
     * @param id
     * @return
     */
    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    /**
     * Member 목록
     * @return
     */
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }

    /**
     * Member 조회(name)
     * @param name
     * @return
     */
    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
    
}
