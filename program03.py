num = "877 220 688 565 448 744 449 978 814 718 15 381 478 455 265 189 434 262 135 814 195 208 80 883 926 58 228 384 828 849 181 189 256 14 604 475 741 36 963 101 749 731 331 611 557 729 483 521 560 125 857 866 1000 924 113 427 36 246 192 540"
arr = num.split(" ")
count = 1
ans = 0
for x in arr:
    number = int(x)
    if count%3==0:
        ans = ans-number
    else:
        ans = ans+number
    count +=1
print ans
