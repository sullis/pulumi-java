// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionDefaultCacheBehaviorFunctionAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionDefaultCacheBehaviorFunctionAssociationArgs Empty = new DistributionDefaultCacheBehaviorFunctionAssociationArgs();

    /**
     * The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    @Import(name="eventType", required=true)
    private Output<String> eventType;

    /**
     * @return The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    public Output<String> eventType() {
        return this.eventType;
    }

    /**
     * ARN of the Cloudfront function.
     * 
     */
    @Import(name="functionArn", required=true)
    private Output<String> functionArn;

    /**
     * @return ARN of the Cloudfront function.
     * 
     */
    public Output<String> functionArn() {
        return this.functionArn;
    }

    private DistributionDefaultCacheBehaviorFunctionAssociationArgs() {}

    private DistributionDefaultCacheBehaviorFunctionAssociationArgs(DistributionDefaultCacheBehaviorFunctionAssociationArgs $) {
        this.eventType = $.eventType;
        this.functionArn = $.functionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionDefaultCacheBehaviorFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionDefaultCacheBehaviorFunctionAssociationArgs $;

        public Builder() {
            $ = new DistributionDefaultCacheBehaviorFunctionAssociationArgs();
        }

        public Builder(DistributionDefaultCacheBehaviorFunctionAssociationArgs defaults) {
            $ = new DistributionDefaultCacheBehaviorFunctionAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventType The specific event to trigger this function.
         * Valid values: `viewer-request` or `viewer-response`
         * 
         * @return builder
         * 
         */
        public Builder eventType(Output<String> eventType) {
            $.eventType = eventType;
            return this;
        }

        /**
         * @param eventType The specific event to trigger this function.
         * Valid values: `viewer-request` or `viewer-response`
         * 
         * @return builder
         * 
         */
        public Builder eventType(String eventType) {
            return eventType(Output.of(eventType));
        }

        /**
         * @param functionArn ARN of the Cloudfront function.
         * 
         * @return builder
         * 
         */
        public Builder functionArn(Output<String> functionArn) {
            $.functionArn = functionArn;
            return this;
        }

        /**
         * @param functionArn ARN of the Cloudfront function.
         * 
         * @return builder
         * 
         */
        public Builder functionArn(String functionArn) {
            return functionArn(Output.of(functionArn));
        }

        public DistributionDefaultCacheBehaviorFunctionAssociationArgs build() {
            $.eventType = Objects.requireNonNull($.eventType, "expected parameter 'eventType' to be non-null");
            $.functionArn = Objects.requireNonNull($.functionArn, "expected parameter 'functionArn' to be non-null");
            return $;
        }
    }

}
