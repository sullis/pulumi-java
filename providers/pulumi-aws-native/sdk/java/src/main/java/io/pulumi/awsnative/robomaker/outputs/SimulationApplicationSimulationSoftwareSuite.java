// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteVersion;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SimulationApplicationSimulationSoftwareSuite {
    private final SimulationApplicationSimulationSoftwareSuiteName name;
    private final @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

    @OutputCustomType.Constructor({"name","version"})
    private SimulationApplicationSimulationSoftwareSuite(
        SimulationApplicationSimulationSoftwareSuiteName name,
        @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
        this.name = Objects.requireNonNull(name);
        this.version = version;
    }

    public SimulationApplicationSimulationSoftwareSuiteName getName() {
        return this.name;
    }
    public Optional<SimulationApplicationSimulationSoftwareSuiteVersion> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationSimulationSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationSimulationSoftwareSuiteName name;
        private @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationSimulationSoftwareSuite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(SimulationApplicationSimulationSoftwareSuiteName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(@Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
            this.version = version;
            return this;
        }

        public SimulationApplicationSimulationSoftwareSuite build() {
            return new SimulationApplicationSimulationSoftwareSuite(name, version);
        }
    }
}
