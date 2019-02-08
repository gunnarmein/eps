/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var map = [];
var limit = 100;
var solution = [];
var silent = true;



function slidePuzzle(a, origin, rowlength) {
    map = [];
    solution = [];
    consoleDumpPuzzle(a, true);
    solution = playPuzzle(a, origin, rowlength);
    //console.log(solution);
        dumpPuzzle(a);

    return solution;
}

function bruteForceFix(a, origin, rowlength) {
    println("brute force:");
    console.log("bf " + origin + ", " + rowlength);
    dumpPuzzle(a);
    if (origin === undefined) {
        origin = 1;
    }
    if (rowlength === undefined) {
        rowlength = a[0].length;
    }

    map = [];
    var row, col;
    var r, c;
    for (row = 0; row < a.length; row++) {
        for (col = 0; col < a[0].length; col++) {
            if (a[row][col] === 0) {
                r = row;
                c = col;
            }
        }
    }

//    console.log("Problem:");
//    console.log("origin:" + origin + ", rowlength: " + rowlength);
//
//    console.log(a);
//    console.log("0 at " + r + ", " + c);
    var solution = tryAllSolutionsFrom(a, origin, rowlength, makeSignature(a), [], r, c);
//    console.log("BF solution:");
//    console.log(solution);
    if (solution === null) {
        println("no bf solution");
    }
    return solution;
}


function tryAllSolutionsFrom(a, origin, rowlength, signature, solution, row, col) {
    //console.log("tasf " + row, col);
    // are we done?
    if (solved(a, origin, rowlength)) {
        return solution;
    }

    // path too long (recursion / crash) ?
    //console.log("tasf check path length");
    if (solution.length > limit) {
        //console.log("limit reached");
        return null;
    }

    signature = makeSignature(a);
    // have we tried this path before?
    //console.log("tasf check map");
    if (map[signature] !== undefined) {
        //console.log("looped");

        return null;
    }

    // we have tried this now.
    //console.log("tasf enter map");
    map[signature] = true;

    // try moving the pieces from left, right, up, down, recursively
    //console.log("tasf right");
    if (trySolution(a, origin, rowlength, signature, solution, row, col, 0, 1) !== null) {
        return solution;
    }

    //console.log("tasf left");
    if (trySolution(a, origin, rowlength, signature, solution, row, col, 0, -1) !== null) {
        return solution;
    }

    //console.log("tasf down");
    if (trySolution(a, origin, rowlength, signature, solution, row, col, 1, 0) !== null) {
        return solution;
    }

    //console.log("tasf up");
    if (trySolution(a, origin, rowlength, signature, solution, row, col, -1, 0) !== null) {
        return solution;
    }


    return null;
}




function trySolution(a, origin, rowlength, signature, solution, row, col, incrow, inccol) {
    //console.log("ts " + row + "," + col + "," + incrow + "," + inccol);
    if (row + incrow < 0 || row + incrow >= a.length || col + inccol < 0 || col + inccol >= a[0].length) {
        return null;
    }

    var c = a[row + incrow][col + inccol];
    solution.push(c);
    swap(a, row, col, row + incrow, col + inccol);
    swapInSignature(signature, "0", c);
    var result = tryAllSolutionsFrom(a, origin, rowlength, signature, solution, row + incrow, col + inccol);
    if (result === null) {
        solution.pop();
        swap(a, row, col, row + incrow, col + inccol);
        swapInSignature(signature, "0", c);
    }

    return result;
}


function swap(a, r1, c1, r2, c2) {
    //console.log("swap "+r1+","+c1+" "+r2+","+c2);
    //consoleDumpPuzzle(a);
    var temp = a[r1][c1];
    a[r1][c1] = a[r2][c2];
    a[r2][c2] = temp;
    //consoleDumpPuzzle(a);

}


function solved(a, origin, rowlength) {
    //console.log("solved?: origin:" + origin + ", rowlength: " + rowlength);
    //consoleDumpPuzzle(a);

    var count = origin;
    for (var row = 0; row < a.length; row++) {
        for (var col = 0; col < a[0].length; col++) {

            if ((a[row][col] === 0 && (row !== a.length - 1 || col !== a[0].length - 1)) || (a[row][col] !== 0 && a[row][col] !== count)) {
                //console.log("no because a[" + row + "][" + col + "] == " + a[row][col] + ", expected: " + count);
                return false;
            }
            count++;
        }
        count += (rowlength - a[0].length);
    }

    //console.log("yes")
    return true;
}

