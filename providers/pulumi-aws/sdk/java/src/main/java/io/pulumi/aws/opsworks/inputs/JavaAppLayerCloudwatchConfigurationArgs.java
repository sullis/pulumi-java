// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.JavaAppLayerCloudwatchConfigurationLogStreamArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JavaAppLayerCloudwatchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JavaAppLayerCloudwatchConfigurationArgs Empty = new JavaAppLayerCloudwatchConfigurationArgs();

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    @Import(name="logStreams")
      private final @Nullable Output<List<JavaAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

    public Output<List<JavaAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams() {
        return this.logStreams == null ? Codegen.empty() : this.logStreams;
    }

    public JavaAppLayerCloudwatchConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<JavaAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private JavaAppLayerCloudwatchConfigurationArgs() {
        this.enabled = Codegen.empty();
        this.logStreams = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JavaAppLayerCloudwatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<JavaAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(JavaAppLayerCloudwatchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder logStreams(@Nullable Output<List<JavaAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public Builder logStreams(@Nullable List<JavaAppLayerCloudwatchConfigurationLogStreamArgs> logStreams) {
            this.logStreams = Codegen.ofNullable(logStreams);
            return this;
        }
        public Builder logStreams(JavaAppLayerCloudwatchConfigurationLogStreamArgs... logStreams) {
            return logStreams(List.of(logStreams));
        }        public JavaAppLayerCloudwatchConfigurationArgs build() {
            return new JavaAppLayerCloudwatchConfigurationArgs(enabled, logStreams);
        }
    }
}
