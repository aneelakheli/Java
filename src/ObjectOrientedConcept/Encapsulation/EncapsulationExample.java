
class EncapsulationExample {
	int num1 = 8;
	int num2 = 10;

	public int sum() {
		return num1 + num2;
	}

	public static void main(String[] args) {
		EncapsulationExample add = new EncapsulationExample();
		System.out.println(add.sum());
	}
}