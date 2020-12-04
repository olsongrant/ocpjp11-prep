package inner;
class OuterWorld {     
	public InnerPeace i = new InnerPeace("none"); //1     
	class InnerPeace     {           
		private String reason = "none";         
		InnerPeace(String reason){ this.reason = reason; }     
	}     
	public static void main(String[] args) {
		var ip = new InnerPeace("yoga"); //2
		var out = new OuterWorld();
		System.out.println(out.i.reason); //3
	}
}
