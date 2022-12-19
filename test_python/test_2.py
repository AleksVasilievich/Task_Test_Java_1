# Быстрая сортировка !!!

import random

def quicksort(nums):
    if len(nums) <= 1:
        return nums
    else:
        q = random.choice(nums)
        s_nums = []
        m_nums = []
        e_nums = []
        for n in nums:
            if n < q:
                s_nums.append(n)
            elif n > q:
                m_nums.append(n)
            else:
                e_nums.append(n)
        return quicksort(s_nums) + e_nums + quicksort(m_nums)
        

nums = [4, -5, 56, 0, 3, 10, -9, 12]
a = quicksort(nums)
print(nums)
print(a)