import turtle
import time
myTurtle = turtle.Turtle()
myTurtle.speed(0)
myTurtle.pensize(3)
myTurtle.goto(0, 0)

# # myTurtle is the turtle in the drawing
# # size is the length of each of the sides of the square


def drawSquare1(myTurtle, squareSize):

    for _ in range(4):
        myTurtle.forward(squareSize)
        myTurtle.right(360/4)

    pass


drawSquare1(myTurtle, 25)

time.sleep(3)
myTurtle.clear()


# # draws a row of squares
# # myTurtle is the turtle doing the drawing
# # length is how many squares are in the row
# # squareSize is the length of each of the sides of each square.
def drawSquare2(myTurtle, length, squareSize):
    for i in range(length):
        for i in range(4):
            myTurtle.forward(squareSize)
            myTurtle.right(360/4)
        myTurtle.forward(squareSize)

    pass


drawSquare2(myTurtle, 5, 25)

time.sleep(3)
myTurtle.clear()


# # myTurtle is the turtle in the drawing
# # the grid will be "size" squares wide and "size" squares tall
# # squareSize is the length of each of the sides of each individual square.
def drawSquare3(myTurtle, size, squareSize):
    for i in range(size):
        for i in range(size):
            for i in range(4):
                myTurtle.forward(squareSize)
                myTurtle.right(360/4)
            myTurtle.forward(squareSize)
        myTurtle.left(180)
        myTurtle.forward(squareSize*size)
        myTurtle.right(90)
        myTurtle.up()
        myTurtle.forward(squareSize)
        myTurtle.right(90)
        myTurtle.down()

    pass


drawSquare3(myTurtle, 5, 25)

time.sleep(3)
myTurtle.clear()

# myTurtle is the turtle doing the drawing
# height is how tall the stairs are going to be
# squareSize is the length of each of the sides of each square.


def drawSquareStairs(myTurtle, height, squareSize):
    for i in range(height):
        for i in range(height):
            for i in range(4):
                myTurtle.forward(squareSize)
                myTurtle.right(360/4)
            myTurtle.forward(squareSize)
        myTurtle.left(180)
        myTurtle.forward(squareSize*height)
        myTurtle.right(90)
        myTurtle.up()
        myTurtle.forward(squareSize)
        myTurtle.right(90)
        myTurtle.down()
        height -= 1


drawSquareStairs(myTurtle, 5, 25)

turtle.done()
