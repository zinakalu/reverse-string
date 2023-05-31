def reverse_string(s):
    chars = list(s)

    left = 0
    right = len(chars)-1

    while left <= right:
        chars[left], chars[right] = chars[right], chars[left]
        left += 1
        right -= 1


    reversed_string = ''.join(chars)
    return reversed_string
print (reverse_string("Zina"))