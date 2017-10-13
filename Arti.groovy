stringInput = userInput (
    type : "STRING", // "BOOLEAN", "INTEGER", "INSTANCE", "REPOSITORY"
    description : "String input"
)

booleanInput = userInput (
    type : "BOOLEAN", //"INTEGER", "INSTANCE", "REPOSITORY"
    description : "Boolean input"
)

integerInput = userInput (
    type : "INTEGER", //"INSTANCE", "REPOSITORY"
    description : "Integer input"
)

instanceInput = userInput (
    type : "INSTANCE", // "REPOSITORY"
    description : "Instance input"
)

repositoryInput = userInput (
    type : "REPOSITORY",
    description : "Repository input"
)