import edu.uvm.Aidy
class BootStrap {

    def init = { servletContext ->
		new Aidy(code:'0910', desc:'July 2009 - June 2010', startDate:'07/01/2009', endDate:'06/30/2010', statusInd:'A').save(failOnError:true)
		new Aidy(code:'1011', desc:'July 2010 - June 2011', startDate:'07/01/2010', endDate:'06/30/2011', statusInd:'A').save(failOnError:true)
		new Aidy(code:'1112', desc:'July 2011 - June 2012', startDate:'07/01/2011', endDate:'06/30/2012', statusInd:'A').save(flush:true,failOnError:true)
		println "Loaded " + Aidy.count() + " Aid Years"
    }
    def destroy = {
    }
}
