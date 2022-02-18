// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationRenderingEngine;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationRobotSoftwareSuite;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationSimulationSoftwareSuite;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationSourceConfig;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationTags;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSimulationApplicationResult {
    private final @Nullable String arn;
    /**
     * The current revision id.
     * 
     */
    private final @Nullable String currentRevisionId;
    /**
     * The URI of the Docker image for the robot application.
     * 
     */
    private final @Nullable String environment;
    /**
     * The rendering engine for the simulation application.
     * 
     */
    private final @Nullable SimulationApplicationRenderingEngine renderingEngine;
    /**
     * The robot software suite used by the simulation application.
     * 
     */
    private final @Nullable SimulationApplicationRobotSoftwareSuite robotSoftwareSuite;
    /**
     * The simulation software suite used by the simulation application.
     * 
     */
    private final @Nullable SimulationApplicationSimulationSoftwareSuite simulationSoftwareSuite;
    /**
     * The sources of the simulation application.
     * 
     */
    private final @Nullable List<SimulationApplicationSourceConfig> sources;
    private final @Nullable SimulationApplicationTags tags;

    @OutputCustomType.Constructor({"arn","currentRevisionId","environment","renderingEngine","robotSoftwareSuite","simulationSoftwareSuite","sources","tags"})
    private GetSimulationApplicationResult(
        @Nullable String arn,
        @Nullable String currentRevisionId,
        @Nullable String environment,
        @Nullable SimulationApplicationRenderingEngine renderingEngine,
        @Nullable SimulationApplicationRobotSoftwareSuite robotSoftwareSuite,
        @Nullable SimulationApplicationSimulationSoftwareSuite simulationSoftwareSuite,
        @Nullable List<SimulationApplicationSourceConfig> sources,
        @Nullable SimulationApplicationTags tags) {
        this.arn = arn;
        this.currentRevisionId = currentRevisionId;
        this.environment = environment;
        this.renderingEngine = renderingEngine;
        this.robotSoftwareSuite = robotSoftwareSuite;
        this.simulationSoftwareSuite = simulationSoftwareSuite;
        this.sources = sources;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The current revision id.
     * 
     */
    public Optional<String> getCurrentRevisionId() {
        return Optional.ofNullable(this.currentRevisionId);
    }
    /**
     * The URI of the Docker image for the robot application.
     * 
     */
    public Optional<String> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * The rendering engine for the simulation application.
     * 
     */
    public Optional<SimulationApplicationRenderingEngine> getRenderingEngine() {
        return Optional.ofNullable(this.renderingEngine);
    }
    /**
     * The robot software suite used by the simulation application.
     * 
     */
    public Optional<SimulationApplicationRobotSoftwareSuite> getRobotSoftwareSuite() {
        return Optional.ofNullable(this.robotSoftwareSuite);
    }
    /**
     * The simulation software suite used by the simulation application.
     * 
     */
    public Optional<SimulationApplicationSimulationSoftwareSuite> getSimulationSoftwareSuite() {
        return Optional.ofNullable(this.simulationSoftwareSuite);
    }
    /**
     * The sources of the simulation application.
     * 
     */
    public List<SimulationApplicationSourceConfig> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    public Optional<SimulationApplicationTags> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSimulationApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String currentRevisionId;
        private @Nullable String environment;
        private @Nullable SimulationApplicationRenderingEngine renderingEngine;
        private @Nullable SimulationApplicationRobotSoftwareSuite robotSoftwareSuite;
        private @Nullable SimulationApplicationSimulationSoftwareSuite simulationSoftwareSuite;
        private @Nullable List<SimulationApplicationSourceConfig> sources;
        private @Nullable SimulationApplicationTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSimulationApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.currentRevisionId = defaults.currentRevisionId;
    	      this.environment = defaults.environment;
    	      this.renderingEngine = defaults.renderingEngine;
    	      this.robotSoftwareSuite = defaults.robotSoftwareSuite;
    	      this.simulationSoftwareSuite = defaults.simulationSoftwareSuite;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCurrentRevisionId(@Nullable String currentRevisionId) {
            this.currentRevisionId = currentRevisionId;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }

        public Builder setRenderingEngine(@Nullable SimulationApplicationRenderingEngine renderingEngine) {
            this.renderingEngine = renderingEngine;
            return this;
        }

        public Builder setRobotSoftwareSuite(@Nullable SimulationApplicationRobotSoftwareSuite robotSoftwareSuite) {
            this.robotSoftwareSuite = robotSoftwareSuite;
            return this;
        }

        public Builder setSimulationSoftwareSuite(@Nullable SimulationApplicationSimulationSoftwareSuite simulationSoftwareSuite) {
            this.simulationSoftwareSuite = simulationSoftwareSuite;
            return this;
        }

        public Builder setSources(@Nullable List<SimulationApplicationSourceConfig> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setTags(@Nullable SimulationApplicationTags tags) {
            this.tags = tags;
            return this;
        }

        public GetSimulationApplicationResult build() {
            return new GetSimulationApplicationResult(arn, currentRevisionId, environment, renderingEngine, robotSoftwareSuite, simulationSoftwareSuite, sources, tags);
        }
    }
}
