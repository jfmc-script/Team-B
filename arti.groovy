name = userInput (
    type : "STRING",
    value : "This is a generic description",
    description : "Please provide a repository name"
  )
artifactory(name){
localRepository("my-repository") {
  description userInput (
    type : "STRING",
    value : "This is a generic description",
    description : "Please provide a description"
  )
}
}