arrayd=[["Nelson Rolihlahla Mandela, hello"],["Sir Alan Turing, welcome"]]

def salute(name,wish)

    "#{wish.capitalize} Mr. #{name.split().last}"
end

puts salute("Nelson Rolihlahla Mandela", "hello")
puts salute("Sir Alan Turing", "welcome")

