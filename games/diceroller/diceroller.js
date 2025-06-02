// DICE ROLLER PROGRAM

function rollDice() {
    const numOfDice = document.getElementById("numOfDice").value;
    const diceResult = document.getElementById("diceResult");
    const diceImages = document.getElementById("diceImages");
    const values = [];
    const images = [];

    for (let i = 0; i < numOfDice; i++) {
        const value = Math.floor(Math.random() * 6) + 1;
        values.push(value);
        images.push(`<img src="images/dice_images/dice${value}.png" alt="Dice ${value}">`);
    }

    const sum = values.reduce((acc, val) => acc + val, 0);

    diceResult.textContent = `🎲 Dice: ${values.join(', ')} | Total: ${sum}`;
    diceImages.innerHTML = images.join('');
}
