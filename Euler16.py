#!/usr/bin/python3
import math

x = str(int((math.pow(2,1000))))
sum = 0
for i in range(len(x)):
    sum = sum + int(x[i])
print(sum)
