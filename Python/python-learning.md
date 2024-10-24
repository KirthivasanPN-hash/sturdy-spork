https://github.com/Pierian-Data/Complete-Python-3-Bootcamp 

00 Python Object and Data structures basics

datatype:
1. int 
2. float
3. Str
4. list
5. dict
6. tup
7. set
8. bool


7//4 = 1 //floor division
2**0.5 //sqroots

Python uses dynamic typing means u can reassign variables to different data types

Cons:
1. may result in bugs 
2. should be carefull with type()
syntax
type(a) //returns type of variable

other language such java it is statically typed such 
int a = 1
a = "HI" //error

restarting the kernel will erase all the memory even value of variables

Strings
1. Strings are immutable means can't be edited 
Example:
print('Hello World 1')
print('Hello World 2')
print('Use \n to print a new line')
print('\n')
print('See what I mean?')

Hello World 1
Hello World 2
Use 
 to print a new line


See what I mean?

2. len('Hello World')

3. S = "hello world"
s[1:] = 'ello World'
s[:3] = 'Hel'
s[:]  = prints the whole string
s[:-1]  = 'Hello Worl'
# Grab everything, but go in step sizes of 2
s[::2] = 'HloWrd'
s[::-1] = //string backwards
                                                                                            
can multiply string  = a*10 //hello world 10 times
statement: 'Insert another string with curly brackets: {}'.format('The inserted string')
answer: 'Insert another string with curly brackets: The inserted string'


4. Formatting with placeholders
print("I'm inserting %s nvm." %'what?') 
print("I'm going to inject %s text here, and %s text here." %('some','more'))

x, y = 'some', 'more'
print("I'm going to inject %s text here, and %s text here."%(x,y))


5. Format conversion methods.
It should be noted that two methods %s and %r convert any python object to a string using two separate methods: str() and repr(). We will learn more about these functions later on in the course, but you should note that %r and repr() deliver the string representation of the object, including quotation marks and any escape characters.


Statement:
print('I once caught a fish %s.' %'this \tbig')
print('I once caught a fish %r.' %'this \tbig')

Output:
I once caught a fish this 	big.
I once caught a fish 'this \tbig'.


6. Padding and Precision of Floating Point Numbers

Statement:
print('Floating point numbers: %10.2f' %(13.144))  

Output:
Floating point numbers:      13.14

7. Multiple Formatting

Statement:
print('First: %s, Second: %5.2f, Third: %r' %('hi!',3.1415,'bye!'))

Output:
First: hi!, Second:  3.14, Third: 'bye!'

8. The .format() method has several advantages over the %s placeholder method:

Statement:
print('The {2} {1} {0}'.format('fox','brown','quick'))

Output:
The quick brown fox

9. Alignment, padding and precision with .format()


print('{0:<8} | {1:^8} | {2:>8}'.format('Left','Center','Right'))
print('{0:<8} | {1:^8} | {2:>8}'.format(11,22,33))

Left     |  Center  |    Right
11       |    22    |       33

print('{0:=<8} | {1:-^8} | {2:.>8}'.format('Left','Center','Right'))
print('{0:=<8} | {1:-^8} | {2:.>8}'.format(11,22,33))

Left==== | -Center- | ...Right
11====== | ---22--- | ......33



27/04

Formating string with format()

1. print('First Object: {a}, Second Object: {b}, Third Object: {c}'.format(a=1,b='Two',c=12.3))

2. print('{0:8} | {1:9}'.format('Fruit', 'Quantity'))

ouput: Fruit    | Quantity 

3. print('{0:<8} | {1:^8} | {2:>8}'.format('Left','Center','Right'))

output: Left     |  Center  |    Right

4. print('{0:=<8} | {1:-^8} | {2:.>8}'.format('Left','Center','Right'))

output: Left==== | -Center- | ...Right

5. From 3.6 python offers various benefits 

name = 'Fred'
print(f"He said his name is {name}.") --> Fred
print(f"He said his name is {name!r}") --> 'Fred'


6. num = 23.45678
print("My 10 character, four decimal number is:{0:10.4f}".format(num))
print(f"My 10 character, four decimal number is:{num:{10}.{6}}")

Output:
My 10 character, four decimal number is:   23.4568
My 10 character, four decimal number is:   23.4568


LIST:

1.) Creating lists
2.) Indexing and Slicing Lists
3.) Basic List Methods
4.) Nesting Lists
5.) Introduction to List Comprehensions


1. Appending list items
my_list = ['one','two','three',4,5]

my_list + ['new item']

Pop() function works from the back, pops the last item in the list

Nesting Lists
A great feature of of Python data structures is that they support nesting. This means we can have data structures within data structures. For example: A list inside a list.

1. # Let's make three lists
lst_1=[1,2,3]
lst_2=[4,5,6]
lst_3=[7,8,9]

# Make a list of lists to form a matrix
matrix = [lst_1,lst_2,lst_3]

//calling 
matrix

Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

List Comprehensions
first_col = [row[0] for row in matrix]

//calling
first_col

