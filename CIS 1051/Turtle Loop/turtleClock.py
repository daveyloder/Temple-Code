import turtle
import time

# Setup enviroment
ws = turtle.Screen()
ws.bgcolor("lightblue")
ws.setup(width=600, height=600)
ws.title('"Not a turtle" Analog Clock')
ws.tracer(0)
clock = turtle.Turtle()
clock.hideturtle()
clock.speed(0)
clock.pensize(3)

# Draw the clock
def drawClock(hour, min, second, tur):
    clock.up()
    clock.goto(0, 210)
    clock.setheading(180)
    clock.color("green")
    clock.pendown()
    clock.circle(210)
    clock.up()
    clock.goto(0, 0)
    clock.setheading(90)
    for _ in range(12):
        clock.fd(190)
        clock.pendown()
        clock.fd(20)
        clock.penup()
        clock.goto(0, 0)
        clock.rt(30)
    clockhands = [("white", 80, 12), ("white", 150, 60), ("red", 170, 60)]
    timeset = (hour, min, second)
    for hand in clockhands:
        timepart = timeset[clockhands.index(hand)]
        angle = (timepart/hand[2]) * 360
        clock.penup()
        clock.goto(0, 0)
        clock.color(hand[0])
        clock.setheading(90)
        clock.rt(angle)
        clock.pendown()
        clock.fd(hand[1])

# Applying the time to the drawn clock
while True:
    hour = int(time.strftime("%I"))
    min = int(time.strftime("%M"))
    second = int(time.strftime("%S"))
    drawClock(hour, min, second, clock)
    ws.update()
    time.sleep(1)
    clock.clear()


# scr = turtle.Screen()

# scr.setup(500, 500)

# clock = turtle.Turtle()

# clock.color("red")
# clock.shape("turtle")

# clock.width(5)

# def drawhourhand():
#     clock.penup()
#     clock.home()
#     clock.right(90)
#     clock.pendown()
#     clock.forward(100)

# val = 0

# for i in range(12):
#     val += 1

#     clock.penup()
#     clock.setheading(-30 * (i + 3) + 75)
#     clock.forward(22)
#     clock.pendown()
#     clock.forward(15)
#     clock.penup()
#     clock.forward(20)
#     clock.write(str(val), align="center", font=("Arial", 12, "normal"))
# clock.setpos(2, -112)
# clock.pendown()
# clock.width(2)

# clock.fillcolor("yellow")
# clock.begin_fill()
# clock.circle(7)
# clock.end_fill()

# clock.penup()
# drawhourhand()
# clock.setpos(-18, -62)
# clock.pendown()
# clock.penup()

# clock.hideturtle()
# turtle.done()
