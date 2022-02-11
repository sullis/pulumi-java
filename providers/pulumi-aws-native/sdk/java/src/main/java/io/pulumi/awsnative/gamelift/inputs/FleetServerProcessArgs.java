// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetServerProcessArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetServerProcessArgs Empty = new FleetServerProcessArgs();

    @InputImport(name="concurrentExecutions", required=true)
    private final Input<Integer> concurrentExecutions;

    public Input<Integer> getConcurrentExecutions() {
        return this.concurrentExecutions;
    }

    @InputImport(name="launchPath", required=true)
    private final Input<String> launchPath;

    public Input<String> getLaunchPath() {
        return this.launchPath;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<String> parameters;

    public Input<String> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public FleetServerProcessArgs(
        Input<Integer> concurrentExecutions,
        Input<String> launchPath,
        @Nullable Input<String> parameters) {
        this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions, "expected parameter 'concurrentExecutions' to be non-null");
        this.launchPath = Objects.requireNonNull(launchPath, "expected parameter 'launchPath' to be non-null");
        this.parameters = parameters;
    }

    private FleetServerProcessArgs() {
        this.concurrentExecutions = Input.empty();
        this.launchPath = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetServerProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> concurrentExecutions;
        private Input<String> launchPath;
        private @Nullable Input<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetServerProcessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentExecutions = defaults.concurrentExecutions;
    	      this.launchPath = defaults.launchPath;
    	      this.parameters = defaults.parameters;
        }

        public Builder setConcurrentExecutions(Input<Integer> concurrentExecutions) {
            this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions);
            return this;
        }

        public Builder setConcurrentExecutions(Integer concurrentExecutions) {
            this.concurrentExecutions = Input.of(Objects.requireNonNull(concurrentExecutions));
            return this;
        }

        public Builder setLaunchPath(Input<String> launchPath) {
            this.launchPath = Objects.requireNonNull(launchPath);
            return this;
        }

        public Builder setLaunchPath(String launchPath) {
            this.launchPath = Input.of(Objects.requireNonNull(launchPath));
            return this;
        }

        public Builder setParameters(@Nullable Input<String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public FleetServerProcessArgs build() {
            return new FleetServerProcessArgs(concurrentExecutions, launchPath, parameters);
        }
    }
}
