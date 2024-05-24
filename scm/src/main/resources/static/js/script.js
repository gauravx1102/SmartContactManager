console.log("Script loaded");


let currentTheme = getTheme();


document.addEventListener("DOMContentLoaded", () => {
    changeTheme();
});


// TODO
function changeTheme(){
    
    //set to web page
    changePageTheme(currentTheme, currentTheme);
    
    //set the listener to change button
    const changeThemeButton = document.querySelector('#theme_change_button');

    //changing text of button
    changeThemeButton.querySelector('span').textContent =
    currentTheme == "light" ? "Dark" : "Light";
    
    changeThemeButton.addEventListener("click", (event) => {
        const oldTheme=currentTheme;
        console.log("Changed theme button click");
        if(currentTheme === "dark"){
            //theme to light
            currentTheme = "light"
        }
        else{
            //theme to dark
            currentTheme = "dark"
        }

        changePageTheme(currentTheme, oldTheme);
    });

}


//Set theme at local storage

function setTheme(theme){
    localStorage.setItem("theme",theme);
}

// get theme from localstorage

function getTheme(){
    let theme = localStorage.getItem("theme")
    if(theme) return theme;
    else return "light";
}


//change  current page theme

function changePageTheme(theme, oldTheme){
     // localstorge me update
     setTheme(currentTheme);

     //remove current theme
     document.querySelector("html").classList.remove(oldTheme);


     //set the current theme
     document.querySelector('html').classList.add(theme);

     //changing text of button
     document
     .querySelector("#theme_change_button")
     .querySelector('span').textContent = theme == "light" ? "Dark" : "Light";
}


// change 