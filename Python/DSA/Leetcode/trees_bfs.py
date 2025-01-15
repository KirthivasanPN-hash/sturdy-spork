"""
Psuedocode for  BFS 

function_solve(s):

    q  # enqueue and deque 
    q.enque(s)
    visited = [False,,....False]
    visited[s] = true
    prev = [null..null]

    while !q.isEmpty():
        node = q.enque()
        neighbors = g.get(node)

        for (next: neighbors):
            if !visited(node):
                q.enque(next)
                visited[next] = true
                prev[next] = node
        
        return prev
"""



