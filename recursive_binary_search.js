// ! Problem: look through an array of numbers and find where the value is equals to a given target

const recursive_binary_search = (list, target) => {
  if (list.length <= 0) {
    return false;
  } else {
    let midpoint = Math.floor(list.length / 2);
    if (list[midpoint] == target) {
      return true;
    } else if (target > list[midpoint]) {
      return recursive_binary_search(list.slice(midpoint + 1), target);
    } else {
      return recursive_binary_search(list.slice(0, midpoint - 1), target);
    }
  }
};

function verify(targetFound) {
  if (targetFound !== true) {
    console.log("Target Not Found");
  } else [console.log("Target Was Found")];
}

let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

verify(recursive_binary_search(numbers, 11));

// !Written by Levi.dev__
