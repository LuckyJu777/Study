package someTea;

import java.util.ArrayList;
import java.util.Scanner;

public class Beer2 {
	//Beer클래스 beerStore 객체배열을 만들어준다.
    public static ArrayList<Beer> beerStore = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("1.맥주 등록 2.맥주 조회 3.종료");
            System.out.print("메뉴를 선택하세요: ");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println("수제맥주");
                    System.out.print("맥주 이름을 입력하세요: ");
                    String name = sc.next();
                    System.out.print("맥주 맛을 입력하세요: ");
                    String flavor = sc.next();
                    System.out.print("맥주 생성지를 입력하세요: ");
                    String origin = sc.next();

                    while (checkOverlap(name)) {
                        System.out.println("이미 등록된 이름입니다. 다른 이름을 입력해주세요.");
                        System.out.println("맥주 이름을 입력하세요: ");
                        name = sc.next();
                    }

                    Beer newBeer = new Beer();
                    newBeer.setName(name);
                    newBeer.setFlavor(flavor);
                    newBeer.setOrigin(origin);
                    beerStore.add(newBeer);
                    //beerStore안에 newBeer객체를 넣어준다.
 
                    System.out.println("수제맥주 등록 완료.");
                    break;
 
                case 2:
                    System.out.print("조회하실 맥주 이름을 입력해 주세요.");
                    String findName = sc.next();
                    //조희이름 findName 
                    Beer findBeer = null;
                    
                    for(int i = 0; i<beerStore.size(); i++) {
                    	System.out.println(beerStore.get(i).getName());
                    	if(beerStore.get(i).getName().equals(findName)) {
                    		System.out.println(beerStore.get(i).toString());
                    		findBeer = beerStore.get(i);
                    		break;
                    	}
                    }
                    
                    for(int i =0; i<beerStore.size(); i++) {
                    	System.out.println(beerStore.get(i).getName());
                    	if(beerStore.get(i).getName().equals(findName)) {
                    		System.out.println(beerStore.get(i).toString());
                    		findBeer = beerStore.get(i);
                    		break;
                    	}
                    }
//                    for (Beer beer : beerStore) {	//객체를 아직 만들진 않았다.
//                        if (beer.getName().equals(findName)) {	//이름을 비교 똑같은 객체를 찾는다. 데이터String 값을 대조
//                            findBeer = beer;	//
//                        }
//                    }
                    if (findBeer != null) {
                        System.out.println(":맥주:당신이 만든 수제맥주:맥주:??");
                        System.out.println("--------------------");
                        System.out.println("조회하신 수제맥주의 상품명은 <" + findBeer.getName() + "> 입니다.");
                        System.out.println("맥주의 맛 종류는 <" + findBeer.getFlavor() + "> 입니다.");
                        System.out.println("맥주의 생성지는 <" + findBeer.getOrigin() + "> 입니다.");
                    } else {
                        System.out.println("입력하신 상품명의 맥주를 찾을 수 없습니다.");
                    }
                    break;
                    
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("1 ~ 2 메뉴를 입력해주세요.");
                    break;
            }
            System.out.println();
        }
    }

    public static boolean checkOverlap(String name) {
        boolean flag = false;
        for (Beer beer : beerStore) {
            if (beer.getName().equals(name)) {
                flag = true;            }
        }
        return flag;
    }
}