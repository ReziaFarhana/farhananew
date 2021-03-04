package midterm.jsonparser;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

     {
	"status": "ok",
	"totalResults": 10,
	"articles": [{
			"source": {
				"id": "cnn",
				"name": "CNN"
			},
			"author": null,
			"title": "Video shows United Airlines plane engine on fire after takeoff from Denver - CNN Video",
			"description": "A United Airlines flight was forced to return to Denver International Airport after it suffered an engine failure shortly after takeoff, sending aircraft debris raining down on soccer fields, homes and yards in a Denver suburb. CNN's Lucy Kafanov reports.",
			"url": "http://us.cnn.com/videos/us/2021/02/21/denver-united-airlines-flight-engine-fire-kafanov-dnt-ndwknd-vpx.cnn",
			"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/210221065627-denver-united-airline-plane-engine-fire-super-tease.jpg",
			"publishedAt": "2021-02-22T00:22:39.3810675Z",
			"content": null
		}

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */
}
