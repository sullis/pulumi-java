// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs Empty = new ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs();

    /**
     * Classification within a configuration.
     * 
     */
    @Import(name="classification")
      private final @Nullable Output<String> classification;

    public Output<String> classification() {
        return this.classification == null ? Codegen.empty() : this.classification;
    }

    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,Object>> properties;

    public Output<Map<String,Object>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs(
        @Nullable Output<String> classification,
        @Nullable Output<Map<String,Object>> properties) {
        this.classification = classification;
        this.properties = properties;
    }

    private ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs() {
        this.classification = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> classification;
        private @Nullable Output<Map<String,Object>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.properties = defaults.properties;
        }

        public Builder classification(@Nullable Output<String> classification) {
            this.classification = classification;
            return this;
        }
        public Builder classification(@Nullable String classification) {
            this.classification = Codegen.ofNullable(classification);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,Object> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs build() {
            return new ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs(classification, properties);
        }
    }
}
