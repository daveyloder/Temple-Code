import turtle

triangle = turtle.Turtle()
triangle.shape("turtle")
triangle.pensize(5)
triangle.color("gold")

# First Triangle
triangle.forward(100)
triangle.left(120)
triangle.forward(100)
triangle.left(120)
triangle.forward(100)
# Second Triangle
triangle.forward(100)
triangle.left(120)
triangle.forward(100)
triangle.left(120)
triangle.forward(100)
# Third Triangle positioning
triangle.penup()
triangle.left(120)
triangle.forward(100)
triangle.left(120)
triangle.forward(100)
triangle.pendown()
# Third Triangle
triangle.forward(100)
triangle.left(120)
triangle.forward(100)
triangle.left(120)
triangle.forward(100)

triangle.hideturtle()

turtle.done()