function makeSignature(a) {
    //console.log(a)
    var s = "";
    for (var row = 0; row < a.length; row++) {
        for (var col = 0; col < a[0].length; col++) {
            s += String.fromCharCode(a[row][col] + 48);
        }
    }
    //console.log("sig " + s);
    return s;
}

function swapInSignature(s, a, b) {
    var result = s.replace(a, "&").replace(b, "%").replace("&", b).replace("%", a);
    //console.log("s " + s + " a " + a + " b " + b);
    //console.log("r " + result);
}


////////////////////////////////////////////////////////////////////////////////
// now comes the more intentional way to play the game
////////////////////////////////////////////////////////////////////////////////



var zerorow;
var zerocol;


function findZero(a) {
    var zero = find(a, 0);
    zerorow = zero[0];
    zerocol = zero[1];
}

function find(a, x) {
    for (var i = 0; i < a.length; i++) {
        for (var j = 0; j < a[0].length; j++) {
            if (a[i][j] === x) {
                return [i, j];
            }
        }
    }
}


function moveZeroIncrementally(a, incrow, inccol) {
    if (incrow === 0 && inccol === 0) {
        return;
    }
    a[zerorow][zerocol] = a[zerorow + incrow][zerocol + inccol];
    a[zerorow + incrow][zerocol + inccol] = 0;
    dumpPuzzle(a, zerorow, zerocol, "yellow", zerorow + incrow, zerocol + inccol, "red");
    solution.push(a[zerorow][zerocol]);
    zerorow += incrow;
    zerocol += inccol;
}

function cloneMapWithRowCol(map, row, col) {
    var map2 = Array(map.length);
    for (var i = 0; i < map.length; i++) {
        map2[i] = [...map[i]];
    }
    map2[row][col] = true;
    return map2;
}



function directPathTo(a, map, row, col, targetrow, targetcol, recursiondepth) {
    //console.log("direct path from " + row + "," + col + " to " + targetrow + "," + targetcol);

    if (recursiondepth === undefined) {
        recursiondepth = 0;
    }
    if (recursiondepth > 15) {
        return null;
    }

    var path;
    // done? return empty path
    if (row === targetrow && col === targetcol) {
        path = [[targetrow, targetcol]];
        //        dumpPath(path, "final piece");
        //        console.log("--- direct path complete");
        return path;
    }

    // forbidden?
    //    console.log("map");
    //    console.log(map);
    if (unavailable(a, map, row, col)) {
        //console.log("--- dead end");
        return null;
    }




// calculate direction to target
    var rowdir = Math.sign(targetrow - row);
    var coldir = Math.sign(targetcol - col);
    var path1 = null;
    var path2 = null;
    path = null;
    if (rowdir !== 0) {
        //        console.log("recursing vert");
        path1 = directPathTo(a, map, row + rowdir, col, targetrow, targetcol);
        //        console.log("after recursion vert");
    }
    if (coldir !== 0) {
        //        console.log("recursing horiz");
        path2 = directPathTo(a, map, row, col + coldir, targetrow, targetcol);
    }

    if (path1 === null && path2 === null) {
        //console.log("no way! trying all pahts ...");

        var directions = [
            [-1, 0],
            [0, 1],
            [1, 0],
            [0, -1]
        ];

        var paths = Array(4);
        for (var i = 0; i < directions.length; i++) {
            var d = directions[i];
            //console.log("trying " + (row + d[0]) + "," + (col + d[1]));
            paths[i] = directPathTo(a, cloneMapWithRowCol(map, row, col), row + d[0], col + d[1], targetrow, targetcol, recursiondepth + 1);
        }
        // sort to find shortest
        paths.sort((a, b) => {
            if (a === null) {
                return 1;
            }
            if (b === null) {
                return -1;
            }

            return(a.length - b.length);
        });

        var path = paths[0];
        if (path === null) {
            //console.log("really no way!");
        }

        return path;
    }

    if (path1 === null) {
        path = path2;
    } else if (path2 === null) {
        path = path1;
    } else if (path1.length <= path2.length) {
        path = path1;
    } else {
        path = path2;
    }


    path1 = [[row, col]];
    //    dumpPath(path1, "path1");

    path = path1.concat(path);
    //    dumpPath(path, "path after concat");

    return path;
}

