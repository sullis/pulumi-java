// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SimulationApplicationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimulationApplicationVersionArgs Empty = new SimulationApplicationVersionArgs();

    @Import(name="application", required=true)
      private final Output<String> application;

    public Output<String> application() {
        return this.application;
    }

    /**
     * The revision ID of robot application.
     * 
     */
    @Import(name="currentRevisionId")
      private final @Nullable Output<String> currentRevisionId;

    public Output<String> currentRevisionId() {
        return this.currentRevisionId == null ? Codegen.empty() : this.currentRevisionId;
    }

    public SimulationApplicationVersionArgs(
        Output<String> application,
        @Nullable Output<String> currentRevisionId) {
        this.application = Objects.requireNonNull(application, "expected parameter 'application' to be non-null");
        this.currentRevisionId = currentRevisionId;
    }

    private SimulationApplicationVersionArgs() {
        this.application = Codegen.empty();
        this.currentRevisionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> application;
        private @Nullable Output<String> currentRevisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.currentRevisionId = defaults.currentRevisionId;
        }

        public Builder application(Output<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }
        public Builder application(String application) {
            this.application = Output.of(Objects.requireNonNull(application));
            return this;
        }
        public Builder currentRevisionId(@Nullable Output<String> currentRevisionId) {
            this.currentRevisionId = currentRevisionId;
            return this;
        }
        public Builder currentRevisionId(@Nullable String currentRevisionId) {
            this.currentRevisionId = Codegen.ofNullable(currentRevisionId);
            return this;
        }        public SimulationApplicationVersionArgs build() {
            return new SimulationApplicationVersionArgs(application, currentRevisionId);
        }
    }
}
