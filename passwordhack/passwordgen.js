// RANDOM PASSWORD GENERATOR

function generatePassword(length, includeLowerCase, includeUpperCase, includeNumbers, includeSymbols) {

    const lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
    const upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const numChars = "0123456789";
    const symbolChars = "!@#$%^&*()_+=/''~`<>?\|{}[]:;";

    let allowedChars = "";
    let password = "";

    allowedChars += includeLowerCase ? lowerCaseChars : "";
    allowedChars += includeUpperCase ? upperCaseChars : "";
    allowedChars += includeNumbers ? numChars : "";
    allowedChars += includeSymbols ? symbolChars : "";

    if (length <= 0) {
        return `(Password length must be atleast 1!)`;
    }

    if (allowedChars.length === 0) {
        return `(Atleast 1 set of characters needs to be selected!)`;
    }

    for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * allowedChars.length);
        password += allowedChars[randomIndex];
    }

    return password;
}

const passwordLength = 15;
const includeLowerCase = true;
const includeUpperCase = true;
const includeNumbers = true;
const includeSymbols = true;

const password = generatePassword(passwordLength,
    includeLowerCase,
    includeUpperCase,
    includeNumbers,
    includeSymbols);

console.log(`Generated password: ${password}`);
