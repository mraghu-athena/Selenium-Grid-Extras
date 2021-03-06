package com.groupon.seleniumgridextras.config.capabilities;

// Android native browser
public class Browser extends Capability {

  @Override
  public String getWebDriverClass() {
    return "io.appium.java_client.android.AndroidDriver";
  }

  public String getIcon(){
    return "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAIGNIUk0AAHolAACAgwAA+f8AAIDpAAB1MAAA6mAAADqYAAAXb5JfxUYAAAAJcEhZcwAACxMAAAsTAQCanBgAAAK5SURBVDhPtZFbSJNhHIenkud5CKfonJWHaW46U4t0Zh7Kw8RT03TE0rktT4WLPFRq03R5wCzBQSiFFIVBUBciBtEuiiChJM1QCi/UsLwyIoimv3+v7gPzIuimB57v5X2///PevLz/ipHI/RLgV8NW7ujfOGOxFtRPb4w3f1pf6Vxa/962sL5S/25jTPvUmsuN/AUj2VeM/hi5MknUyuybXifznJU63lip5TWRYYJIeWNtmMcjO67YSVbr/HDNKNG5e19Je2cZ7WOruPjkC6rvf4bm9jJ0QytUeZcoo2nezCXbxKhMR4t656h6cBG1gx+R1z6DE13vkds5gzxmLtuXmGZRPbRMyp4PJFEaE7nURqza9OBk9xTVDczi7PUpJFQ+h7zaAnmtBUk1lq19puEFtD3TKOp+S/G6vhEu3cIupvzaXGHLODIqxxFb8giRyoeILNo2vHAU+XUTKGl8hiNVo4gsvjzDtYy4uF3iU22LkYU98DnUAT95P4QpAwhMtemffBOhmWaoGx8jsfQWQrKvIiC9aoGV9rYLGD5yzRRfpodruB58qQEe0fXwkDXCU9YEd2kDRPJWFOjNyND0Q6LqhCBNN8mlNpwCUvpdw4rINbQEbuLT4EdUwGM/u4zpHqHDMZUJirIuxCubEaQ4T16HS7u51IaTIDaEH6r4Jc4ykCheB1+JBgKJFr5RegikWqQVG5GiMkKcU0c+CaqfzntT93DpNu5BSXphgppi8i9QTKYBIpkGgVEaCKXlEEWrIU6rIv8kNfHDj5dzyQ4cNj+O3uENPtLsb8EpZSSUFJIgOId8Q3Jod1A68QMS1txE8XVb09z8n3gzDzLzeHYOvY5eoldOnvuWXLzDVl089y06uvm9ZK/dyf5nMKOYfOYOnJlC5gFmMjOdmcPMYyqYqUw5czP2ZTryeDzeb5SsOAC8J59cAAAAAElFTkSuQmCC";
  }
}
