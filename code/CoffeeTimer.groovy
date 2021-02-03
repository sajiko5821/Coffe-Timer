/**
 *  Coffee Timer
 *
 *  Copyright 2021 Lukas Weier
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Coffee Timer",
    namespace: "sajiko5821",
    author: "Lukas Weier",
    description: "An App to organize the automatic Coffee Maschine routine in the morning",
    category: "Convenience",
    iconUrl: "https://raw.githubusercontent.com/sajiko5821/Coffe-Timer/main/Icons/coffeeTimerLogo.png",
    iconX2Url: "https://raw.githubusercontent.com/sajiko5821/Coffe-Timer/main/Icons/coffeeTimerLogo.png",
    iconX3Url: "https://raw.githubusercontent.com/sajiko5821/Coffe-Timer/main/Icons/coffeeTimerLogo.png")

preferences {
    page(name: "mainPage", title: "Configure Everything", install: true, uninstall: true,submitOnChange: true) {
        section("Select") {
        	input"coffeeMaschine", "capability.switch", title: "Coffee Maschine", multiple: false
            input name: "turnOffTime", type: "number", title: "Hours until shuting off", defaultValue:2, required: false
     	}
        
      	section("Option 1"){
            input "coffeeSwitch1", "capability.switch", title: "Coffee Switch 1", multiple: false, required: false
            input "time1", "time", title: "Timing Option 1", multiple: false, required: false
	    }
        
        section("Option 2"){
            input "coffeeSwitch2", "capability.switch", title: "Coffee Switch 2", multiple: false, required: false
            input "time2", "time", title: "Timing Option 2", multiple: false, required: false
	    }
        
        section("Option 3"){
            input "coffeeSwitch3", "capability.switch", title: "Coffee Switch 3", multiple: false, required: false
            input "time3", "time", title: "Timing Option 3", multiple: false, required: false
	    }
        
        section("Option 4"){
            input "coffeeSwitch4", "capability.switch", title: "Coffee Switch 4", multiple: false, required: false
            input "time4", "time", title: "Timing Option 4", multiple: false, required: false
	    }
        
        section("Option 5"){
            input "coffeeSwitch5", "capability.switch", title: "Coffee Switch 5", multiple: false, required: false
            input "time5", "time", title: "Timing Option 5", multiple: false, required: false
	    }
        
        section("Option 6"){
            input "coffeeSwitch6", "capability.switch", title: "Coffee Switch 6", multiple: false, required: false
            input "time6", "time", title: "Timing Option 6", multiple: false, required: false
	    }
        
        section("Option 7"){
            input "coffeeSwitch7", "capability.switch", title: "Coffee Switch 7", multiple: false, required: false
            input "time7", "time", title: "Timing Option 7", multiple: false, required: false
	    }
        
        section("Option 8"){
            input "coffeeSwitch8", "capability.switch", title: "Coffee Switch 8", multiple: false, required: false
            input "time8", "time", title: "Timing Option 8", multiple: false, required: false
	    }
        
        section("Option 9"){
            input "coffeeSwitch9", "capability.switch", title: "Coffee Switch 9", multiple: false, required: false
            input "time9", "time", title: "Timing Option 9", multiple: false, required: false
	    }
        
        section("Option 10"){
            input "coffeeSwitch10", "capability.switch", title: "Coffee Switch 10", multiple: false, required: false
            input "time10", "time", title: "Timing Option 10", multiple: false, required: false
	    }
        
        section("Option 11"){
            input "coffeeSwitch11", "capability.switch", title: "Coffee Switch 11", multiple: false, required: false
            input "time11", "time", title: "Timing Option 11", multiple: false, required: false
	    }
        
        section("Option 12"){
            input "coffeeSwitch12", "capability.switch", title: "Coffee Switch 12", multiple: false, required: false
            input "time12", "time", title: "Timing Option 12", multiple: false, required: false
	    }
    }
}

def installed() {
	log.debug "Installed with settings: ${settings}"
	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"
	unsubscribe()
	initialize()
}

def initialize() {
    schedule(time1, runCoffee1)
    schedule(time2, runCoffee2)
    schedule(time3, runCoffee3)
    schedule(time4, runCoffee4)
    schedule(time5, runCoffee5)
    schedule(time6, runCoffee6)
    schedule(time7, runCoffee7)
    schedule(time8, runCoffee8)
    schedule(time9, runCoffee9)
    schedule(time10, runCoffee10)
    schedule(time11, runCoffee11)
    schedule(time12, runCoffee12)
    subscribe(coffeeMaschine, "switch.on", delay)
}

def delay(evt){
	def elapse = turnOffTime
    log.debug "Turn off after ${elapse} hours"
	runIn(60*60*elapse, coffeeMaschineOff)
}

def coffeeMaschineOff(evt){
	coffeeMaschine.off()
}

def runCoffee1(evt){
    if(coffeeSwitch1.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch1.off()
        log.debug "runCoffee1 successfull"
    }
}

def runCoffee2(evt){
    if(coffeeSwitch2.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch2.off()
        log.debug "runCoffee2 successfull"
    }
}

def runCoffee3(evt){
    if(coffeeSwitch3.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch3.off()
        log.debug "runCoffee3 successfull"
    }
}

def runCoffee4(evt){
    if(coffeeSwitch4.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch4.off()
        log.debug "runCoffee4 successfull"
    }
}

def runCoffee5(evt){
    if(coffeeSwitch5.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch5.off()
        log.debug "runCoffee5 successfull"
    }
}

def runCoffee6(evt){
    if(coffeeSwitch6.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch6.off()
        log.debug "runCoffee6 successfull"
    }
}

def runCoffee7(evt){
    if(coffeeSwitch7.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch7.off()
        log.debug "runCoffee7 successfull"
    }
}

def runCoffee8(evt){
    if(coffeeSwitch8.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch8.off()
        log.debug "runCoffee8 successfull"
    }
}

def runCoffee9(evt){
    if(coffeeSwitch9.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch9.off()
        log.debug "runCoffee9 successfull"
    }
}

def runCoffee10(evt){
    if(coffeeSwitch10.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch10.off()
        log.debug "runCoffee10 successfull"
    }
}

def runCoffee11(evt){
    if(coffeeSwitch11.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch11.off()
        log.debug "runCoffee11 successfull"
    }
}

def runCoffee12(evt){
    if(coffeeSwitch12.currentSwitch == "on"){
    	coffeeMaschine.on()
        coffeeSwitch12.off()
        log.debug "runCoffee12 successfull"
    }  
}
