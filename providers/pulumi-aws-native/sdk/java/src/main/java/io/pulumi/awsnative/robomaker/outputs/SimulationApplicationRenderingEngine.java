// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRenderingEngineName;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SimulationApplicationRenderingEngine {
    /**
     * The name of the rendering engine.
     * 
     */
    private final SimulationApplicationRenderingEngineName name;
    /**
     * The version of the rendering engine.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"name","version"})
    private SimulationApplicationRenderingEngine(
        SimulationApplicationRenderingEngineName name,
        String version) {
        this.name = Objects.requireNonNull(name);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The name of the rendering engine.
     * 
     */
    public SimulationApplicationRenderingEngineName getName() {
        return this.name;
    }
    /**
     * The version of the rendering engine.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationRenderingEngine defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationRenderingEngineName name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationRenderingEngine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(SimulationApplicationRenderingEngineName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public SimulationApplicationRenderingEngine build() {
            return new SimulationApplicationRenderingEngine(name, version);
        }
    }
}
