# songr

## Lab12 - Spring MVC with Databases

### Description
* Create an Album model.
  * An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
* A user should be able to see information about all the albums on the site.
* A user should be able to add albums to the site.

### Solution
[Album Controller](https://github.com/leepj85/songr/blob/master/src/main/java/com/leejungfoonpeter/songr/controllers/AlbumController.java)

[Album Model](https://github.com/leepj85/songr/blob/master/src/main/java/com/leejungfoonpeter/songr/models/Album.java)

[Album Repository](https://github.com/leepj85/songr/blob/master/src/main/java/com/leejungfoonpeter/songr/models/AlbumRepository.java)

[Album Template](https://github.com/leepj85/songr/blob/master/src/main/resources/templates/allAlbums.html
)

**Running the app:**

- Open project in IntelliJ and compile & run 'SongrApplication.java'<br />
- Open web browser and go to - http://localhost:8080/albums
- Enter the following into the form -
  * Album Title: Love In The Future
  * Artist: John Legend
  * Song Count: 20
  * Length: 67
  * ImageURL: https://upload.wikimedia.org/wikipedia/en/6/64/John_Legend_Love_in_the_Future.jpg

**Routes:**

http://localhost:8080/albums
- Returns a list of albums in the postgres DB
