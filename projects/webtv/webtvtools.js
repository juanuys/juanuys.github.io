// this file contains test cases etc,
// and it not needed by webtv

// Show all the available characters supported by this browser
function showAllCharacters() {
	var str;
	for (i=0; i<9999; i++) {
	if (i%5 == 0) {
		str += '\n\n';
		}
		str += '[' + i + ' - &#' + i + ';]  ';
	}
	
	document.getElementById("TVdiv").innerHTML = str;
}

// test the tv with some colours
function doTest1(xy) {
	var testArray = new Array(xy);
	for (i=0; i<xy; i++) {
		testArray[i] = (i/23).toFixed(0);
	}
	drawOneTVScreen(testArray);
}

function doTest2(xy) {
	document.getElementById("pixel0").style.color = 'rgb(100,50,30)';
}

function doTest3(xy) {
	setPixelColour(0, 100);
}

function doTest4_(xy) {
	var r = (255 * Math.random()).toFixed(0) - 1;
	var g = (255 * Math.random()).toFixed(0) - 1;
	var b = (255 * Math.random()).toFixed(0) - 1;
	var pixel = (xy * Math.random()).toFixed(0) - 1;
	setPixelColour(pixel, r, g, b);
}

function doTest4(xy) {
	setInterval("doTest4_(" + xy + ")", 0);
}

function getRandom16bitHex() {
	var hex = ((255 * Math.random()).toFixed(0) - 1).toString(16).toUpperCase();

	// make sure to return two characters
	return hex.length==1 ? "0"+hex : hex;
}

function createRandomColourArray(xy) {
	var arr = new Array(xy);
	for (i=0; i<xy; i++) {
		arr[i] = "'" + getRandom16bitHex() + getRandom16bitHex() + getRandom16bitHex() + "'";
	}
	doDebugOutput("<textarea rows=\"100\" cols=\"100\">" + arr.toString() + "</textarea>");
	return arr;
}

function drawRandomFrame(xy) {
	var arr = createRandomColourArray(xy)
	drawFrame(arr);
}

function doTest5(xy) {
	setInterval("drawRandomFrame(" + xy + ")", 5000);
}