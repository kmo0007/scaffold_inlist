package edu.uvm

class TreqMap {

		String aidyear
		String treq
		Integer seqno

	    static constraints = {
	 		aidyear(blank:false, maxSize:4, inList:{ [] << '0203' << '0304' << '0405' << '0506'}())
	 		//aidyear(blank:false, maxSize:4, inList:{ Aidy.findAll()*.code}())
			treq(blank:false, maxSize:6, inList:["BNOTE","SCERT","PERKIN","PNOTE","LNOTE","SNOTE"])
			seqno(blank:true, range:0..99)
	   }
}
