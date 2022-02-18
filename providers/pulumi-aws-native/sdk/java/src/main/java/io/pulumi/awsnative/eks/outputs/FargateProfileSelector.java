// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.outputs;

import io.pulumi.awsnative.eks.outputs.FargateProfileLabel;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FargateProfileSelector {
    private final @Nullable List<FargateProfileLabel> labels;
    private final String namespace;

    @OutputCustomType.Constructor({"labels","namespace"})
    private FargateProfileSelector(
        @Nullable List<FargateProfileLabel> labels,
        String namespace) {
        this.labels = labels;
        this.namespace = Objects.requireNonNull(namespace);
    }

    public List<FargateProfileLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FargateProfileSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FargateProfileLabel> labels;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(FargateProfileSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.namespace = defaults.namespace;
        }

        public Builder setLabels(@Nullable List<FargateProfileLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public FargateProfileSelector build() {
            return new FargateProfileSelector(labels, namespace);
        }
    }
}
