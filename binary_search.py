# !Problem: look through an array of numbers and find where the value is equals to a given target
def binary_search(list, target):
    first = 0
    last = len(list) - 1

    while first <= last:
        midpoint = (first + last)//2

        if list[midpoint] == target:
            return midpoint
        elif target > list[midpoint]:
            first = midpoint + 1
        else:
            last = midpoint - 1

    return None


def verify(index):
    if index is not None:
        print('Target found at index: ', index)
    else:
        print("Target Not Found")


numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

verify(binary_search(numbers, 9))
# !Written by Levi.dev__
