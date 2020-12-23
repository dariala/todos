class Todos {
	public static void main(String[] args) {
		String what = args != null && args.length > 0 && args[0] != null ?  args[0] : "World";
		System.out.println("Hello "+ what);
	}
}
