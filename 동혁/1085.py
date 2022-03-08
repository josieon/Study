import sys

x, y, w, h = sys.stdin.readline().split()

sol = []

sol.append(int(x))
sol.append(int(y))
sol.append(int(w)-int(x))
sol.append(int(h)-int(y))

print(min(sol))