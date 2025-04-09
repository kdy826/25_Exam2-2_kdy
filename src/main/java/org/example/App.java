package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Scanner sc; //main 클레스에게 스캐너 받아옴
    private List<Motivation> motivations;  // motivations의 이름을 가진 리스트 생성
    private int idd;

    public App(Scanner sc) { //생성자를 만들어서 스캐너와 리스트를 활성화
        this.sc = sc;
        motivations = new ArrayList<Motivation>();
    }

    public void run() {
        while (true) {  //while(true)반복문으로 계속 명령받게만듬.
            System.out.printf("명령어)");
            String cmd = sc.nextLine();
            if (cmd.equals("등록")) { // 스캐너 cmd가 등록을 입력받으면 등록창으로 이동
                int id = idd + 1;  // 등록창으로 이동되면 아이디 1로 설정
                System.out.printf("명언:");
                String content = sc.nextLine().trim();
                System.out.printf("작가");
                String author = sc.nextLine().trim();



                Motivation motivation = new Motivation(id, content, author); // 명언 , 작가 내용을 입력받으면 리스트 motivaitons에 저장
                motivations.add(motivation);
                System.out.printf("%d 번 명언이 등록되었습니다\n", id); //번호와 등록되었다 출력
                idd++; //다음번 등록시 번호를 증가시켜서 2번이 등록될수있게만듬
            } else if (cmd.equals("목록")) {
                if (motivations.size() == 0) { //만약 목록에 등록된 내용이 없을시 목록이 없습니다 출력
                    System.out.println("목록이 없습니다");
                    continue;
                }
                System.out.println("    번호    /   작가     /   명언 \n");
                System.out.println("=".repeat(40));

                for (int i = motivations.size() - 1; i >= 0; i--) {
                    Motivation motivation = motivations.get(i);
                    System.out.printf("%d      /     %s    /    %s \n", motivation.getId(), motivation.getContent(), motivation.getAuthor());
                    //등록된 motivation 번호 , 작가 명언 출력
                }
                System.out.println("=".repeat(40));

            } else if (cmd.startsWith("삭제")) {
                    int id = Integer.parseInt(cmd.split(" ")[1]); // 삭제 뒤에 번호를 스플릿으로 잘라서 id로 저장

                    Motivation foundMotivation = null;
                    int foundIndex = -1;

                    for (int i = 0; i < motivations.size(); i++) { // 입력받은 id를 반복문으로 리스트 motivations 목록 안에 내용들 탐색
                        Motivation motivation = motivations.get(i);
                        if (motivation.getId() == id) { // 찾으면 break로 반복문 탈출
                            foundMotivation = motivation;
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundMotivation == null) { // foundMotivaion에 내용이 없으면 해당 명언은 없습니다 출력
                        System.out.println("해당 명언은 없습니다");
                        return;
                    }

                    motivations.remove(foundIndex); // foundIndex가 -1로 찾으면 Id랑 일치하는 내용 삭제
                    System.out.println(id + "번 명언 삭제됨");  //삭제 안내 출력

            } else if (cmd.startsWith("상세보기")) {
                int id = Integer.parseInt(cmd.split(" ")[1]); // 상세보기 뒤에 번호를 스플릿으로 잘라서 id로 저장

            } else if (cmd.startsWith("수정")) {
                int id = Integer.parseInt(cmd.split(" ")[1]); // 수정 뒤에 번호를 스플릿으로 잘라서 id로 저장
                Motivation motivation = null;


            }
        }

    }
}