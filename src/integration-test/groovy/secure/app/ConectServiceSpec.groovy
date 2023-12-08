package secure.app

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ConectServiceSpec extends Specification {

    ConectService conectService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Conect(...).save(flush: true, failOnError: true)
        //new Conect(...).save(flush: true, failOnError: true)
        //Conect conect = new Conect(...).save(flush: true, failOnError: true)
        //new Conect(...).save(flush: true, failOnError: true)
        //new Conect(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //conect.id
    }

    void "test get"() {
        setupData()

        expect:
        conectService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Conect> conectList = conectService.list(max: 2, offset: 2)

        then:
        conectList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        conectService.count() == 5
    }

    void "test delete"() {
        Long conectId = setupData()

        expect:
        conectService.count() == 5

        when:
        conectService.delete(conectId)
        sessionFactory.currentSession.flush()

        then:
        conectService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Conect conect = new Conect()
        conectService.save(conect)

        then:
        conect.id != null
    }
}
