
''' Сортитровка пузырьком'''

# def quick_sort(array):
#     if len(array) <= 1:
#         return array
#     else:
#         pivot = array[0]
#     less = [i for i in array[1:] if i <= pivot]
#     print(less)
#     greater = [i for i in array[1:] if i > pivot]
#     print(greater)
#     return quick_sort(less) + [pivot] + quick_sort(greater)

# print(quick_sort([12, 23, 3, 4, 46, 18]))




''' Сортировка слиянием'''

def merge_sort(nums):
    if len(nums) > 1:
        mid = len(nums) // 2
        left = nums[:mid]
        right = nums[mid:]
        merge_sort(left)
        merge_sort(right)
        i = j = k = 0
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                nums[k] = left[i]
                i += 1
            else:
                nums[k] = right[j]
                j += 1
            k += 1
        
        while i < len(left):
            nums[k] = left[i]
            i += 1
            k += 1
        
        while j < len(right):
            nums[k] = right[j]
            j += 1
            k += 1

list_1 = [13, 123, 1312, 124, 3, 45,]
merge_sort(list_1)
print(list_1)