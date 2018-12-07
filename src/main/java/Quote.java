public class Quote{

        public String []tags;
        public String author;
        public String likes;
        public String text;
        public String body;

        public Quote(String text, String author){
            this.text = text;
            this.author = author;
        }
        public String[] getTags()
        {
            return tags;
        }

        public String getAuthors()
        {
            return author;
        }
        public String getLikes(){

            return likes;
        }

        public String getText(){
            return text;
        }

        public String getBody(){
            return body;
    }

    }
