// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionLambdaFunctionAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionLambdaFunctionAssociationArgs Empty = new DistributionLambdaFunctionAssociationArgs();

    @InputImport(name="eventType")
    private final @Nullable Input<String> eventType;

    public Input<String> getEventType() {
        return this.eventType == null ? Input.empty() : this.eventType;
    }

    @InputImport(name="includeBody")
    private final @Nullable Input<Boolean> includeBody;

    public Input<Boolean> getIncludeBody() {
        return this.includeBody == null ? Input.empty() : this.includeBody;
    }

    @InputImport(name="lambdaFunctionARN")
    private final @Nullable Input<String> lambdaFunctionARN;

    public Input<String> getLambdaFunctionARN() {
        return this.lambdaFunctionARN == null ? Input.empty() : this.lambdaFunctionARN;
    }

    public DistributionLambdaFunctionAssociationArgs(
        @Nullable Input<String> eventType,
        @Nullable Input<Boolean> includeBody,
        @Nullable Input<String> lambdaFunctionARN) {
        this.eventType = eventType;
        this.includeBody = includeBody;
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    private DistributionLambdaFunctionAssociationArgs() {
        this.eventType = Input.empty();
        this.includeBody = Input.empty();
        this.lambdaFunctionARN = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLambdaFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eventType;
        private @Nullable Input<Boolean> includeBody;
        private @Nullable Input<String> lambdaFunctionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLambdaFunctionAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.includeBody = defaults.includeBody;
    	      this.lambdaFunctionARN = defaults.lambdaFunctionARN;
        }

        public Builder setEventType(@Nullable Input<String> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setEventType(@Nullable String eventType) {
            this.eventType = Input.ofNullable(eventType);
            return this;
        }

        public Builder setIncludeBody(@Nullable Input<Boolean> includeBody) {
            this.includeBody = includeBody;
            return this;
        }

        public Builder setIncludeBody(@Nullable Boolean includeBody) {
            this.includeBody = Input.ofNullable(includeBody);
            return this;
        }

        public Builder setLambdaFunctionARN(@Nullable Input<String> lambdaFunctionARN) {
            this.lambdaFunctionARN = lambdaFunctionARN;
            return this;
        }

        public Builder setLambdaFunctionARN(@Nullable String lambdaFunctionARN) {
            this.lambdaFunctionARN = Input.ofNullable(lambdaFunctionARN);
            return this;
        }

        public DistributionLambdaFunctionAssociationArgs build() {
            return new DistributionLambdaFunctionAssociationArgs(eventType, includeBody, lambdaFunctionARN);
        }
    }
}
