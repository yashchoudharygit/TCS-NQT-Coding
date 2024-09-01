s = input()
mp = {}
for c in s:
    if c in mp:
        mp[c] += 1
    else:
        mp[c]= 1
res = ""
for k, v in mp.items():
    res += str(k) + str(v)
print(res)