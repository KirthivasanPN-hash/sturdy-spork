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







