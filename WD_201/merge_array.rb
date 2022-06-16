books=["Design as art","Anathem","Shogun"]
authors=["Bruno Munari","Neal Stephenson","James Clavell"]

for j in 0...books.length do
    for k in 0...authors.length do
        if j==k
            p "#{books[j]} is written by #{authors[k]}"
        end
    end
end

