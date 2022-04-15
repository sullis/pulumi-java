// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionFunctionAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionFunctionAssociationArgs Empty = new DistributionFunctionAssociationArgs();

    @Import(name="eventType")
      private final @Nullable Output<String> eventType;

    public Output<String> eventType() {
        return this.eventType == null ? Codegen.empty() : this.eventType;
    }

    @Import(name="functionARN")
      private final @Nullable Output<String> functionARN;

    public Output<String> functionARN() {
        return this.functionARN == null ? Codegen.empty() : this.functionARN;
    }

    public DistributionFunctionAssociationArgs(
        @Nullable Output<String> eventType,
        @Nullable Output<String> functionARN) {
        this.eventType = eventType;
        this.functionARN = functionARN;
    }

    private DistributionFunctionAssociationArgs() {
        this.eventType = Codegen.empty();
        this.functionARN = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eventType;
        private @Nullable Output<String> functionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionFunctionAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionARN = defaults.functionARN;
        }

        public Builder eventType(@Nullable Output<String> eventType) {
            this.eventType = eventType;
            return this;
        }
        public Builder eventType(@Nullable String eventType) {
            this.eventType = Codegen.ofNullable(eventType);
            return this;
        }
        public Builder functionARN(@Nullable Output<String> functionARN) {
            this.functionARN = functionARN;
            return this;
        }
        public Builder functionARN(@Nullable String functionARN) {
            this.functionARN = Codegen.ofNullable(functionARN);
            return this;
        }        public DistributionFunctionAssociationArgs build() {
            return new DistributionFunctionAssociationArgs(eventType, functionARN);
        }
    }
}
