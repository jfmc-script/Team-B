artifactory('Denver'){
localRepository("my-repository") {
  packageType userInput (
    type : "STRING",
    value : "Insert the pacakge type ",
    description : "Please provide a pacakge type "
  )
}
}