//output 
[1,4,7]
We used a list comprehension here to grab the first element of every row in the matrix object. 


30/04

1. Indexing and Slicing
my_list = ['one','two','three',4,5]

my_list[:3]
['one', 'two', 'three']

2. sort() sorts..



3. Dictionaries

Mappings in Python and similar to hashtable in other languages.

1.) Constructing a Dictionary
2.) Accessing objects from a dictionary
3.) Nesting Dictionaries
4.) Basic Dictionary Methods

 Mappings are a collection of objects that are stored by a key, unlike a sequence that stored objects by their relative position. This is an important distinction, since mappings won't retain order since they have objects defined by a key.

3.1 Constructing a Dictionary

mydict = {'key1':'value1', 'key1':'value2'}
//caling
mydict[key1]
//calls the value for the key

Dictionaries are flexible with the data types they hold. 
my_dict = {'key1':123,'key2':[12,23,33],'key3':['item0','item1','item2']}   



# Can then even call methods on that value
my_dict['key3'][0].upper()
//output 
ITEM0

# Nesting with Dictionaries
d = {'gkey':{'parent_key':{'child_key':'value'}}}

//calling keys
d['gkey']['parent_key']['child_key']


# A few Dictionary Methods
d = {'key1':1,'key2':2,'key3':3}
//calling keys
d.keys()

//calling values
d.values()

//returns tuples of all items.
d.items()

//output
dict_items([('key1', 1), ('key2', 2), ('key3', 3)])

4. Tuples
In Python tuples are very similar to lists, however, unlike lists they are immutable meaning they can not be changed. You would use tuples to present things that shouldn't be changed, such as days of the week, or dates on a calendar.

1.) Constructing Tuples
2.) Basic Tuple Methods
3.) Immutability
4.) When to Use Tuples

4.1 Contructing Tuples
t = (1,2,3)



# Slicing just like a list
t[-1]
 //output
 2

When to use Tuples??
You may be wondering, "Why bother using tuples when they have fewer available methods?" To be honest, tuples are not used as often as lists in programming, but are used when immutability is necessary. If in your program you are passing around an object and need to make sure it does not get changed, then a tuple becomes your solution. It provides a convenient source of data integrity.

You should now be able to create and use tuples in your programming as well as have an understanding of their immutability.

5. Sets

Sets are an unordered collection of unique elements. We can construct them by using the set() function. 
x = set()
x.add(1)
x
//output
{1}

# a set is only concerned with unique elements! We can create a list with multiple repeat elements to a set to get the unique elements. 


5. Files
Python uses file objects to interact with external files on your computer. These file objects can be any sort of file you have on your computer, whether it be an audio file, a text file, emails, Excel documents, etc. Note: You will probably need to install certain libraries or modules to interact with those various file types, but they are easily available. (We will cover downloading modules later on in the course).

Python has a built-in open function that allows us to open and play with basic file types. First we will need a file though. We're going to use some IPython magic to create a text file!


IPython Writing a File
This function is specific to jupyter notebooks! Alternatively, quickly create a simple .txt file with sublime text editor.

## try this in jupyter

%%writefile test.txt
yoo, wasssup

pwd //checks if the notebook is in same directory

commands
myfile = open('file.txt')
myfile.read()
//output
'' //nothing to read

This happens because you can imagine the reading "cursor" is at the end of the file after having read it. So there is nothing left to read. We can reset the "cursor" like this:

myfile.seek(0)
now you can read from the start



# 31/05/23

50*(2)+0.25


# 18/06 

for loop in strings 
Code:
for letter in 'This is a string.':
    print(letter)

Output:
T
h
i
s
 
i
s
 
a
 
s
t
r
i
n
g
.

## Dictionaries 
dic_items = ([('k1',1),('k2',2),('k3',3)])

for k,v in d.items 
print(k)
print(v)

k1
1
k2
2
k3
3

note: dictionaries are always unsorted so, u got to sort them

list(d.keys())

sorted(d.values())


## Enumerate

# Without enumerate
index_count = 0

for letter in 'abcde':
    print("At index {} the letter is {}".format(index_count,letter))
    index_count += 1

Output:
At index 0 the letter is a
At index 1 the letter is b
At index 2 the letter is c
At index 3 the letter is d
At index 4 the letter is e

# With enumerate

for i,letter in enumerate('abcde'):
    print("At index {} the letter is {}".format(i,letter))

Output:
At index 0 the letter is a
At index 1 the letter is b
At index 2 the letter is c
At index 3 the letter is d
At index 4 the letter is e

# Enumerate using list
list(enumerate('abcde'))

Output:
[(0, 'a'), (1, 'b'), (2, 'c'), (3, 'd'), (4, 'e')]


# Zip
mylist1 = [1,2,3,4,5]
mylist2 = ['a','b','c','d','e']
list(zip(mylist1,mylist2))

Output:
[(1, 'a'), (2, 'b'), (3, 'c'), (4, 'd'), (5, 'e')]


Few built in functions 
# in()
# not in()
# min()
# max()
# random() --> randint(0,100) 

## List Comprehensions

