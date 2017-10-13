//repo = userInput(name: "Repository to replicate:", type: "REPOSITORY")
//other = userInput(name: "Instances to replicate to:", type: "INSTANCE", multivalued: true)

artifactory("Art-1") {
localRepository("docker-local-a") {
  packageType "docker"
  description "My local Docker registry-vvvvvv"
}
}