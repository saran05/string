for(i=0;i<t-1;i++)
    {if(c[i]=='a'){
        c[i]='z';
        s1+=c[i];
    }
    else{
       c[i]=(char) (c[i]-1) ;
       s1+=c[i];
      }
    }
  s1+=c[t-1];
        System.out.println(""+s1);
    