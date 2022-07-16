# Page 3


### What is libft.a?

libft.a is a library, which we'll be using for almost all our next projects.

> The project aims to code a C library regrouping usual functions that you'll be use for all your next projects.
> 
> 
> *-from subject.pdf p.0*
> 

 

 So what is a library?

 You know, it can't be a place full of books.

 > In computer science, a library is a collection of non-volatile resources used by computer programs, often for software development. These may include configuration data, documentation, help data, message templates, pre-written code and subroutines, classes, values or type specifications.
 > 
 > 
 > *-from. wikipedia*
 > 

 As you see from above, a library is a set of non-volatile resources used in computer programs. In this project, we're going to make a *static library* that contains some usual functions. If you want to know more about the library or static library, see here.

### So, why do we have to make our own library?

In the journey of 42Seoul(or 42Paris, etc), you can only use allowed functions, like in La-Piscine. If you’ve experienced La-Piscine, do you remember the projects we have done? We had to make ft_strlen in almost projects. Or ft_putstr, or ft_putnbr, etc.

After we make libft.a, we don’t have to add lines to use usual functions like ft_strlen or ft_strlcat. To use it, you’ll simply put the libft.a file in the project file and compile it together.

example.

To compile a program that needs ft_strlen.o, you will do like this. 

```bash
cc -Wall -Werror -Wextra main.c libft.a
```

After we make libft.a, we don’t need to use our times and efforts to put lines for usual functions.

