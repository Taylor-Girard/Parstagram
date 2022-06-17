# Project 3 - Parstagram

Parstagram is a photo sharing app using Parse as its backend.

Time spent: 16 hours spent in total

## User Stories

The following **required** functionality is completed:

- [X] User sees app icon in home screen.
- [X] User can sign up to create a new account using Parse authentication
- [X] User can log in to their account
- [X] The current signed in user is persisted across app restarts
- [X] User can log out of their account
- [X] User can take a photo, add a caption, and post it to "Instagram"
- [X] User can view the last 20 posts submitted to "Instagram"
- [X] User can pull to refresh the last 20 posts submitted to "Instagram"
- [X] User can tap a post to go to a Post Details activity, which includes timestamp and caption.

The following **stretch** features are implemented:

- [ ] Style the login page to look like the real Instagram login page.
- [ ] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once they reach the bottom of the feed using endless scrolling.
- [X] User should switch between different tabs using fragments and a Bottom Navigation View.
  - [X] Feed Tab (to view all posts from all users)
  - [X] Capture Tab (to make a new post using the Camera and Photo Gallery)
  - [X] Profile Tab (to view only the current user's posts, in a grid)
- [X] Show the username and creation time for each post
- User Profiles:
  - [X] Allow the logged in user to add a profile photo
  - [X] Display the profile photo with each post
  - [ ] Tapping on a post's username or profile photo goes to that user's profile page
  - [X] User Profile shows posts in a grid
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [X] Splashscreen showing Instagram logo on app restart

Please list two areas of the assignment you'd like to **discuss further with your peers** during the next class (examples include better ways to implement something, how to extend your app in certain ways, etc):

1. How fragments work and the difference between fragments and activities
2. How Parse works with making a new user vs. editing an existing user

## Video Walkthrough

Here's a walkthrough of implemented user stories:

![Parstagram](https://user-images.githubusercontent.com/74567614/174397414-69d68998-0709-4a02-8a50-cfe8ac2fe00e.gif)

GIF created with [Kap](https://getkap.co/).

## Credits

List an 3rd party libraries, icons, graphics, or other assets you used in your app.

- [Android Async Http Client](http://loopj.com/android-async-http/) - networking library
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## Notes

There was an issue with getting the user signed up. The issue was because I was using saveInBackground() vs. signUpInBackground().

## License

    Copyright 2022 Taylor Girard

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
