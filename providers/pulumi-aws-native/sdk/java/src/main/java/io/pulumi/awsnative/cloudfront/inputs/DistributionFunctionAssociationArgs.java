// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionFunctionAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionFunctionAssociationArgs Empty = new DistributionFunctionAssociationArgs();

    @InputImport(name="eventType")
    private final @Nullable Input<String> eventType;

    public Input<String> getEventType() {
        return this.eventType == null ? Input.empty() : this.eventType;
    }

    @InputImport(name="functionARN")
    private final @Nullable Input<String> functionARN;

    public Input<String> getFunctionARN() {
        return this.functionARN == null ? Input.empty() : this.functionARN;
    }

    public DistributionFunctionAssociationArgs(
        @Nullable Input<String> eventType,
        @Nullable Input<String> functionARN) {
        this.eventType = eventType;
        this.functionARN = functionARN;
    }

    private DistributionFunctionAssociationArgs() {
        this.eventType = Input.empty();
        this.functionARN = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eventType;
        private @Nullable Input<String> functionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionFunctionAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionARN = defaults.functionARN;
        }

        public Builder setEventType(@Nullable Input<String> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setEventType(@Nullable String eventType) {
            this.eventType = Input.ofNullable(eventType);
            return this;
        }

        public Builder setFunctionARN(@Nullable Input<String> functionARN) {
            this.functionARN = functionARN;
            return this;
        }

        public Builder setFunctionARN(@Nullable String functionARN) {
            this.functionARN = Input.ofNullable(functionARN);
            return this;
        }

        public DistributionFunctionAssociationArgs build() {
            return new DistributionFunctionAssociationArgs(eventType, functionARN);
        }
    }
}
