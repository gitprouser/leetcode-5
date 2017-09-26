public boolean isMatch(String s,String p){
    if(s==null||p==null){
        return false;
    }
    int indexs = 0,indexp=0;
    int lens = s.length();
    int lenp = p.length();
    int prep=-1;
    int pres=-1;
    while(indexs<lens){
        if(indexp<lenp&&matchChar(s.charAt(indexs),p.charAt(indexp))){
            indexp++;
            indexs++;
        }else if(indexp<lenp&&p.charAt(indexp)=='*'){
            prep=indexp;
            pres=indexs;
            indexp++;
        }else if(prep!=-1){
            indexp=prep;
            indexp++;
            pres++;
            indexs=pres;
        }else{
            return false;
        }
    }
    while(indexp<lenp){
        if(p.charAt(indexp)!='*'){
            return false;
        }
        indexp++;
    }
    return true;
}

public boolean matchChar(char a,char b){
    return a==b||b=='?';
}
