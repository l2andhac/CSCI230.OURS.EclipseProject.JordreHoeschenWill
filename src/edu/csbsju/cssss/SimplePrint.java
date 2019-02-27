/**
 * 
 */
package edu.csbsju.cssss;

/**
 * @author njordre001
 *
 */
public class SimplePrint {

	/**
	 * @param pname
	 * @param pAge
	 */
	public SimplePrint(String pname, int pAge) {
		super();
		this.pname = pname;
		this.pAge = pAge;
	}

	private String pname;
	private int pAge;
	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the pName
	 */
	public String getpname() {
		return pname;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nate Jordre, Lindsey Hoeschen, Lindsay Will");
		for(int i=0; i<args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );
			}
	}

}
