n = int(input())

contestants = []

for _ in range(n):
    name, score = input().split()
    score = int(score)
    contestants.append((name, score))

# Sort contestants by score and then by name
contestants.sort(key=lambda x: (-x[1], x[0]))

# Print the sorted contacts
for contestant in contestants:
    print(contestant[0], contestant[1])