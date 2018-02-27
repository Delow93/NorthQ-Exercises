#include <stdio.h>
void circle(int k, int cells[]);
int main( int argc, const char* argv[] ){

int cells[] = {1,0,1,1};
for(int i=0;i<4;i++){
printf("%d ",cells[i]);
}
circle(2,cells);

}

void circle(int k, int cells[]){
int newcells[4];
if(k>0){

for(int i=0;i<4;i++){
//printf("Iteration: %d\n",i);
int p1;
int p2;
if(i==0){
//printf("Case1\n");
p1=4-1;
p2=i+1;

}else if(i==4-1){
//printf("Case2\n");
p1=0;
p2=i-1;

}else{
//printf("Case3\n");
p1=i+1;
p2=i-1;
}

if(cells[p1]+cells[p2]==2){
//printf("Case4\n");
newcells[i]=0;
}
else if(cells[p1]+cells[p2]==1){
//printf("Case5\n");
newcells[i]=1;
}else{
//printf("Case6\n");
newcells[i]=0;
}

}
/*Følgende kode kan udkommenteres, for at tjekke værdierne i array'et efter hver K step
for(int i=0;i<4;i++){
printf("%d ",newcells[i]);
}
*/
k=k-1;
circle(k,newcells);

}else{
printf("\nEnd result: \n");
for(int i=0;i<4;i++){
printf("%d ",cells[i]);
}
printf("\n");
}
}
