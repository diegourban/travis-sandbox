package br.com.travis;

public class Sistema {
	
	public String getHelloTravis() {
		return "Hello Travis";
	}
	
	public static void main(String[] args) {
		Sistema s = new Sistema();
		System.out.println(s.getHelloTravis());
	}

}
