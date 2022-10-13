import turtle

ring = turtle.Turtle()
ring.shape("turtle")
ring.pensize(7)

radius = 50

# Setting up the starting point
ring.penup()
ring.backward(radius*2)
ring.pendown()

# Top three rings
ring.color("blue")
ring.circle(radius)
ring.penup()
ring.forward(radius*2 + radius/5)
ring.pendown()
ring.color("black")
ring.circle(radius)
ring.penup()
ring.forward(radius*2 + radius/5)
ring.pendown()
ring.color("red")
ring.circle(radius)
ring.penup()

# Setting up for bottom rings
ring.left(180)
ring.forward(radius + radius/10)
ring.right(90)
ring.forward(radius)
ring.left(90)

# Bottom two rings
ring.pendown()
ring.color("green")
ring.circle(radius)
ring.penup()
ring.forward(2*radius + radius/5)
ring.pendown()
ring.color("yellow")
ring.circle(radius)

ring.hideturtle()

turtle.done()