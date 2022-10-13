import turtle

# Setup Enviroment
win = turtle.Screen()
win.setup(width=600, height=300)
pen = turtle.Turtle()
pen.speed()
pen.pensize(5)
pen.color("blue")
pen.shape("turtle")


# Draw First Initial
pen.up()
pen.backward(180)
pen.left(90)
pen.backward(80)
pen.down()
pen.forward(60 * 3)
pen.right(90)
# The Curve in the "D"
for x in range(180):
    pen.forward(1.6)
    pen.right(1)

# Draw Second Initial
pen.up()
pen.right(180)
pen.forward(60 * 3.5)
pen.down()
pen.circle(95, -180)
pen.up()
pen.left(180)
pen.circle(-95, -180)


# Draw Third Initial
pen.left(180)
pen.forward(60 * 3)
pen.left(180)
pen.down()
pen.forward(60 * 2)
pen.right(90)
pen.forward(60 * 3)

pen.hideturtle()

turtle.done()
