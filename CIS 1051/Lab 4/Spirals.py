import turtle
import time

myTurtle = turtle.Turtle()
myTurtle.speed(0)


def drawNgon(myTurtle, numSides, sideLength):
    for _ in range(numSides):
        myTurtle.right(360 / numSides)
        myTurtle.forward(sideLength)
    pass


drawNgon(myTurtle, 6, 100)

time.sleep(5)


# draws a spiral of shapes.
# this is done by drawing a single polygon, rotating the turtle a bit,
# drawing another polygon until the spiral is completed.
# numSides defines the shape of the polygons
# sideLength defines how big each polygon is
# numShapes defines how many polygons make up the spiral
def drawNgonSpiral(myTurtle, numSides, sideLength, numShapes):
    myTurtle.clear()
    myTurtle.onclick(None)
    for _ in range(numShapes):
        myTurtle.up()
        myTurtle.right(720 / numShapes)
        myTurtle.forward(1)
        myTurtle.down()
        for _ in range(numSides):
            myTurtle.right(360 / numSides)
            myTurtle.forward(sideLength)
    pass


drawNgonSpiral(myTurtle, 8, 100, 35)
turtle.done()
