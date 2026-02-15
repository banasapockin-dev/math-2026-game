function checkAnswer() {
  const userAnswer = document.getElementById('answer').value;
  const correctAnswer = 0.5; // синус 30°

  if (parseFloat(userAnswer) === correctAnswer) {
    document.getElementById('result').textContent = 'Правильно!';
  } else {
    document.getElementById('result').textContent = 'Неправильно. Попробуйте снова.';
  }
}
