// display logistics
let con2 = document.getElementById("session2");

// test data

class Node {
	constructor($data = "", $left = null, $right = null) {
		this.data = $data.toString();
		this.left = $left;
		this.right = $right;
	}
}

let tree = new Node(
	"- **a 1** -",
	new Node(
		"- **b 1** -",
		new Node("- **c 1** -"),
		new Node("- **c 2** -")
	),
	new Node(
		"- **b 2** -",
		new Node("- **c 3** -"),
		new Node("- **c 4** -")
	)
);

// functions

// Breadth First Traverse
// Return a string representing the given tree
function breadthTraverse(tree) {
	let buffer = "";
	if(tree == null) {
		return buffer;
	}
	let temp = tree;
	let height = 0;
	while(temp != null) {
		temp = temp.left;
		++height;
	}
	for(let i = 1; i <= height; ++i) {
		buffer += printLevel(tree, i) + "<br />";
	}
	return buffer;
}


function printLevel(root, level) {
	let buffer = "";
	if(root == null) {
		return buffer;
	}
	if(level == 1) {
		buffer += root.data;
	} else if(level > 1) {
		buffer += printLevel(root.left, level-1);
		buffer += printLevel(root.right, level-1);
	}
	return buffer;
}


// function breadthTraverse(node) {
// 	let buffer = "";
// 	if(node == null) {
// 		return "";
// 	}
// 	let que = [];
// 	que.push(node.data);
// 	while(que.length > 0) {
// 		buffer += que.shift();
// 	}
// 	return buffer;
// 	// return node.data + breadthTraverse(node.children.left) + breadthTraverse(node.children.right);
// }

// test functions
let output2 = `
	<div>
		<h4>Breadth First Traverse:</h4>
		<br />
		${breadthTraverse(tree)}
		<br />
	</div>
`;

con2.innerHTML = output2;
