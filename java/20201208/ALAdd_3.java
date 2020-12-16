		ArrayList<Integer> nums=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.printf("ArrayListを使ってみよう!%nListにどんどん追加していってみよう。%n");
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了)>");
			int n=scan.nextInt();
			switch(n){
				case 0:
					System.out.printf("要素数:"+nums.size()+"%n要素:");
					for(int i=0;i<nums.size();i++){
						System.out.println(Arrays.toString(nums.get));
						//System.out.print(nums.get(i)+",");
					}
					scan.close();
					return;

				default:
					nums.add(n);
					System.out.println(n+"をListに追加したよ!");
			}
		}
	}
}
