public static void main(String[] args) {
	List<String> frame=Arrays.asList("POM","POM","HybridDr","KeywordDr","DataDr","BDD","KeywordDr","DataDr");
	

	
//	frame.stream()
//	.forEach(System.out::println);
	
//System.out.println("starts with H: ");
//	frame.stream().filter(x->x.startsWith("H")).forEach(x->System.out.println(x));
//	System.out.println("contains Dr : ");
//	frame.parallelStream().filter(x->x.contains("Dr")).forEach(System.out::println);
	
//	frame.stream()
//	.distinct().forEach(System.out::println);
//	System.out.println(frame.stream().distinct().limit(3).count());
	
//	frame.stream()
//	.skip(4)
//	.forEach(x->System.out.println(x));	
	
//	frame.stream().map(String::toUpperCase).forEach(System.out::println);
//	gettin the length of each string in the list:
//	frame.stream().map(s->s.length()).forEach(System.out::println);
	
	List<Integer> list = Arrays.asList(2,-6,3,8,5);
//	soriting 
//	list.stream().sorted().forEach(s->System.out.println(s));
	
//	multiply each element by 2
	
//	list.stream().map(s->s*2).forEach(System.out::println);
	
//	getting even numbers
//	list.stream()
//	.filter(x->x%2==0)
//	.forEach(System.out::println);
	
//	getting the odd numbers
	
//	list.stream().filter(x->x%2!=0).forEach(System.out::println);
	
	System.out.println("sum of numbers: ");
	System.out.println(list.stream().reduce(Integer::sum).get());
	
	System.out.println("min number");
	System.out.println(list.stream().reduce(Integer::min).get());
//	
	System.out.println("max number");
	System.out.println(list.stream().reduce(Integer::max).get());