# Android Project 2 - *Wishlist*

Submitted by: **Mahdi Ali-Raihan**

**Wishlist** is a wishlist app that helps the user keep track of what they want to buy.

Time spent: **6** hours spent in total

## Required Features

The following **required** functionality is completed:

- [X] **User can add an item to their wishlist**
- [X] **User can see their list of items based on previously inputted items**

The following **optional** features are implemented:

- [X] Wishlist app is 🎨 **customized** 🎨
- [ ] User can delete an item by long pressing on the item
- [ ] User can open an item's URL by clicking on the item

The following **additional** features are implemented:

* [X] Made sure that additional items on recyclerview that requires scrollbar does not overlap with edit text inputs when the keyboard pops up

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='demo.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<!-- Replace this with whatever GIF tool you used! -->
GIF created with Ezgif  
<!-- Recommended tools:
[Kap](https://getkap.co/) for macOS
[ScreenToGif](https://www.screentogif.com/) for Windows
[peek](https://github.com/phw/peek) for Linux. -->

## Notes

Describe any challenges encountered while building the app.

One challenge I had was setting up the Recyclerview such that the item, price, and url/location inputted would be displayed properly on the phone. It took a lot of time to read through the resources and the code on Recyclerview to understand what connects what to the Recyclerview. Another challenge I had was that text from the recyclerview would overlap on my text edit input, but I was able to put "android:windowSoftInputMode="adjustPan"" to prevent the overlap.
Other than that, I did attempt to work on long press delete and clicking on URL, but it was of no avail. I will likely reattempt this in my spare time once I get a better understanding of Recyclerview.

## License

    Copyright [2022] [Mahdi Ali-Raihan]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
