import turtle

pen = turtle.Turtle()
pen.pensize(7)
pen.shape("turtle")

sides = int(input("Please enter a number for sides: "))
print(sides)
for _ in range(sides):
    pen.right(360 / sides)
    pen.forward(500)
    

pen.hideturtle()

turtle.done()