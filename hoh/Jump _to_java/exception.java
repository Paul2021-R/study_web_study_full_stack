class FoolException extends Exception {
}

class Sample {
    public void sayNick(String nick) throws FoolException{
            if("fool".equals(nick)) 
                throw new FoolException();
            System.out.println("당신의 별명은 "+nick+" 입니다.");
    }
}

public class exception {
	public static void main(String[] args) {
		Sample sample = new Sample();
		try {
			sample.sayNick("fool");
			sample.sayNick("genious");
		}
		catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
		}
        
	}
}
