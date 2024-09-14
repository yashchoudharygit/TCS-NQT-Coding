def remove_inner_vowels(s):
    vowels = "aeiouAEIOU"
    modified_str = ""
    
    for i in range(len(s)):
        if s[i] in vowels:
            if i > 0 and i < len(s) - 1 and s[i-1] not in vowels and s[i+1] not in vowels:
                continue  
        modified_str += s[i]
    return modified_str

# Example usage
input_str =input()
output_str = remove_inner_vowels(input_str)
print(output_str)