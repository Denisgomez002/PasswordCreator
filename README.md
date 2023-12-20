# Password-Creator

This Java Console Application serves to create random passwords and evaluate their strength.


## Key Functionalities

1. Password Generation:
   - User responses of "Yes" or "No" determine the use of uppercase letters, lowercase letters, numbers, or symbols.
   - Users then specify the desired password length.
   - A password alphabet is crafted based on user responses, forming a string containing the chosen characters.
   - Random characters from the password alphabet are selected and combined to create a completely random string based on user preferences.
   - The generated password is displayed on the console.

2. Password Strength Evaluation:
   - Password strength is assessed based on specific criteria:
      - Usage of uppercase letters.
      - Usage of lowercase letters.
      - Usage of numbers.
      - Usage of symbols.
      - Password length of 8 or more (8 being the minimum for a decent password).
      - Password length of 16 or more (16 being the considered minimum for a good password).
   - These criteria determine a score for the password, indicating its strength (weak/medium/good/great).

3. Information Display:
   - This minor feature provides users with console information on password security, advising against using the same password twice and avoiding character repetition, keyboard patterns, dictionary words, letter or number sequences, etc.