var deltas = [
    [-1, 0],
    [-1, 1],
    [0, 1],
    [1, 1],
    [1, 0],
    [1, -1],
    [0, -1],
    [-1, -1]
];
function findPositionAround(row, col, elementrow, elementcol) {

    // find current position
    var deltarow = row - elementrow;
    var deltacol = col - elementcol;
    // find position in the neighborhood
    var i;
    for (i = 0; i < deltas.length; i++) {
        if ((deltarow === deltas[i][0]) && (deltacol === deltas[i][1])) {
            break;
        }
    }

    return i;
}

function unavailable(a, map, row, col) {
    return row < 0 || row >= a.length || col < 0 || col >= a.length || map[row][col] !== undefined;
}

function zeroPathAroundElementTo(a, map, targetrow, targetcol, elementrow, elementcol) {
// check if next to it
// check clockwise path
// check counterclockwise path
// compare and return shorter

    var row, col;
    var path = null;
    //console.log("zero path from " + zerorow + "," + zerocol + " around " + elementrow + "," + elementcol + " to " + targetrow + "," + targetcol);
    var zeropos = findPositionAround(zerorow, zerocol, elementrow, elementcol);
    if (zeropos === deltas.length) {
        // invalid position
        //console.log("findPos: invalid current position");
        return null;
    }
    //console.log("-- zero angle index " + zeropos);
    var targetpos = findPositionAround(targetrow, targetcol, elementrow, elementcol);
    if (targetpos === deltas.length) {
        // invalid position
        //console.log("findPos: invalid target position");
        return null;
    }
    //console.log("-- target angle index " + targetpos);
    // try clockwise
    var clockwise = [];
    //console.log("-- trying clockwise");
    for (i = zeropos; i !== targetpos; i = ((i + 1) % deltas.length)) {
        var d = deltas[i];
        var row = elementrow + d[0];
        var col = elementcol + d[1];
        //console.log("-- trying index " + i + ", " + row + "," + col + ": ");
        if (unavailable(a, map, row, col)) {
            //console.log("-- clockwise ran into obstacle at " + (row) + "," + (col));
            clockwise = null;
            break;
        }
        clockwise.push([row, col]);
    }

    // try counterclockwise
    var counterclockwise = [];
    //console.log("-- trying conterclockwise");
    for (i = zeropos; i !== targetpos; i = ((i + deltas.length - 1) % deltas.length)) {
        var d = deltas[i];
        var row = elementrow + d[0];
        var col = elementcol + d[1];
        //console.log("-- trying index " + i + ", " + row + "," + col);
        if (unavailable(a, map, row, col)) {
            //console.log("-- counterclockwise ran into obstacle at " + row + "," + col);
            counterclockwise = null;
            break;
        }
        counterclockwise.push([row, col]);
    }

    // only one path valid?
    if (clockwise === null) {
        path = counterclockwise;
    } else if (counterclockwise === null) {
        path = clockwise;
    } else if (clockwise.length <= counterclockwise.length) {
        path = clockwise;
    } else {
        path = counterclockwise;
    }

    if (path !== null) {
        path.push([targetrow, targetcol]);
    }
    return path;
}


function moveZeroAlongPath(a, zeropath) {
    if (zeropath !== null && zeropath.length > 0) {
        var p = zeropath.shift();
        var count = 0;
        while (p !== undefined) {
            //console.log("next zero pos " + p[0] + "," + p[1]);
            moveZeroIncrementally(a, p[0] - zerorow, p[1] - zerocol);
            if (count++ > 20) {
                println("break in moveElementTo2");
                break;
            }
            p = zeropath.shift();
        }
    }

}

