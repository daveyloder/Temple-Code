import turtle

ws = turtle.Turtle()
ws.speed(0)
ws.color("cyan")

for j in range(1,100):
    for i in range(1,6):
        ws.left(144)
        ws.forward(200)
    ws.left(5)
turtle.done()