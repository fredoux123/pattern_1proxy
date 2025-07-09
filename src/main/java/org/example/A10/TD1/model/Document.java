package org.example.A10.TD1.model;

public class Document {
        private String id;
        private String content;
        private boolean isPublic;

        public Document(String id, String content, boolean isPublic) {
            this.id = id;
            this.content = content;
            this.isPublic = isPublic;
        }

        public String getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

        public boolean isPublic() {
            return isPublic;
        }
}
