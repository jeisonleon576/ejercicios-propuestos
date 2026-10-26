Scanner sc = new Scanner(System.in);
int n=sc.nextInt(),c=0,i=1;

while(i<=n){
    if(i%2==0)c++;
    i++;
}
System.out.println(c);