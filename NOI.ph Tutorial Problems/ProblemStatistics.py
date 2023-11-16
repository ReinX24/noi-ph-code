contestantCount = int(input())

contestantChars = ''
aCount = bCount = kCount = dCount = 0

for _ in range(contestantCount):
    contestantChars += input()

print(f"{contestantChars.count('A')} {contestantChars.count('B')} {contestantChars.count('K')} {contestantChars.count('D')}")