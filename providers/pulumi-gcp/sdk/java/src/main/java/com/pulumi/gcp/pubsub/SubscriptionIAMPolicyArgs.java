// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionIAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionIAMPolicyArgs Empty = new SubscriptionIAMPolicyArgs();

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The subscription name or id to bind to attach IAM policy to.
     * 
     */
    @Import(name="subscription", required=true)
    private Output<String> subscription;

    /**
     * @return The subscription name or id to bind to attach IAM policy to.
     * 
     */
    public Output<String> subscription() {
        return this.subscription;
    }

    private SubscriptionIAMPolicyArgs() {}

    private SubscriptionIAMPolicyArgs(SubscriptionIAMPolicyArgs $) {
        this.policyData = $.policyData;
        this.project = $.project;
        this.subscription = $.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionIAMPolicyArgs $;

        public Builder() {
            $ = new SubscriptionIAMPolicyArgs();
        }

        public Builder(SubscriptionIAMPolicyArgs defaults) {
            $ = new SubscriptionIAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param subscription The subscription name or id to bind to attach IAM policy to.
         * 
         * @return builder
         * 
         */
        public Builder subscription(Output<String> subscription) {
            $.subscription = subscription;
            return this;
        }

        /**
         * @param subscription The subscription name or id to bind to attach IAM policy to.
         * 
         * @return builder
         * 
         */
        public Builder subscription(String subscription) {
            return subscription(Output.of(subscription));
        }

        public SubscriptionIAMPolicyArgs build() {
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            $.subscription = Objects.requireNonNull($.subscription, "expected parameter 'subscription' to be non-null");
            return $;
        }
    }

}
