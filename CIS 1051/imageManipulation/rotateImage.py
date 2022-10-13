from turtle import width
import image
# your code here
img = image.Image("./golden_gate.png")
win = image.ImageWin(img.getWidth(), img.getHeight())
img.draw(win)
img.setDelay(1, 2000)   # setDelay(0) turns off animation

for row in range(img.getHeight()):
    for col in range(img.getWidth()):
        v = img.getPixel(col, ((img.getHeight()-1)-row))
        h = img.getPixel(col, ((img.getHeight()-1)-row))
        img.setPixel(col, row, v)
        img.setPixel(col, row, h)
img.draw(win)
win.exitonclick()
