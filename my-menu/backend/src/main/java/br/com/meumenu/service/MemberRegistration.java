package br.com.meumenu.service;

import br.com.meumenu.model.Member;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

//@Stateless
public class MemberRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<Member> memberEventSrc;

    public void register(Member member) throws Exception {
        log.info("Registering " + member.getName());
        em.persist(member);
        memberEventSrc.fire(member);
    }
}
