def shorten_word(word):
    if len(word) > 10:
        return word[0] + str(len(word) - 2) + word[-1]
    return word

def shorten_sentence(sentence):
    words = sentence.split()
    return ' '.join([shorten_word(word) for word in words])

# Test case
sentence = "The demonstration of governments laws makes it difficult to understanding"
print(shorten_sentence(sentence))  # Output: "the d11n of g9s laws makes it difficult to u11g"
