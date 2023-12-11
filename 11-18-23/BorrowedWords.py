s = input().lower()

hiram_letters = 'cfjqvxz'

for char in s:
    if char in hiram_letters:
        print('FOREIGN')
        exit()

print('PINOY')