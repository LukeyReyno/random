class word:
    """
    word class
    string - str
    hint - str
    """
    
    def __init__(self, string, hint):
       self.string = string
       self.hint = hint

    def __str__(self):
       return self.string + ": " + self.hint   

word_list = [word("Jazz", "Type of music genre"), \
             word("Classical", "Type of music genre"), \
             word("Funk", "Type of music genre"), \
             word("Strawberry", "Type of fruit"), \
             word("Apple", "Type of fruit"), \
             word("Pear", "Type of fruit"), \
             word("Banana", "Type of fruit"), \
             word("Pineapple", "Type of fruit"), \
             word("Cherry", "Type of fruit"), \
             word("Spaghetti", "Type of pasta"), \
             word("Bear", "Type of animal"), \
             word("Spider", "Type of animal"), \
             word("Shark", "Type of animal"), \
             word("Aardvark", "Type of animal"), \
             word("Doctor", "Type of profession"), \
             word("Scientist", "Type of profession"), \
             word("Engineer", "Type of profession"), \
             word("Lawyer", "Type of profession"), \
             word("Professor", "Type of profession")]