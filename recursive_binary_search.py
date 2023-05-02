# !Problem: look through an array of numbers and find where the value is equals to a given target
def recursive_binary_search(list, target):

    if len(list) <= 0:
        return False
    else:
        midpoint = len(list)//2
        if target == list[midpoint]:
            return True
        elif target > list[midpoint]:
            return recursive_binary_search(list[midpoint + 1:], target)
        else:
            return recursive_binary_search(list[:midpoint - 1], target)


def verify(targetFound):
    if targetFound is not True:
        print("Target Not Found")
    else:
        print("Target Was Found")


numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

verify(recursive_binary_search(numbers, 12))
# !Written by Levi.dev__
