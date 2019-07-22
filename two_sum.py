# Time complexity: O(n^2)
# Space complexity: O(1)
list = [-2,7,15,11]
target = 9
def two_sum_brute_force(nums, target):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i] + nums[j] == target:
                sum = nums[i] + nums[j]
                print("at index: " , i, j, "the sum is: ", sum)
                return True
    return False

#Time complexity : O(n)
# space Complexity: O(n)
def two_sum_hash_table(nums, target):
    ht = dict()
    for i in range(len(nums)):
        if nums[i] in ht:
            print(ht[nums[i]], nums[i])
            return True
        else:
            ht[target - nums[i]] = nums[i]
    return False


# Can we do better? YES!!!
# Time complexity: O(n) , since we iterate through the list once
# Space complexity: O(1)
# array is sorted
def two_sum(nums, target):
    i = 0 # i starts at the index 0
    j = len(nums) - 1 # j starts at the last index

    while i <= j:
        if nums[i] + nums[j] == target:
            print(nums[i], nums[j])
            return True
        elif nums[i] + nums[j] < target:
            i += 1
        else: # nums[i] + nums[j] > target
            j -= 1 # decrease j by one
    return False






#two_sum_brute_force(list, target)
#two_sum_hash_table(list, target)
two_sum(list, target)