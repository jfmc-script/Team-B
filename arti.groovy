name = userInput (
    type : "STRING",
    description : "Please provide Seervice name"
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