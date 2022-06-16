
  todos=[
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]

todo_money=["money",["Send invoice","Pay rent","Pay taxes"]]
todo_orga=["organize",["Clean room","Arrange books"]]
todo_foo=["food"["Buy groceries"]]

puts "choose one and type money,organize,food"

value =gets.chomp()

if value=="money"
    puts todo_money

elsif value=="organize"
    puts todo_orga

elsif value=="food"
    puts todo_foo
else
    puts "please enter the required value"
end
    