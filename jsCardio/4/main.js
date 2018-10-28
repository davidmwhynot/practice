// display logistics
let con4 = document.getElementById("session4");

// test data


// functions
// CHALLENGE 1a: ADD ALL NUMBERS (es5)
// Return a sum of all parameters entered regardless of the amount of numbers - NO ARRAYS
// ex. addAll(2,5,6,7) === 20

function addAlla() {
	let output = 0;
	for(let i = 0; i < arguments.length; ++i) {
		output += arguments[i];
	}
	return output;
}
// CHALLENGE 1b: ADD ALL NUMBERS (es6)
// Return a sum of all parameters entered regardless of the amount of numbers - NO ARRAYS
// ex. addAll(2,5,6,7) === 20

function addAllb(...terms) {
	return terms.reduce((total, current) => total + current);
}

// CHALLENGE 2: SUM ALL PRIMES
// Pass in a number to loop up to and add all of the prime numbers. A prime number is a whole number greater than 1 whose only factors are 1 and itself
// ex. sumAllPrimes(10) == 17

function sumAllPrimes(n) {
	let total = 0;
	for(let i = 2; i <= n; ++i) {
		if(isPrime(i)) total += i;
	}
	return total;
}
function isPrime(n) {
	// log('isPrime(n)');
	// log('n: ' + n);
	// log('Math.floor(n / 2): ' + Math.floor(n / 2));
	// for(let i = 2; i <= Math.floor(n / 2); ++i) {
	for(let i = 2; i <= n / 2; ++i) {
		// log('i: ' + i);
		// log('n % i: ' + (n % i));
		if(n % i == 0) {
			return false;
		}
	}
	return true;
}

// CHALLENGE 3: SEEK & DESTROY
// Remove from the array whatever is in the following arguments. Return the leftover numbers in an array
// ex. seekAndDestroy([2, 3, 4, 6, 6, 'hello'], 2, 6) == [3, 4, 'hello']

function seekAndDestroy(inputArray, ...args) {
	return inputArray.filter(ele => !args.includes(ele));
}

// CHALLENGE 4: SORT BY HEIGHT
// Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
// ex.
// a = [-1, 150, 190, 170, -1, -1, 160, 180]
// sortByHeight(a) == [-1, 150, 160, 170, -1, -1, 180, 190]

function sortByHeight(a) {
	let treeIndexes = [];
	for(i in a) {
		if(a[i] == -1) treeIndexes.push(i);
	}
	let people = a.filter(person => person != -1).sort((a, b) => a - b);
	let output = [];
	let numTrees = 0;
	let numPeople = 0;
	for(let i = 0; i < a.length; ++i) {
		if(treeIndexes[numTrees] == i) {
			++numTrees;
			output.push(-1);
		} else {
			output.push(people[numPeople++]);
		}
	}
	return output;
}

// CHALLENGE 5: MISSING LETTERS
// Find the missing letter in the passed letter range and return it. If all letters are present, return undefined
// ex.
// missingLetters("abce") == "d"
// missingLetters("abcdefghjklmno") == "i"
// missingLetters("abcdefghijklmnopqrstuvwxyz") == undefined

function missingLetters(s) {
	let output;
	let inputCodes = Array.from(s, letter => letter.charCodeAt(0));
	for(let i = 0; i < inputCodes.length - 1; ++i) {
		let delta = inputCodes[i + 1] - inputCodes[i];
		if(delta > 1) {
			output = '';
			for(let j = 1; j < delta; ++j) {
				output += String.fromCharCode(inputCodes[i] + j);
			}
		}
	}
	return output;
}

// CHALLENGE 6: EVEN & ODD SUMS
// Take in an array and return an array of the sums of even and odd numbers
// ex.
// evenOddSums([50, 60, 60, 45, 71]) == [170, 116]

function evenOddSums(a) {
	let summer = (total, ele) => total + ele;
	return [
		a.filter(i => i % 2 == 0).reduce(summer),
		a.filter(i => i % 2 != 0).reduce(summer)
	];
}

// test functions
let output4 = `
	<div>
		<h4>Challenge 1a:</h4>
		addAlla(2, 5, 6, 7)
		<br />
		${addAlla(2, 5, 6, 7)}
	</div>
	<div>
		<h4>Challenge 1b:</h4>
		addAllb(2, 5, 6, 7, 5)
		<br />
		${addAllb(2, 5, 6, 7, 5)}
	</div>
	<div>
		<h4>Challenge 2:</h4>
		sumAllPrimes(10)
		<br />
		${sumAllPrimes(10)}
		<br />
		<br />
		sumAllPrimes(11)
		<br />
		${sumAllPrimes(11)}
		<br />
		<br />
		sumAllPrimes(1000)
		<br />
		${sumAllPrimes(1000)}
	</div>
	<div>
		<h4>Challenge 3:</h4>
		JSON.stringify(seekAndDestroy([2, 3, 4, 6, 6, 'hello'], 2, 6)) == JSON.stringify([3, 4, 'hello'])
		<br />
		${JSON.stringify(seekAndDestroy([2, 3, 4, 6, 6, 'hello'], 2, 6)) == JSON.stringify([3, 4, 'hello'])}
	</div>
	<div>
		<h4>Challenge 4:</h4>
		JSON.stringify(sortByHeight([-1, 150, 190, 170, -1, -1, 160, 180])) == JSON.stringify([-1, 150, 160, 170, -1, -1, 180, 190])
		<br />
		${JSON.stringify(sortByHeight([-1, 150, 190, 170, -1, -1, 160, 180])) == JSON.stringify([-1, 150, 160, 170, -1, -1, 180, 190])}
	</div>
	<div>
		<h4>Challenge 5:</h4>
		missingLetters("abce") == "d"
		<br />
		${missingLetters("abce") == "d"}
		<br />
		<br />
		missingLetters("abcdefghjklmno") == "i"
		<br />
		${missingLetters("abcdefghjklmno") == "i"}
		<br />
		<br />
		missingLetters("abcdefghijklmnopqrstuvwxyz") == undefined
		<br />
		${missingLetters("abcdefghijklmnopqrstuvwxyz") == undefined}
		<br />
		<br />
		missingLetters("abc") == undefined
		<br />
		${missingLetters("abc") == undefined}
	</div>
	<div>
		<h4>Challenge 6:</h4>
		JSON.stringify(evenOddSums([50, 60, 60, 45, 71])) == JSON.stringify([170, 116])
		<br />
		${JSON.stringify(evenOddSums([50, 60, 60, 45, 71])) == JSON.stringify([170, 116])}
	</div>
`;

con4.innerHTML = output4;


function log(s) {
	console.log(s);
}
