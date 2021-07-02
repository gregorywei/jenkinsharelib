package org.devops

def PrintMes(value,color){
    colors = [ 
            'red' : "\003[40;31m >>>>>>>>>${vaule}<<<<<<<<<< \003[0m",
            'blue' : "\003[40;31m >>>>>>>>>${vaule}<<<<<<<<<< \003[0m",
            'green' : "\003[40;31m >>>>>>>>>${vaule}<<<<<<<<<< \003[0m",
    ]
    ansiColor('xterm') {
        println(colors[color])
    }
}