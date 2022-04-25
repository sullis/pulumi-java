// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.aws.organizations.inputs.OrganizationRootPolicyTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationRootArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationRootArgs Empty = new OrganizationRootArgs();

    /**
     * ARN of the root
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the root
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Identifier of the root
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identifier of the root
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the policy type
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy type
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    @Import(name="policyTypes")
    private @Nullable Output<List<OrganizationRootPolicyTypeArgs>> policyTypes;

    /**
     * @return List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    public Optional<Output<List<OrganizationRootPolicyTypeArgs>>> policyTypes() {
        return Optional.ofNullable(this.policyTypes);
    }

    private OrganizationRootArgs() {}

    private OrganizationRootArgs(OrganizationRootArgs $) {
        this.arn = $.arn;
        this.id = $.id;
        this.name = $.name;
        this.policyTypes = $.policyTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationRootArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationRootArgs $;

        public Builder() {
            $ = new OrganizationRootArgs();
        }

        public Builder(OrganizationRootArgs defaults) {
            $ = new OrganizationRootArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the root
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the root
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param id Identifier of the root
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the root
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the policy type
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy type
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyTypes List of policy types enabled for this root. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder policyTypes(@Nullable Output<List<OrganizationRootPolicyTypeArgs>> policyTypes) {
            $.policyTypes = policyTypes;
            return this;
        }

        /**
         * @param policyTypes List of policy types enabled for this root. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder policyTypes(List<OrganizationRootPolicyTypeArgs> policyTypes) {
            return policyTypes(Output.of(policyTypes));
        }

        /**
         * @param policyTypes List of policy types enabled for this root. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder policyTypes(OrganizationRootPolicyTypeArgs... policyTypes) {
            return policyTypes(List.of(policyTypes));
        }

        public OrganizationRootArgs build() {
            return $;
        }
    }

}
