// ask user for repository to replicate
repo = userInput(name: "Repository to replicate:", type: "REPOSITORY")
// ask user for instances to replicate to
other = userInput(name: "Instances to replicate to:", type: "ARTIFACTORY", multivalued: true)