function moveElementTo(a, map, row, col, targetrow, targetcol) {
    // plot path for element
    // move zero on direct path to element
    // while element not on target:
    //   move zero into next position on path (around)
    //   move zero to element (direct)
    // mark element on map
    //console.log("moveElementTo from " + row + "," + col + " to " + targetrow + "," + targetcol);
    // compute path for the element
    var elementpath = directPathTo(a, map, row, col, targetrow, targetcol);
    // get rid of current element position
    //dumpPath(elementpath, "supposed elementpath before shift");
    elementpath.shift();
    //dumpPath(elementpath, "supposed elementpath");
    // bring zero close to element, on direct path
    var zeropath = directPathTo(a, map, zerorow, zerocol, row, col);
    // take off last item, don't want to displace element
    zeropath.pop();
    //dumpPath(zeropath, "supposed zeropath");
    moveZeroAlongPath(a, zeropath);
    // main loop - move zero around to right spot, swap, repeat
    //console.log("moveElementTo main loop");
    while (elementpath.length > 0) {
        p = elementpath.shift();
        if (p === undefined) {
            println("premature exit");
            break;
        }
        //console.log("-- next main loop position " + p[0] + "," + p[1]);
        zeropath = zeroPathAroundElementTo(a, map, p[0], p[1], row, col);
        //dumpPath(a, zeropath, "supposed zeropath");
        moveZeroAlongPath(a, zeropath);
        //console.log("-- moving element into place: ");
        var nextrow = zerorow;
        var nextcol = zerocol;
        moveZeroIncrementally(a, row - zerorow, col - zerocol);
        row = nextrow;
        col = nextcol;
    }
    //console.log("-- moveElementTo end of main loop");
}

function moveNumberTo(a, map, n, row, col) {
    //console.log("moving number " + n);
    var element = find(a, n);
    dumpPuzzle(a, element[0], element[1], "green");
    moveElementTo(a, map, element[0], element[1], row, col);
    element = find(a, n);
    dumpPuzzle(a, element[0], element[1], "green");
    println("done with number " + n);
    println();
    println();
}




function println(s, force) {
    print("<br>" + (s === undefined ? "" : s) + "<br>", force);
}
function print(s, force) {
//console.log(s);
    if (force || !silent) {
        document.getElementById("output").innerHTML += s;
    }
}

function clear(force) {
    if (force || !slient) {
        document.getElementById("output").innerHTML = "";
    }
}

function dumpPuzzle(a, r1, c1, color1, r2, c2, color2, force) {
    var t = "<table style='border:1px solid black;display:inline-table'><tbody>";
    for (var i = 0; i < a.length; i++) {
        t += "<tr style='border:1px solid black;'>";
        for (var j = 0; j < a[0].length; j++) {
            t += "<td style='border:1px solid black";
            if (r1 !== undefined) {
                t += ";background-color:";
                if (i === r1 && j === c1) {
                    t += color1;
                } else if (i === r2 && j === c2) {
                    t += color2;
                }
            }

            t += "'>" + a[i][j] + "</td>";
        }
        t += "</tr>";
    }
    t += "</tbody></table>&nbsp;&nbsp;&nbsp;";
//    if (++puzzledumpcount % 8 === 0) {
//        t+= "<br><br>";
//    }
    print(t, force);
}

function consoleDumpPuzzle(a, force) {
    if (force || !silent) {
        for (var i = 0; i < a.length; i++) {
            var s = "";
            for (var j = 0; j < a[0].length; j++) {
                s += a[i][j] + " ";
            }
            console.log(s);
        }
        console.log("");
    }
}

function dumpPath(p, s, force) {
    if (force || !silent) {
        console.log((s === undefined ? "path" : s));
        if (p === null || p === undefined) {
            console.log("--- empty/no path");
            return;
        }
        for (var i = 0; i < p.length; i++) {
            console.log("--- " + p[i][0] + "," + p[i][1]);
        }
    }
}



function fixTopRow(a, map, origin, rowlength) {
    var i;
    for (i = 1; i <= a.length - 2; i++) {
        println();
        moveNumberTo(a, map, i + origin - 1, 0, i - 1);
        map[0][i - 1] = true;
    }

    // make sure last number is far away
    moveNumberTo(a, map, i + origin, a.length - 1, a.length - 1);

    // last two pieces of top row get special treatment
    moveNumberTo(a, map, i + origin - 1, 0, i);
    map[0][i] = true;
    moveNumberTo(a, map, i + origin, 1, i);
    map[1][i] = true;

    // now slide them into place
    map[0][i] = undefined;
    moveNumberTo(a, map, i + origin - 1, 0, i - 1);
    map[0][i - 1] = true;
    map[1][i] = undefined;
    moveNumberTo(a, map, i + origin, 0, i);
    map[0][i] = true;
}

