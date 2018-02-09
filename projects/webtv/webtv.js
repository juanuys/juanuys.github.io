// Define all globals
var _DEBUG = false;
var _DEBUG_string = "<br><br>";
var blockChar = "&#9606;";
var monitorXY = [1024, 736]; //a reasonable assumption for full-screen firefox. Will be re-calced later
var TVXY = [102, 74]; // monitorXY divided by 10
var TVArraySize = 102*74;
var TVpixelXY = [10, 10]; // a pixel on the TV screen

// Get the client monitor size for full-screen TV
function getMonitorXY() {
	var x = document.body.clientWidth;
	var y = document.body.clientHeight;
	doDebugOutput("Monitor: x: " + x + ", y: " + y);

	monitorXY = [x, y]
}

// Calculate all the relevant values: TV scaling, sizing, etc
function calculate() {
	// as we don't know the width of characters beforehand,
	// we have to make reasonable assumptions.
	
	getMonitorXY();
	var monitorX = monitorXY[0];
	var monitorY = monitorXY[1];
	
	// toFixed(0) rounds up and removes the decimals [JS 1.5]
	TVXY[0] = (monitorX / 10).toFixed(0) - 1;
	TVXY[1] = (monitorY / 10).toFixed(0) - 1;

	doDebugOutput("TV: x: " + TVXY[0] + ", y: " + TVXY[1]);

	TVArraySize = TVXY[0] * TVXY[1];
	
	doDebugOutput("TVArraySize: " + TVArraySize);
}

// refresh:
// * when monitor resolution changes
// * when browser are resized
function doRefresh() {
	doDebugOutput(" ** Refreshing...");
	calculate();
}

// Draw the TV
function drawTV(x, y) {
	var arr = "";

	for (i=0; i<x*y; i++) {
		if (i%x == 0 && i != 0) {
			arr += '<br>';
		}
		arr += "<span id=\"pixel" + i + "\">" + blockChar + "</span>";
	}
	document.getElementById("TVdiv").innerHTML = arr;
	//doDebugOutput("<textarea rows=\"100\" cols=\"100\">" + arr + "</textarea>");
}

// draw one screen from an array of size TVArraySize
function drawFrame(frameArray) {

	for (i=0; i<TVArraySize; i++) {
		//setPixelColour(i, frameArray[i]);
		document.getElementById("pixel" + i).style.color = '#' + frameArray[i];
	}
}

// set a pixel's colour
function setPixelColour(pixel, r, g, b) {
	document.getElementById("pixel" + pixel).style.color = 'rgb(' + r + "," + g + "," + b + ")";
}

function setPixelColour(pixel, HTMLColour) {
	document.getElementById("pixel" + pixel).style.color = '#' + HTMLColour;
}

// Update the stack trace, and update the stderr
function doDebugOutput(message) {
	if (_DEBUG) {
		_DEBUG_string += message + "<br>";
		document.getElementById("stderr").innerHTML = _DEBUG_string;
	}
}

// Initialise: call the prelim functions before drawing the TV
function initialise() {
	calculate();
	drawTV(TVXY[0], TVXY[1]);
	//doTest5(TVXY[0] * TVXY[1]);
	//createRandomColourArray(TVXY[0] * TVXY[1]);
	//drawFrame(arr1);
	//drawFrame(arr2);	
	doTest4(TVXY[0] * TVXY[1]);
}