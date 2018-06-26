str1 = input()
str2 = input()

str1 = str1.upper()
str2 = str2.upper()

list1 = sorted(str1)
list2 = sorted(str2)

if ( list1.__eq__(list2)):
    print('matches!!')
else:
    print('no match!!')