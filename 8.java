Scanner sc = new Scanner(System.in);
int n=sc.nextInt(),a=0,b=1,i=0;

while(i<n){
    System.out.print(a+" ");
    int c=a+b;
    a=b;
    b=c;
    i++;
}