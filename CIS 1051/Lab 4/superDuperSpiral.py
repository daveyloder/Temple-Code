import turtle

myTurtle = turtle.Turtle()
myTurtle.speed(0)
color = ['purple', 'blue']


def drawNgonSpiral(myTurtle, numSides, sideLength, numShapes):
    myTurtle.clear()
    myTurtle.onclick(None)
    for _ in range(numShapes):
        myTurtle.up()
        myTurtle.right(720 / numShapes)
        myTurtle.forward(1)
        myTurtle.down()
        for _ in range(numSides):
            myTurtle.color(color[_ % 2])
            myTurtle.right(360 / numSides)
            myTurtle.forward(sideLength)
    pass


drawNgonSpiral(myTurtle, 8, 100, 35)
turtle.done()
