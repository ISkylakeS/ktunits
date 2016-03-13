import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.publish.bintray

val repos = repos()


val p = project {

    name = "KtUnits"
    group = "me.sargunvohra.lib"
    artifactId = name
    version = "1.1.0"

    sourceDirectories {
        path("src/main/kotlin")
    }

    sourceDirectoriesTest {
        path("src/test/kotlin")
    }

    dependencies {
    	compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    }

    dependenciesTest {
    	compile("org.jetbrains.kotlin:kotlin-test:1.0.0")
        compile("org.testng:testng:6.9.9")
    }

    assemble {
        jar {
        }
        mavenJars {
        }
    }

    bintray {
        publish = true
    }
}
