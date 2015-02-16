import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by dave on 16/02/15.
 */
class SomeCycles implements Plugin<Project> {
    @Override
    void apply(Project target) {
        target.tasks.create(name:'SomeCycles',dependsOn: ['compileJava']) << {
            println "Dodge this!"
        }
        target.extensions.create('SomeCycles', SomeCyclesExtension.class)
    }
}
