// display logistics
let con = document.getElementById("session1");

// test data

let testString = "testStr1ng";
let testPhrase = "This is a t3st phra53";
let testPhrase2 = "a test phrase, this is definitely one of those a ";
let testPal = "racecar";
let testNotPal = "hello";

// functions

// Challenge 1: REVERSE A STRING
// Return a string in reverse
// ex. reverseString('hello') === 'olleh'

function reverseString(s) {
	let buffer = '';
	for(let i = 1; i <= s.length; ++i) {
		buffer += s.charAt(s.length - i);
	}
	return buffer;
}


// Challenge 2: VALIDATE A PALINDROME
// Return true if palindrom and false if not
// ex. isPalindrome('racecar') === 'true', isPalindrome('hello') === false

function isPalindrome(s) {
	s = s.toLowerCase();
	if(reverseString(s) == s) {
		return true;
	} else {
		return false;
	}
}


// Challenge 3: REVERSE AN INTEGER
// Return an integer in reverse
// ex. reverseInt(521) === 125

function reverseInt(int) {
	let s = '' + int;
	let buffer = reverseString(s);
	console.log(typeof(buffer));
	++buffer;
	console.log(typeof(buffer));
	return buffer - 1;
}

// Challenge 4: CAPITALIZE LETTERS
// Return a string with the first letter of every word capitalized
// ex. capitalizeLetters('i love javascript') === 'I Love Javascript';

function capitalizeLetters(s) {
	let buffer = '';
	buffer += s.charAt(0).toUpperCase();
	for(let i = 1; i < s.length; ++i) {
		buffer += s.charAt(i);
		if(s.charAt(i) == ' ') {
			buffer += s.charAt(i+1).toUpperCase();
			++i;
		}
	}
	return buffer;
}

// Challenge 5: MAX CHARACTER
// Return the character that is the most common in a string
// ex. maxCharacter('javascript') == 'a'

function maxCharacter(s) {
	let c = '';
	let ci = 0;
	let flag = false;
	let freqList = [[]]; // [[char, frequency]]
	for(let i = 0; i < s.length; ++i) {
		for(x in freqList) {
			if(freqList[x][0] == s.charAt(i)) {
				++freqList[x][1];
			} else {
				freqList.push([s.charAt(i), 1]);
			}
		}
	}
	for(let i = 0; i < freqList.length; ++i) {
		if(freqList[i+1]) {
			if(freqList[i+1][1] > freqList[ci][1]) {
				ci = i
				flag = true;
			}
		} else {
			if(flag) {
				return c;
			} else {
				return 'each character only appears once';
			}
		}
	}
}


// test functions
let output = `
	<div>
		<h4>Challenge 1:</h4>
		${testString}
		<br />
		${reverseString(testString)}
		<br />
		<br />
		${testPhrase}
		<br />
		${reverseString(testPhrase)}
	</div>
	<div>
		<h4>Challenge 2:</h4>
		${testPal}
		<br />
		${isPalindrome(testPal)}
		<br />
		<br />
		${testNotPal}
		<br />
		${isPalindrome(testNotPal)}
	</div>
	<div>
		<h4>Challenge 3:</h4>
		${52123}
		<br />
		${reverseInt(52123)}
		<br />
		<br />
		${69}
		<br />
		${reverseInt(69)}
	</div>
	<div>
		<h4>Challenge 4:</h4>
		${testPhrase}
		<br />
		${capitalizeLetters(testPhrase)}
		<br />
		<br />
		${testPhrase2}
		<br />
		${capitalizeLetters(testPhrase2)}
	</div>
	<div>
		<h4>Challenge 5:</h4>
		${testPhrase}
		<br />
		${capitalizeLetters(testPhrase)}
		<br />
		<br />
		${testPhrase2}
		<br />
		${capitalizeLetters(testPhrase2)}
	</div>
	<div>
		<h4>Challenge 6:</h4>
		${testPhrase}
		<br />
		${capitalizeLetters(testPhrase)}
		<br />
		<br />
		${testPhrase2}
		<br />
		${capitalizeLetters(testPhrase2)}
	</div>
`;

con.innerHTML = output;
