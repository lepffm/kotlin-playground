# create kotlin projct with maven
`mvn archetype:generate -DarchetypeGroupId=org.jetbrains.kotlin -DarchetypeArtifactId=kotlin-archetype-jvm`

# environment
- kotlin 1.6.0 language ( github codespace limited)
- junit 5.9.2 test framework
- mockk 1.13.3 mock test library

# ide performance tunning
- use Shared-indexes
- use LightEdit mode
- Disable all unnecessary plugins
- increase memory 8G+
- Exclude folders and Unload modules
- Disable on-the-fly import management

reference) https://blog.jetbrains.com/kotlin/2021/06/simple-steps-for-improving-your-ide-performance/ 