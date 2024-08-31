def solve(s):
    ans=""
    c=1
    for i in range(len(s)-1):
        if(s[i]==s[i+1]):
            c+=1
        else:
            if(c==1):
                ans+=s[i]
            else:
                ans+=s[i]+str(c)
            c=1 
    if(c==1):
        ans+=s[i+1]
    else:
        ans+=s[i+1]+str(c)
    return ans
s=input()
print(solve(s))