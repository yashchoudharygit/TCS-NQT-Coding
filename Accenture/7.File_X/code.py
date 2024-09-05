def latest_version(S):
    latest = -1 
    for file in S:
        parts = file.split('_')
        if len(parts) == 2 and parts[0] == "File" and parts[1].isdigit():
            version = int(parts[1]) 
            latest = max(latest, version) 
    return latest

n = int(input())
S = list(map(str, input().split()))
print("Latest version:", latest_version(S))
