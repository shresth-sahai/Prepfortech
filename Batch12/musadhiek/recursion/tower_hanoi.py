def moveDisks(n, toRod, fromRod, moves):
    if (n == 1):
        moves.append([fromRod, toRod])
        print(moves,"base")
        return
    rem = 1 ^ 2 ^ 3 ^ toRod ^ fromRod
    print(rem,"rem")
    moveDisks(n - 1, rem, fromRod, moves)
    moves.append([fromRod, toRod])
    print(moves,"second")
    moveDisks(n - 1, toRod, rem, moves)

def towerOfHanoi(n):
    moves = []
    moveDisks(n, 3, 1, moves)
    return moves
print(towerOfHanoi(3))
