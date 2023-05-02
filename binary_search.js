// !Problem: look through an array of numbers and find where the value is equals to a given target
const binary_search = (list, target) => {
  let first = 0;
  let last = list.length - 1;

  while (first <= last) {
    let midpoint = Math.floor((first + last) / 2);

    if (list[midpoint] == target) {
      return midpoint;
    } else if (target > list[midpoint]) {
      first = midpoint + 1;
    } else {
      last = midpoint - 1;
    }
  }
  return null;
};

function verify(index) {
  if (index !== null) {
    console.log("Target was found at index: " + index);
  } else {
    console.log("Target was not found");
  }
}
var numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
verify(binary_search(numbers, 10));
// !Written by Levi.dev__
