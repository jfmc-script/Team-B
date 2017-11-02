artifactory('Denver'){
localRepository("my-repository") {
  packageType userInput (
    type : "STRING",
    value : "This is a generic description",
    description : "Please provide a description"
  )
}
}