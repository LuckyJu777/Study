#include <stdio.h>
#include <string.h>

//1. 입력받는 학생들의 성적을 높은 순으로 정렬하는 프로그램을 만드세요
//2. 입력받은 학생들의 성적을 막대그래프로 나타내는 프로그램을 만드세요
int main(){

    int students;   //학생

    //1. 학생 입력받기
    printf("몇명의 학생의 성적을 입력하시겠습니까? :");
    scanf("%d", &students);

    //2. 배열선언
    char studentArr[students][20]; //학생이름
    int scoreArr[students]; //학생성적

    //3. 학생이름 성적 입력받기
    for(int i=0; i < students; i++){
        int n=i;
        printf("%d번째 학생 이름 : ",n+1);        
        scanf("%s", studentArr[i]);

        printf("%d번째 %s학생의 성적 : ",n+1 ,studentArr[i]);        
        scanf("%d", &scoreArr[i]);
    }

    //4. 높은순으로 정렬 후 출력
    printf("높은성적순으로 정렬합니다.\n");
    for(int i=0; i < students; i++){  //입력받은 학생수 만큼 반복
        for(int j=0; j < students-1-i; j++){
            if(scoreArr[j] < scoreArr[j+1]){ //index1보다 2가 크다면
                
                int tempScore = scoreArr[j]; //저장 후
                scoreArr[j] = scoreArr[j+1];
                scoreArr[j+1] = tempScore; //앞으로 큰 숫자 옮기기
                
                char tempName[20];
                strcpy(tempName, studentArr[j]);    //tempName = 민수
                strcpy(studentArr[j], studentArr[j+1]); //studentArr[j]=주형
                strcpy(studentArr[j+1], tempName); //studentArr[i]=민수
            }
        }
    }

    //5. 출력
    printf("-> 높은 성적 순으로 출력 -> \n");
    for(int i = 0; i < students; i++){
        printf("%s : %d 점 \n", studentArr[i], scoreArr[i]);
    }

    return 0;
}