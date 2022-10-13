import turtle


def irma_setup():
    """Creates the Turtle and the Screen with the map background
       and coordinate system set to match latitude and longitude.

       :return: a tuple containing the Turtle and the Screen

       DO NOT CHANGE THE CODE IN THIS FUNCTION!
    """
    import tkinter
    turtle.setup(965, 600)  # set size of window to size of map

    wn = turtle.Screen()
    wn.title("Hurricane Irma")

    # kludge to get the map shown as a background image,
    # since wn.bgpic does not allow you to position the image
    canvas = wn.getcanvas()
    # set the coordinate system to match lat/long
    turtle.setworldcoordinates(-90, 0, -17.66, 45)

    map_bg_img = tkinter.PhotoImage(file="images/atlantic-basin.png")

    # additional kludge for positioning the background image
    # when setworldcoordinates is used
    canvas.create_image(-1175, -580, anchor=tkinter.NW, image=map_bg_img)

    t = turtle.Turtle()
    wn.register_shape("images/hurricane.gif")
    t.shape("images/hurricane.gif")

    return (t, wn, map_bg_img)


def irma():
    """Animates the path of hurricane Irma
    """
    (t, wn, map_bg_img) = irma_setup()

    # your code to animate Irma here

    # Opening csv file and retrieving longitude, latitude, and wind speed
    # Used with statement to keep formatting cleaner with using open function
    # Used open function to open irma data file in '/data/irma.csv' and open as read only
    # Named file to be used as a variable "openFile"
    with open('data/irma.csv', 'r') as openFile:
        # Created a vairable called 'lines' and assigned a for loop to it.
        # Uses increment variable 'line' and used strip() to remove any whitespace before and after.
        # The for loop then uses line as the increment and goes line by line using openFile.readlines() function
        lines = [line.strip() for line in openFile.readlines()]
        # Remove header of csv file
        lines = lines[1:]
        # For loop to split info into new list for each row and seperate via columns of csv
        lines = [line.split(',') for line in lines]
        # Create a new list of just long, lat, and windspeed and insert into a new list itself
        lines = [line[2:5] for line in lines]

    # Setting up hurricane starting point
    t.penup()

    # Create start point at first item in lines list
    start = lines[0]
    # Assign y-axis to first list item and first item in that list
    yStart = start[0]
    # Assign x-axis to first list item and second item in that list
    xStart = start[1]

    # Convert xStart, and yStart to a float to round up to whole number

    xStart = float(xStart)
    yStart = float(yStart)

    # Hides the hurricane until it gets to the starting point
    t.hideturtle()

    # Set hurricane's x and y coordinates
    t.setx(xStart)
    t.sety(yStart)

    for i in range(len(lines)):

        update = lines[i]

        y = update[0]
        x = update[1]
        cat = update[2]
        cat = int(cat)
        # cast list x and y as floats
        x = float(x)
        y = float(y)

        # if-else to compare wind speeds to determine category
        # colors hurricane based off category 1-5 & changes pen thickness
        if cat < 74:

            t.width(1)
            t.pencolor("white")

        elif cat >= 74 and cat <= 95:

            t.width(3)
            t.pencolor("blue")
            t.write("1", font=("Arial", 8))

        elif cat >= 96 and cat <= 110:

            t.width(5)
            t.pencolor("green")
            t.write("2", font=("Arial", 8))

        elif cat >= 110 and cat <= 129:

            t.width(7)
            t.pencolor("yellow")
            t.write("3", font=("Arial", 8))

        elif cat >= 130 and cat <= 156:

            t.width(8)
            t.pencolor("orange")
            t.write("4", font=("Arial", 8))

        elif cat >= 158:

            t.width(11)
            t.pencolor("red")
            t.write("5", font=("Arial", 8))

        i += 3
        # turtle is shown and starts the path incremented by the loop
        t.showturtle()
        t.pendown()
        t.goto(x, y)

    wn.exitonclick()


if __name__ == "__main__":
    irma()
