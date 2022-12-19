#  Быстрая сортировка 2 !!!

import random
# nums = [4, -5, 56, 0, 3, 10, -9, 12]

def quicksort(nums, fst, lst):
    if (fst >= lst):
        return

    # nums = [4, -5, 56, 0, 3, 10, -9, 12]

    i, j = fst, lst
    pivot = nums[random.randint(fst, lst)]

    # print(nums)

    while (i <= j):
        while (nums[i] < pivot):
            i += 1
        while (nums[j] > pivot):
            j -= 1
        if (i <= j):
            nums[i], nums[j] = nums[j], nums[i]          #  Где то ошибка !!! (Неправильно подставляются значения 
            i, j = i + 1, j - 1                          #  и вывод на печать )!!!

    quicksort(nums, fst, j)
    quicksort(nums, i, lst)



    nums = [4, -5, 56, 0, 3, 10, -9, 12]
    # print(nums)
    a = quicksort(nums, fst, lst)
    print(a)
