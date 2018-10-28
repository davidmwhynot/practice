// display logistics
let con3 = document.getElementById("session3");

// test data
let matrix1 = [
	[1, 2, 3],
	[2, 3, 4],
	[3, 4, 5]
];
let matrix2 = [
	[1],
	[2],
	[3]
];

let matrix3 = [
	[2, -1],
	[1, 3]
];

let matrix4 = [
	[1, 2],
	[3, 4]
];

let matrix5 = [
	[2, 4, 2],
	[1, 4, 0],
	[2, 6, 0]
];

let matrix6 = [
	[5, 1],
	[2, 2],
	[4, 1]
];

// functions
function main(mat1, mat2) {
	let output = '';
	let c = matMul(mat1, mat2);
	output += `
		<h6>Wolfram string:</h6>
		${wolframString(mat1)} . ${wolframString(mat2)}
		<h6 class="mt-3">Result:</h6>
	`;
	if(c != null) {
		output += printMat(c);
		return output;
	} else {
		output += 'invalid input matrices';
		return output;
	}
}

function wolframString(a) {
	let output = '{';
	for(let i = 0; i < a.length; ++i) {
		output += '{';
		for(let j = 0; j < a[i].length - 1; ++j) {
			output += a[i][j] + ',';
		}
		output += a[i][a[i].length-1] + '},';
	}
	return output.substring(0, output.length - 1) + '}';
}

function matMul(a, b) {
	let colsA = a[0].length;
	let rowsA = a.length;

	let colsB = b[0].length;
	let rowsB = b.length;

	if(colsA == rowsB) {
		let output = [];
		for(let i = 0; i < rowsA; ++i) {
			let row = [];
			for(let j = 0; j < colsB; ++j) {
				let sum = 0;
				for(let k = 0; k < colsA; ++k) {
					sum += b[k][j] * a[i][k];
				}
				row.push(sum);
			}
			output.push(row);
		}
		return output;
	} else {
		return null;
	}
}

function printMat(a) {
	let buffer = '';
	for(i in a) {
		for(j in a[i]) {
			buffer += a[i][j] + ' ';
		}
		buffer += '<br />';
	}
	return buffer;
}

// test functions
let output3 = `
	<div>
		<h4>Matrix Multiply:</h4>
		<br />
		${main(matrix1, matrix2)}
		<br />
		${main(matrix3, matrix4)}
		<br />
		${main(matrix5, matrix6)}
		<br />
	</div>
`;

con3.innerHTML = output3;


function log(s) {
	console.log(s);
}
