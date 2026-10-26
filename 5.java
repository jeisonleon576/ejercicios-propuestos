Scanner sc = new Scanner(System.in);
int n=sc.nextInt(),f=1,i=1;

while(i<=n){
    f*=i;
    i++;
}
System.out.println(f);