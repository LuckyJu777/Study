#include <stdio.h>
//수학 영어 국어 > 3명의 데이터 받아서 > 오름차순 학생명으로 출력
// 점수가 몇번째 학생의 점수였는지 index를 찾으면 풀수있다.

//tempArr[][] 로만 인덱스 뽑아서 정렬 가능하다. => 시도
int main(){
    //총 3명의 학생의 데이터를 받는다.
    int tempArr[3][3] = {};
    int sampleArr[3] = {};
    int studentIndex[3] = {1,2,3};

    for(int i = 0; i<3; i++){   //학생 3명  
    
         printf("학생별 수학 국어 영어 점수를 순서대로 입력 : ");
         scanf("%d %d %d", &tempArr[i][0], &tempArr[i][1], &tempArr[i][2]);
        //수학 국어 영어 예
        sampleArr[i] = tempArr[i][0]; //수학점수를 sampleArr 에 복사
    }

    //3명의 학생의 수학점수를 비교하여 학생명으로 오름차순으로 출력한다.
    for(int i=0; i<2; i++){ //행 돌리기 학생
            //학생들의 수학점수 비교, 정해져있는 index
            
                // 행 전체(3개 과목)를 통째로 swap 
                // 뒤에서부터 정렬됨 -1 / 정렬 된 만큼 빼주기 -i
                for(int j = 0; j < 2-i-1; j++){

                    if(sampleArr[j]>sampleArr[j+1]){  //오름차순이 아닌것을 바꿔야하기 때문에 틀린것을 T로 조건
                        
                            //검증
                            // int temp = sampleArr[j]; 
                            // sampleArr[j] = sampleArr[j+1];
                            // sampleArr[j+1] = temp;
                            
                            int temp = studentIndex[j]; //
                            studentIndex[j] = studentIndex[j+1];
                            studentIndex[j+1] = temp;

                    }
                    
                }

            //버블정렬 외부 내부 루프 필요 1. 3바퀴 => 2
    }
      // 정렬된 수학 점수 출력
    printf("정렬된 수학 점수: ");
    for (int i = 0; i < 3; ++i) {
        printf("%d ", sampleArr[i]);
    }
    printf("\n");

    for(int i=0; i<3; ++i){
            // printf("%d @@@",sampleArr[i]); //점수 오름차순
            printf("학생%d ",studentIndex[i]); //smaple arr > index로 출력
            
    }
    printf("\n");
    return 0;
}
