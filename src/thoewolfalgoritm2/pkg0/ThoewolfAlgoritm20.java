/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thoewolfalgoritm2.pkg0;

public class ThoewolfAlgoritm20 {

 
    public static void main(String[] args) {
         int prim[] = new int[500000];
         int kk = 0;
         int z = 13;
        int pf = 15;
        int gg=0;
       
      int j=0;
        int g = 0;
        int k = 0;
        int x = 0;
        int maxi=2;
        int y = 0;
        int u = 0;
          boolean a = true;
        boolean b = true;
         boolean c = true;
          boolean d = true;
           boolean e = true;
            boolean f = true;
             boolean gere = true;
              boolean h = true;
               boolean hh = true;
         boolean csizi = true;
         prim[0]=7;
       prim[1]=11;
         prim[2]=13;
          int two[] = new int[1000000];
        two[0]=2;
        int i=0;
        int mk = 0;
         while(two[i]<1000000){
   two[i+1]=two[i]*2;
//System.out.println(two[i+1]); 
   i++; 
   mk++;
   }
      
          i=0;
   while(i<3){
       g=0;
   while (prim[i]*two[g]<1000000  ){
       x=0;
       csizi = true;
   while (x<=mk && csizi){
   if (two[x]==two[g]*prim[i] ){
   csizi = false;
   }
   x++;
   }
   if (csizi){
   k=0;
     if (prim[i]*two[g]>two[mk]){
          k=mk+1;
          }
   while (prim[i]*two[g]>two[k] && k<mk ){
          k++;
        }

      x=two[k];
  two[k]=two[g]*prim[i];
  k++;
  y=two[k];
   two[k]=x;
   x=y;
    k++;
  while (k<=mk+1){
       y=two[k];
      two[k]=x;
   x=y;
    k++;
  }
  mk++;
     }
   g++;
   }
   i++;
    }
   i=2;
 
 while (z   <  1000000){
    while (prim[i]<pf*prim[kk] && prim[i]<1000000){
    i++;
    maxi++;
    prim[i]=pf+two[gg];
    z = prim[i];
  u++;
     // System.out.println(prim[i]);
    if (z>100000 && a ){
  System.out.println("100.000 ig eddig fut le =  "+(i+4));
  a = false;
 }
 if (z>200000 && b ){
  System.out.println("200.000 ig eddig fut le =  "+(i+4));
  b = false;
 }
 if (z>300000 && c ){
  System.out.println("300.000 ig eddig fut le =  "+(i+4));
  c = false;
 }
 if (z>400000 && d ){
  System.out.println("400.000 ig eddig fut le =  "+(i+4));
  d = false;
 }
 if (z>500000 && e ){
  System.out.println("500.000 ig eddig fut le =  "+(i+4));
  e = false;
 }
 if (z>600000 && f ){
  System.out.println("600.000 ig eddig fut le =  "+(i+4));
  f = false;
 }
 if (z>700000 && gere){
  System.out.println("700.000 ig eddig fut le =  "+(i+4));
  gere = false;
 }
 if (z>800000 && h ){
  System.out.println("800.000 ig eddig fut le =  "+(i+4));
  h = false;
 }
 if (z>900000 && hh ){
  System.out.println("900.000 ig eddig fut le =  "+(i+4));
  hh = false;
 }
    gg++;
    g=0;
           while (prim[i]*two[g]<1000000 ){
       x=0;
       csizi = true;
   while (x<=mk+1 && csizi){
   if (two[x]==two[g]*prim[i] ){
   csizi = false;
   }
   x++;
   }
   if (csizi){
   k=0;
    if (prim[i]*two[g]>two[mk]){
          k=mk+1;
          }
   while (prim[i]*two[g]>two[k] && k<=mk ){
          k++;
        }
   
      x=two[k];
  two[k]=two[g]*prim[i];
  k++;
  y=two[k];
   two[k]=x;
   x=y;
   k++;
  while (k<=mk+1){
       y=two[k];
      two[k]=x;
   x=y;
   k++;
  }
  mk++;
     }
   g++;
   }
                   
    }
    i--;
    g=0;
    pf=pf*prim[kk];
    
    while (g<=mk){
    if (two[g] % prim[kk] ==0 && two[g] > prim[kk]){
    x=g;
     //  System.out.println(two[g]);
        while(x<mk){
        two[x]=two[x+1];
        x++;
        } 
    mk--;
    g=g-1;
    }
    g++;
    }
 
    gg=0;
    kk++;
 }
   System.out.println("1.000.000 ig eddig fut le =  "+(i+4));
     i=0;

    while (i<=maxi){
        x=2;
        while (x<1000){
        if (prim[i]%x==0 && prim[i]!=x){
            y=i;
            while (y<maxi){
        prim[y]=prim[y+1];
        y++;
                }
            i=i-1;
        maxi--;
        }
        x++;
        }
        i++;
    }
    System.out.println("  enyi kivetelek nelkul 1.000.000 nal  "+(maxi+4));
  
    }
    
}
