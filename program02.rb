n = gets.to_i
def palindrome?(string)
  string = string.to_s
  if string.length == 1
    return true
  end
  return string == string.reverse
end
count = 0
for i in 1..1000000
  if n == count
    break
  end
  if palindrome?(i)
    print i.to_s
    print ", "
    count +=1
  end
end
# print palindrome?("43342")
