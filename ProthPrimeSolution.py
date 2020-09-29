#Taiwo Olatunji Yusuf 

#Python solution

#Comuter Science

#GitHub - @69codes

#Question: 
#Write a function that takes in a Proth Number and uses Proth's 
#theorem to determine if said number is prime? 


#Break down of the question: The function takes in a "PROTH NUMBER", and determines if the number is prime, using
# Proth's theorem.

# The Proth's theorem states that for a number (p) to be Prime, there must be a number "i" such that, "i" raised to the power
# of ((p-1) / 2) then  plus 1, must be diviible by p.

#methodology: With deeper research, if a number is a proth prime, there is a 50% chance that any number will work as i. Therefore
# we don't need to iterate past the first 10 digits.

#The Set back with this method is, when you raise a number to a very high figure, it tends to approximate, making the
#result inaccurate, Pyhton has a limit of 32 bits for figures.


num = []
def IsProthPrime(p):
    for i in range(10):
        num.append((((i)**((p - 1)/2)) + 1) % p) 
    if 0 in num:
        print(p, "is a Prime Number")
    else:
        print(p, "is not a Prime Number")

IsProthPrime(25)
IsProthPrime(3)