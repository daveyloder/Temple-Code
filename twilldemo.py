from twill.commands import *
go("https://google.com")

fv('1', 'q', '$query')
submit('btnI')

show()
