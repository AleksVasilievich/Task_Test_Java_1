import random

# Сортировка quicksort

def quicksort(nums):
   if len(nums) <= 1:
       return nums
   else:
       q = random.choice(nums)
   l_nums = [n for n in nums if n < q]             
 
   e_nums = [q] * nums.count(q)
   b_nums = [n for n in nums if n > q]
   return quicksort(l_nums) + e_nums + quicksort(b_nums)

nums = [4, 11, -5, 56, 0, 3, 10, -9, 12]
a = quicksort(nums)
print(nums)
print(a)