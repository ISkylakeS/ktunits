import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.publish.bintray

val p = project {

    name = "ktunits"
    group = "me.sargunvohra.lib"
    artifactId = name
    version = "1.1.1"

    dependencies {
    	compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.2")
    }

    dependenciesTest {
    	compile("org.jetbrains.kotlin:kotlin-test:1.0.2")
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
