from typing import List

def distinctisland(matrix: List[List[int]]):
    rowLen = len(matrix)
    colLen = len(matrix[0])
    islandCount = 0 
    distCoord = []
    distIsland = []
    if not matrix:
        print("No island present")
        return islandCount
           
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == 1:
                distCoord = []
                search(matrix, i, j, i, j, distCoord)
                islandCount = islandCount + 1
                #print(distCoord)
                distIsland.append(distCoord)   
    
    distIsland = [list(x) for x in set(tuple(x) for x in distIsland)]           
    return len(distIsland)


def search(matrix, i, j, base1, base2, distCoord):
    if i<0 or i>=len(matrix) or j<0 or j>=len(matrix[0]) or matrix[i][j] != 1:
        return
    matrix[i][j] = -1
    strng1 = str(i - base1)
    strng2 = str(j - base2)
    distCoord.append(strng1 + strng2)
    search(matrix, i+1, j, base1, base2, distCoord)
    search(matrix, i-1, j, base1, base2, distCoord)
    search(matrix, i, j+1, base1, base2, distCoord)
    search(matrix, i, j-1, base1, base2, distCoord)

islands = [[1, 1, 0, 0, 0],
        [1, 1, 0, 0, 0],
        [0, 0, 0, 1, 1],
        [0, 0, 0, 1, 1]]

output = distinctisland(islands)
print (output)
