Scanner sc = new Scanner(System.in);
int n=sc.nextInt(),c=0;

while(n>0){
    n/=10;
    c++;
}
System.out.println(c);