// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.macie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSessionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSessionArgs Empty = new GetSessionArgs();

    /**
     * AWS account ID of customer
     * 
     */
    @Import(name="awsAccountId", required=true)
    private Output<String> awsAccountId;

    /**
     * @return AWS account ID of customer
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }

    private GetSessionArgs() {}

    private GetSessionArgs(GetSessionArgs $) {
        this.awsAccountId = $.awsAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSessionArgs $;

        public Builder() {
            $ = new GetSessionArgs();
        }

        public Builder(GetSessionArgs defaults) {
            $ = new GetSessionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId AWS account ID of customer
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId AWS account ID of customer
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        public GetSessionArgs build() {
            $.awsAccountId = Objects.requireNonNull($.awsAccountId, "expected parameter 'awsAccountId' to be non-null");
            return $;
        }
    }

}
