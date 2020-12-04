package enumplay;

public enum State {
	
	MINNESOTA("MN") {
		public String nickname() { return "Land of 10,000 Lakes"; }
	}, 
	WISCONSIN("WI") {
		public String nickname() { return "America's Dairyland"; }
	}, 
	IOWA("IA") {
		public String nickname() { return "Corn fed paradise"; }
	}, 
	MICHIGAN("MI") {
		public String nickname() { return "Lake-oriented"; }

	};
	protected abstract String nickname();  // might as well be private, because an enum cannot be extended
	protected final String abbreviation;
	protected int population;
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	private State(String a) {
		this.abbreviation = a;
	}
	
	public static void main(String[] args) {
		State[] valuesArray = State.values();
		for (State s: valuesArray) {
			System.out.println(s.name() + ": " + s.nickname());
			if (s instanceof Object) {
				System.out.println("instanceof returned true.");
			}
		}
	}
}
