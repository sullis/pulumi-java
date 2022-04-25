// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TunnelInstanceIAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelInstanceIAMPolicyArgs Empty = new TunnelInstanceIAMPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

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
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private TunnelInstanceIAMPolicyArgs() {}

    private TunnelInstanceIAMPolicyArgs(TunnelInstanceIAMPolicyArgs $) {
        this.instance = $.instance;
        this.policyData = $.policyData;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelInstanceIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelInstanceIAMPolicyArgs $;

        public Builder() {
            $ = new TunnelInstanceIAMPolicyArgs();
        }

        public Builder(TunnelInstanceIAMPolicyArgs defaults) {
            $ = new TunnelInstanceIAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instance Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
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
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public TunnelInstanceIAMPolicyArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
