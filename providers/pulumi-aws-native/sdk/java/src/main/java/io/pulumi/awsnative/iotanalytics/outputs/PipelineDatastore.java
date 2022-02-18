// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PipelineDatastore {
    private final String datastoreName;
    private final String name;

    @OutputCustomType.Constructor({"datastoreName","name"})
    private PipelineDatastore(
        String datastoreName,
        String name) {
        this.datastoreName = Objects.requireNonNull(datastoreName);
        this.name = Objects.requireNonNull(name);
    }

    public String getDatastoreName() {
        return this.datastoreName;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDatastore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datastoreName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDatastore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreName = defaults.datastoreName;
    	      this.name = defaults.name;
        }

        public Builder setDatastoreName(String datastoreName) {
            this.datastoreName = Objects.requireNonNull(datastoreName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public PipelineDatastore build() {
            return new PipelineDatastore(datastoreName, name);
        }
    }
}
