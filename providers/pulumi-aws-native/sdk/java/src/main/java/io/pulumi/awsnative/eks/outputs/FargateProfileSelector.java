// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.outputs;

import io.pulumi.awsnative.eks.outputs.FargateProfileLabel;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FargateProfileSelector {
    private final @Nullable List<FargateProfileLabel> labels;
    private final String namespace;

    @CustomType.Constructor
    private FargateProfileSelector(
        @CustomType.Parameter("labels") @Nullable List<FargateProfileLabel> labels,
        @CustomType.Parameter("namespace") String namespace) {
        this.labels = labels;
        this.namespace = namespace;
    }

    public List<FargateProfileLabel> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public String namespace() {
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

        public Builder labels(@Nullable List<FargateProfileLabel> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(FargateProfileLabel... labels) {
            return labels(List.of(labels));
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public FargateProfileSelector build() {
            return new FargateProfileSelector(labels, namespace);
        }
    }
}
