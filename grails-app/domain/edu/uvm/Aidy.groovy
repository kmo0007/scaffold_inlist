package edu.uvm

class Aidy {
	String code
	String desc
	Date startDate
	Date endDate
	String statusInd
	
	static constraints = {
		code(unique:true,blank:false, maxSize:4)
		desc(blank:false, maxSize:30)
		startDate(blank:false)
		endDate(blank:false)
		statusInd(blank:false, inList:["A","I"])
	}
	
}
