// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRobotSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRobotSoftwareSuiteVersion;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about a robot software suite.
 * 
 */
public final class SimulationApplicationRobotSoftwareSuiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimulationApplicationRobotSoftwareSuiteArgs Empty = new SimulationApplicationRobotSoftwareSuiteArgs();

    /**
     * The name of the robot software suite.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<SimulationApplicationRobotSoftwareSuiteName> name;

    public Input<SimulationApplicationRobotSoftwareSuiteName> getName() {
        return this.name;
    }

    /**
     * The version of the robot software suite.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<SimulationApplicationRobotSoftwareSuiteVersion> version;

    public Input<SimulationApplicationRobotSoftwareSuiteVersion> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public SimulationApplicationRobotSoftwareSuiteArgs(
        Input<SimulationApplicationRobotSoftwareSuiteName> name,
        @Nullable Input<SimulationApplicationRobotSoftwareSuiteVersion> version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private SimulationApplicationRobotSoftwareSuiteArgs() {
        this.name = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationRobotSoftwareSuiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SimulationApplicationRobotSoftwareSuiteName> name;
        private @Nullable Input<SimulationApplicationRobotSoftwareSuiteVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationRobotSoftwareSuiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(Input<SimulationApplicationRobotSoftwareSuiteName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(SimulationApplicationRobotSoftwareSuiteName name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setVersion(@Nullable Input<SimulationApplicationRobotSoftwareSuiteVersion> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable SimulationApplicationRobotSoftwareSuiteVersion version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public SimulationApplicationRobotSoftwareSuiteArgs build() {
            return new SimulationApplicationRobotSoftwareSuiteArgs(name, version);
        }
    }
}
