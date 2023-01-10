package kosta.basic.day016.regex;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {

        // 숫자가 3자리인지 유무를 판단해보자 !

        String regexPattern1 = "[\\d]{3}";  // 숫자 3자리
        String regexPattern2 = "^[\\w\\d]{5,}";   // 알파벳, 숫자 5자리 이상
        String regexPattern3 = "[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]{3,5}";    // 한글 3~5자리
        String regexPattern4 = "[a-z].[\\w]{0,10}@[a-z]{1,5}.[a-z]{3}";    // email
        String regexPattern5 = "^[\\D]\\w+@\\w+\\.\\w{2,3}";    // email

        // 일반, 이미지 파일 식별 // abc.jpg, abc.gif, abc.PNG, abc.txt
        String regexPattern6 = "^[\\w]*\\.(?i)(jpg|png|gif)"; // 이미지 파일
        String regexPattern7 = "([^\\s]+(\\.(?i)(jpe?g|png|gif|bmp))$)"; // 이미지 파일 advanced

        String message = "8967SW 개발자 처우와 근무여건 선진국 수준으로 개선해야 【서울=뉴시스】김형섭 기자 = 박근혜 대통령은 23일 소프트웨어(SW) 중심사회를 실현하기 위해서는 SW의 가치를 제대로 인정하는 데서 출발해야 한다고 말했다. 박 대통령은 이날 오전 판교 테크노밸리에서 열린 'SW 중심사회 실현 전략보고회'에서 우리나라가 IT 강국으로 지속 발전하기 위해서는 SW 분야의 경쟁력 확보가 시급한 과제라며 이같이 밝혔다. 박 대통령은 시장에서 SW의 가치를 제대로 인정하지 않아 SW 기업들의 수익성이 악화되고, 우수한 인재가 유입되지 않는 악순환의 고리를 끊어야 한다며 공공부문의 SW 제값주기 노력이 민간으로 확산돼 창의성과 노력이 온전히 보답 받는 환경을 조성해 나가도록 노력할 것이라고 약속했다.  이어 그동안 공공 정보화사업이 오히려 민간 SW 시장을 위축시킨다는 지적이 있었는데 민간의 기술과 산업발전을 위한 마중물 역할을 해야 할 정부가 오히려 민간시장을 위축시키는 일이 있어서는 안 될 것이라며 민간시장에 미치는 영향을 사전에 평가하는 등 공공 정보화사업 추진절차를 개선할 필요가 있다고 진단했다.  박 대통령은 또 SW 개발자의 처우와 근무여건도 선진국 수준으로 개선할 필요가 있다며 SW 개발자가 '꿈의 직업'이 돼 최고의 인재들이 유입되고 이들이 SW 산업 발전을 이끌어가고, 그래서 소프트웨어 개발자들의 처우가 더욱 개선되는 선순환 구조를 만들어 나가야 하겠다고 강조했다.  특히 자라나는 미래세대에 대한 SW 교육이 무엇보다 중요하다며 SW 중심사회의 주역이 될 미래 세대가 '컴퓨터적 사고'를 기본소양으로 갖출 수 있도록 초·중등학교에서부터 SW교육을 강화해야 한다고 말했다.";
        // SW => 소프트웨어 / 변경
        String result = message.replaceAll("SW", "소프트웨어");

        // 문자열 안의 숫자를 모두 제거하기
        String result2 = message.replaceAll("\\d", "");
        System.out.println(result2);



        while (true){
            Runnable test = isMatch(getInput(), regexPattern7) ? () -> System.out.println("match") : () -> System.out.println("not match!");
            test.run();
        }


    }

    private static boolean isMatch(String message, String regex) {
        return message.matches(regex);
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void simpleExample1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String string = scanner.nextLine();

        if (string.matches(".*abc*")) {
            System.out.println("matching!");
        } else {
            System.out.println("not !");
        }
    }

}
