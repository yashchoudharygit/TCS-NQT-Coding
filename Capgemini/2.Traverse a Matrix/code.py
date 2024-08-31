a = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16], [17, 18, 19, 20]]
rs, re, cs, ce = 0, 5, 0, 4

for row in a:
    print("\t".join(map(str, row)))
print()

while rs < re and cs < ce:
    for i in range(cs, ce):
        print(a[rs][i], end="\t")
    rs += 1

    for i in range(rs, re):
        print(a[i][ce - 1], end="\t")
    ce -= 1

    if rs < re:
        for i in range(ce - 1, cs - 1, -1):
            print(a[re - 1][i], end="\t")
        re -= 1

    if cs < ce:
        for i in range(re - 1, rs - 1, -1):
            print(a[i][cs], end="\t")
        cs += 1