1. lst = [x for x in 'word']
print(lst)

output
lst = [x for x in 'word']
print(lst)

2. Square root for all the numbers

lst = [x**2 for x in range(0,11)]
print(lst)

output
[0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

3. Alternative way to print list 
lst = [x for x in range(11) if x%3==0]
print

4. basic celsius to farenheit coversion

celsius = [23.0,28.0,32.0]

lst = [((9/5)*temp+32) for temp in celsius]
print(lst)

output
[73.4, 82.4, 89.6]

5. Nested list
lst = [x**2 for x in [x**2 for in range (11)]]
print(lst)

output:
[0, 1, 16, 81, 256, 625, 1296, 2401, 4096, 6561, 10000]


# Assignment

1. st = 'Print only the words that start with s in this sentence'
for x in st.split(): 
    if x[0]=='s':
        print(x)

2. Use range() to print all the even numbers from 0 to 10.
list(range(0,11,2))


3. [x for x in range(1,51) if x%3 == 0]

[3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48]
 

4. st = 'Print every word in this sentence that has an even number of letters'
for w in st.split():
    if len(w)%2 ==0:
        print(w)


5. Write a program that prints the integers from 1 to 100. But for multiples of three print "Fizz" instead of the number, and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

for num in range(1,101):
    if num % 3 == 0 and num % 5 == 0:
        print("FizzBuzz")
    elif num % 3 == 0:
        print("Fizz")
    elif num % 5 == 0:
        print("Buzz")
    else:
        print(num)


6.  Use List Comprehension to create a list of the first letters of every word in the string below:

st = 'Create a list of the first letters of every word in this string'

Ans: lst = [word[0] for word in st.split()]
print(lst)


### GUESS GAME

import random
x = random.randint(0,100)

guesses = [0]

while True:
    
    guess = int(input("I think the number is between 1 and 100.\n What is your guess?"))
    
    if guess < 1 or guess > 100:
        print('OUT OF BOUNDS! please try again')
        continue
    
    if guess==x:
        print(f'CONGRATULATIONS, you guessed it in only {len(guesses)} GUESSES!!')
        break
        
    
    guesses.append(guess)
    
    if guesses[-2]:
        if abs(x-guess) < abs(x-guesses[-2]):
            print('WARMER!')
        
        else:
            print('COLDER!')
            
    else:
        
        if abs(x-guess) <=10:
            print('WARM!')
            
        else:
            print('COLD!')


# Methods

1. Method perform specific actions on object and can also make arguments just like functions 

object,method(arg1,arg2,etc..)

few built in methods

    append
    count
    extend
    insert
    pop
    remove
    reverse
    sort


# Functions

def function_name(name):
    print(f'Eloo {name}')

//calling
print(name)

2. The return keyword allows you to actually save the result of the output of a function as a variable. The print() function simply displays the output to you, but doesn't save it for future use. Let's explore this in more detail

3. Eg:

def print_result(a,b)
print(a+b)

my_result = print_result(20,20)
o/p: 40

my_result //calling
type(my_result)
o/p: NoneType

4. Difference between return and print

def return_result(a,b)
    return a+b

my_result = return_result(20,20)
o/p: 40 

my_result+my_result
o/p: 80

5. Function to return list of even numbers //for IDE

even_numbers = []

def check_list(num_lst):
    for num in num_lst:
        if num%2==0:
            even_numbers.append(num)
            
        else:
            pass
            
    return even_numbers
    
print(check_list([1,2,3]))

6. Unpacking tuples:

prices = [('AAPL',100),('GOOG',200),('NKE',300)]


a. for item in prices:
print(item)

o/p:
('AAPL', 200)
('GOOG', 300)
('MSFT', 400)
    
b. for stock, price in prices:
        print(stock/price)

o/P:
stock   price
AAPL    200 300 400
GOOG
MSFT 

7. Max value:
work_hours = [('Abby',100),('Billy',400),('Cassie',800)]

def employee_check(work_hours):
    
    # Set some max value to intially beat, like zero hours
    current_max = 0
    # Set some empty value before the loop
    employee_of_month = ''
    
    for employee,hours in work_hours:
        if hours > current_max:
            current_max = hours
            employee_of_month = employee
        else:
            pass
    
    # Notice the indentation here
    return (employee_of_month,current_max)

employee_check(work_hours)

('Cassie', 800)

8.  A small game

from random import shuffle

my_lst = ['0','','']

def shuffle_lst(my_lst):
    shuffle(my_lst)
    
    return my_lst
    

def player_guess():
    
    guess = ''
    
    while guess not in ['0','1','2']:
        
        guess = input("Pick a number: 0,1 or 2: ")
        
    return int(guess)
    
def check_guess(my_lst,guess):
    
    if my_lst[guess] == '0':
        print('Congrats!, Correct guess')
    
    else:
        print('Try again')
        print(my_lst)
        
# runnning the functions 

my_lst = ['0','','']

mixed_lst = shuffle_lst(my_lst)

guess = player_guess()

print(check_guess(shuffle_lst,guess))





