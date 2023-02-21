function translatePigLatin(word) {
  // Check if the word starts with a vowel
  if (word.match(/^[aeiou]/)) {
    // If it does, add "way" at the end
    return word + "way";
  } else {
    const consonantCluster = word.match(/^[^aeiou]+/)[0];
  return word.substring(consonantCluster.length) + consonantCluster + "ay";

  }
}

translatePigLatin("consonant");

// translatePigLatin("california") should return the string aliforniacay.
