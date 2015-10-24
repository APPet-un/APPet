package appet.loca

class Laboratory
{
	Date date
	String diagnostic
	File attachExams

	//Esta clase tiene una relacion tambien estraña como historia clinica

    static constraints =
    {
    	date (blank:false)
    	diagnostic (blank:false, size:5..10000)
    }
}