function fixLeftColumn(a, map, origin, rowlength) {
    var i;
    for (i = 2; i <= a.length - 2; i++) {
        println();
        moveNumberTo(a, map, origin + rowlength * (i - 1), i - 1, 0);
        map[i - 1][0] = true;
    }


    // make sure last number is far away
    moveNumberTo(a, map, origin + rowlength * i, a.length - 1, a.length - 1);

    // last two pieces of left col get special treatment
    moveNumberTo(a, map, origin + rowlength * (i - 1), i, 0);
    map[i][0] = true;
    moveNumberTo(a, map, origin + rowlength * i, i, 1);
    map[i][1] = true;

    // now slide them into place
    map[i][0] = undefined;
    moveNumberTo(a, map, origin + rowlength * (i - 1), i - 1, 0);
    map[i - 1][0] = true;
    map[i][1] = undefined;
    moveNumberTo(a, map, origin + rowlength * i, i, 0);
    map[i][0] = true;

    println("done");
}


function cloneInner(a, rows, cols) {
    a2 = Array(rows);
    for (var i = 0; i < rows; i++) {
        a2[i] = Array(cols);
        for (var j = 0; j < cols; j++) {
            a2[i][j] = a[a.length - rows + i][a[0].length - cols + j];
        }
    }
    return a2;
}


function pasteInner(a, a2) {
    for (var i = a.length - a2.length; i < a.length; i++) {
        for (var j = a[0].length - a2[0].length; j < a.length; j++) {
            a[i][j] = a2[a2.length - a.length + i][a2[0].length - a[0].length + j];
        }
    }
}




function playPuzzle(a, origin, rowlength) {
    var announce = false;
    if (origin === undefined) {
        origin = 1;
        announce = true;
    }
    if (rowlength === undefined) {
        rowlength = a[0].length;
    }

    var a2;
    println("puzzle to solve:");
    dumpPuzzle(a);
    findZero(a);
    map = Array(a.length);
    for (var i = 0; i < a.length; i++) {
        map[i] = Array(a[0].length);
    }

    if (a.length >= 3) {
        fixTopRow(a, map, origin, rowlength);
    }
    if (a.length === 3) {
        a2 = cloneInner(a, 2, 3);
        bfsolution = bruteForceFix(a2, a[0][0] + rowlength, rowlength);
        if (bfsolution === null) {
            return null; // unsolvable puzzle
        }
        pasteInner(a, a2);
        console.log("bf");
        console.log(bfsolution);
        solution = solution.concat(bfsolution);
        return solution;
    }

    fixLeftColumn(a, map, origin, rowlength);
    a2 = cloneInner(a, a.length - 1, a.length - 1);
    if (playPuzzle(a2, a[1][0] + 1, rowlength) === null) {
        return null;
    }
    pasteInner(a, a2);
    if (announce) {
        console.log("Solved, " + solution.length + " steps");
        //console.log(solution);
    }
    return solution;
}




function copy(a) {
    var a2 = Array(a.length);
    for (var i = 0; i < a.length; i++) {
        a2[i] = [...a[i]];
    }
    return a2;
}

function playSolution(a, s) {
    while (s.length > 0) {
        var n = s.shift();
        p = find(a, n);
        z = find(a, 0);
        if ((Math.abs(p[0] - z[0]) + Math.abs(p[1] - z[1])) > 1) {
            println("bad solution", true);
        }
        var temp = a[p[0]][p[1]];
        a[p[0]][p[1]] = a[z[0]][z[1]];
        a[z[0]][z[1]] = temp;
    }
}

let puzzle = [
    [15, 1, 3, 33, 8, 12],
    [20, 11, 0, 5, 6, 4],
    [19, 13, 14, 2, 27, 24],
    [25, 10, 9, 17, 23, 16],
    [21, 7, 26, 34, 22, 18],
    [31, 32, 30, 28, 35, 29]
];


//puzzle = [
//    [28, 30, 35],
//    [22, 24, 29],
//    [0, 23, 34]
//];

if (typeof webtest !== undefined) {
    silent = true;
    if (slidePuzzle(puzzle) === null) {
        console.log("no solution");
    } else {
        console.log(solution);
    }
}

