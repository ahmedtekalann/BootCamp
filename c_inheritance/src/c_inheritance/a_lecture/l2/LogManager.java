package c_inheritance.a_lecture.l2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Database'e loglandi. (loglama isleri)");
		}
		else if(logType==2) {
			System.out.println("File'a loglandi. (loglama isleri)");
		}
		else {
			System.out.println("Email'e loglandi. (loglama isleri)");
		}
		//kod anlasilir ama spagetti... buradaki logic neye m�l olur?
		//degisim gerektigi zaman her yerde degistirmek zorunda kaldim.
		//bunun yerine base bi sinif olusturmak daha mantikli (Logger)
		//ve base'in ozelliklerini kapsayan, kendine has islemleri olan Nesne olusturmak mantikli.
		
		
	}

}

//1-Database'e, 2-File'a, 3-Email'e logla
