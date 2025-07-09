classDiagram
direction BT
class Document {
  + Document(String, String, boolean) 
  + getId() String
  + isPublic() boolean
  + getContent() String
}
class DocumentProxy {
  + DocumentProxy(User) 
  + displayDocument(String) void
}
class DocumentService {
<<Interface>>
  + displayDocument(String) void
}
class Main {
  + Main() 
  + main(String[]) void
}
class RealDocumentService {
  + RealDocumentService() 
  + displayDocument(String) void
}
class User {
  + User(String, boolean) 
  + isAdmin() boolean
  + getUsername() String
  + toString() String
}

DocumentProxy  ..>  DocumentService 
RealDocumentService  ..>  DocumentService 
