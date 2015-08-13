asci = "9876543210ABCDEFGHIJKLMNOPQRSTUVWXYZzyxwvutsrqponmlkjihgfedcba"
arr = list(asci)
f = open('D:/try2hack/a.txt','r+')
# print f.read()
text = f.read()
# text = "Z"
count = 1
# print arr
# print arr.index("Z")
ans = ""
for x in text:
    if count == 27:
        count = 1
    ind = arr.index(x)+count
    if ind > 62:
        ind = ind -62
    count +=1
    ans += str(arr[ind])
print ans
d = open('D:/try2hack/anspro04.txt','w')
d.write(ans)
