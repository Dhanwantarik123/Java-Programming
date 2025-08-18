import numpy as np

# 1D Array
arr = np.array([1, 2, 3, 4, 5, 6])
print("Original Array:", arr)

print("Last 3 elements:", arr[-3:])     
print("Elements from index 1 to 3:", arr[1:4])     
print("Last element:", arr[-1::])    
print("Reverse Array:", arr[::-1])    

# This slice gives empty because it goes forward by default
print("arr[-1:-3] (empty because slicing is forward):", arr[-1:-3])  

# Dimension of arr
print("Dimension of arr:", arr.ndim)  

# 3D Array
arr1 = np.array([[[1, 2, 3], [7, 4, 5]], [[2, 3, 4], [2, 4, 4]]])
print("\nThree Dimensional Array:\n", arr1)

print("Dimension of arr1:", arr1.ndim)
print("Datatype of arr1:", arr1.dtype)
print("Shape of arr1:", arr1.shape)
print("Size of arr1:", arr1.size)

# Array with higher dimension
arr2 = np.array([1, 2, 3, 4, 5, 6], ndmin=5)
print("\nArray with ndmin=5:\n", arr2)

# Loop through arr
print("\nLooping through arr:")
for x in arr:
    print("Element:", x)

# Nested loops for arr1
print("\nLooping through arr1 (nested loops):")
for x in arr1:
    for y in x:
        for z in y:
            print("Element:", z)

# Using nditer (best for multidimensional arrays)
print("\nLooping through arr1 using nditer:")
for x in np.nditer(arr1):
    print("Element:", x)